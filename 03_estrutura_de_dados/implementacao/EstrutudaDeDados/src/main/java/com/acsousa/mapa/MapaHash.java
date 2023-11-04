package com.acsousa.mapa;

import com.acsousa.lista.ListaEncadeada;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MapaHash<C, V> implements Mapa<C, V> {
    private ListaEncadeada<Par<C, V>>[] buckets;
    private int tamanho;
    private double fatorCarga;

    public MapaHash() {
        this(16, 0.75);
    }

    public MapaHash(int nrBuckets, double fatorCarga) {
        this.fatorCarga = fatorCarga;
        buckets = criarBuckets(nrBuckets);
    }

    protected ListaEncadeada<Par<C, V>>[] criarBuckets(int tamanho) {
        var buckets = new ListaEncadeada[tamanho];
        for (var i = 0; i < buckets.length; i++) {
            buckets[i] = new ListaEncadeada<>();
        }
        return buckets;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean isVazio() {
        return tamanho == 0;
    }

    public double getCarga() {
        return (double) tamanho / buckets.length;
    }

    public double getFatorCarga() {
        return fatorCarga;
    }

    @Override
    public V adicionar(C chave, V valor) {
        var local = acharPar(chave);
        if (local.naoAchou()) {
            local.adicionar(chave, valor);
            tamanho = tamanho + 1;
            if (getCarga() > fatorCarga) {
                rehash();
            }
            return null;
        }
        return local.setValor(valor);
    }

    private void rehash() {
        var novosBuckets = criarBuckets(buckets.length * 2);
        for (var par : entradas()) {
            var idx = reduzir(
                    par.getChave().hashCode(), novosBuckets.length);
            novosBuckets[idx].adicionar(par);
        }
        buckets = novosBuckets;
    }

    @Override
    public void limpar() {
        for (var bucket : buckets) {
            bucket.limpar();;
        }
    }

    @Override
    public V remover(C chave) {
        //Tentamos localizar o par a ser removido
        var local = acharPar(chave);
        //Se não achar, retorna nulo
        if (local.naoAchou()) {
            return null;
        }
        //Remove da lista onde foi encontrado
        local.remover();
        tamanho--;
        //Retorna o valor recém removido
        return local.getValor();
    }

    @Override
    public V get(C chave) {
        return acharPar(chave).getValor();
    }

    @Override
    public boolean contem(C chave) {
        return !acharPar(chave).naoAchou();
    }

    @Override
    public Iterator<Par<C, V>> iterator() {
        return new IteradorMapa();
    }

    public Localizacao<C, V> acharPar(C chave) {
        var local = new Localizacao<C, V>();

        //Obtemos o bucket
        int idx = reduzir(chave.hashCode(), buckets.length);
        local.bucket = buckets[idx];

        //Iteramos em busca da chave
        var it = local.bucket.iterator();
        while (it.hasNext()) {
            var par = it.next();
            //Caso a chave seja encontrada atualizamos
            //os dados de iterator e par
            if (par.getChave().equals(chave)) {
                local.iterator = it;
                local.par = par;
                break;
            }
        }
        return local;
    }

    private static class Localizacao<C, V> {
        private ListaEncadeada<Par<C, V>> bucket;
        private Iterator<Par<C, V>> iterator;
        private Par<C, V> par;

        public boolean naoAchou() { return par == null; }
        public V getValor() { return par == null ? null : par.getValor(); }
        public V setValor(V valor) { return par.setValor(valor); }
        public void remover() { iterator.remove(); }
        public void adicionar(C chave, V valor) {
            bucket.adicionar(new Par<>(chave, valor));
        }
    }

    private static int reduzir(int hash, int tamanho) {
        return Math.abs(hash % tamanho);
    }

    private class IteradorMapa implements Iterator<Par<C, V>> {
        int i = -1;
        int cont = 0;
        Iterator<Par<C, V>> iterator = null;

        @Override
        public boolean hasNext() {
            return cont < tamanho;
        }

        @Override
        public Par<C, V> next() {
            if (!hasNext()) throw new NoSuchElementException();

            //Passo 1: Caso já haja um iterador com elementos
            //avança e retorna o elemento
            if (iterator != null && iterator.hasNext()) {
                cont = cont + 1;
                return iterator.next();
            }

            //Passo 2: Busca uma lista com elementos
            while (buckets[++i].isVazia());

            //Atualiza o iterador e retorna seu primeiro
            //elemento
            iterator = buckets[i].iterator();
            cont = cont + 1;
            return iterator.next();
        }

        @Override
        public void remove() {
            iterator.remove();
            tamanho--;
            cont--;
        }
    }
}
