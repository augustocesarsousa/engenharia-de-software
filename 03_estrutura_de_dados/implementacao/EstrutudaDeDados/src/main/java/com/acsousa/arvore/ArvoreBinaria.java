package com.acsousa.arvore;

import com.acsousa.lista.ListaEstatica;
import com.acsousa.mapa.Mapa;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArvoreBinaria<C, V> implements Mapa<C, V> {
    private Comparator<C> comparator;
    private No<C, V> raiz;
    private int tamanho = 0;
    public ArvoreBinaria(Comparator<C> comparator) {
        this.comparator = comparator;
    }

    private static class No<C, V> {
        Par<C, V> par;
        No<C, V> esquerda;
        No<C, V> direita;

        No(C c, V v) {
            this.par = new Par<>(c, v);
        }

        boolean isFolha() {
            return esquerda == null && direita == null;
        }
    }
    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean isVazio() {
        return raiz == null;
    }

    @Override
    public V adicionar(C chave, V valor) {
        //1. Sem nós? Adiciona a raiz
        if (isVazio()) {
            raiz = new No<>(chave, valor);
            tamanho = tamanho + 1;
            return null;
        }
        //2. Busca pelo nó correspondente à chave
        var nos = acharNos(chave);
        //3. Encontrou? Só substitui o valor
        if (nos.cmp == 0) return nos.no.par.setValor(valor);
        //4. Não encontrou? Adiciona de acordo com a última comparação
        if (nos.cmp < 0) nos.pai.esquerda = new No<>(chave, valor);
        else nos.pai.direita = new No<>(chave, valor);
        tamanho = tamanho + 1;
        return null;
    }

    @Override
    public void limpar() {
        raiz = null;
    }

    @Override
    public V remover(C chave) {
        var nos = acharNos(chave);
        if (nos.no == null) {
            return null;
        }

        //Exclusão de folhas
        var retorno = nos.no.par.getValor();

        //Não há filhos
        if (nos.no.isFolha()) {
            if (nos.isRaiz()) {
                raiz = null;
            } else if (nos.isEsquerda()) {
                nos.pai.esquerda = null;
            } else {
                nos.pai.direita = null;
            }
        }

        //Exclusão de nós com um filho

        //Somente um filho?
        else if (nos.no.direita == null || nos.no.esquerda == null) {
            //Obtém esse filho
            var no = nos.no.direita == null ?
                    nos.no.esquerda : nos.no.direita;
            //Substitui a raiz, ou associa ao pai, mantendo o lado
            if (nos.isRaiz()) {
                raiz = no;
            } else if (nos.isEsquerda()) {
                nos.pai.esquerda = no;
            } else {
                nos.pai.direita = no;
            }

            //Exclusão de um nó com dois filhos
        } else { //Dois filhos?
            var sucessor = acharSucessor(nos.no);
            nos.no.par = sucessor.no.par;
            if (sucessor.no == nos.no.direita) {
                nos.no.direita = sucessor.no.direita;
            } else {
                sucessor.pai.esquerda = sucessor.no.direita;
            }
        }
        return null;
    }

    @Override
    public V get(C chave) {
        var nos = acharNos(chave);
        return nos.no == null ? null : nos.no.par.getValor();
    }

    @Override
    public boolean contem(C chave) {
        return acharNos(chave).no != null;
    }

    @Override
    public Iterator<Par<C, V>> iterator() {
        var lista = new ListaEstatica<Par<C,V>>(getTamanho());
        emOrdem(raiz, lista::adicionar);
        return new ArvoreIterator(lista.iterator());
    }

    private static class NosRetorno<C, V> {
        No<C, V> pai;
        No<C, V> no;
        int cmp;
        public boolean isRaiz() {
            return pai == null;
        }
        public boolean isEsquerda() {
            return pai != null && pai.esquerda == no;
        }
    }

    private NosRetorno<C, V> acharNos(C chave) {
        var ret = new NosRetorno<C, V>();
        ret.no = raiz; //1. Inicie pela raiz
        while(ret.no != null) { //2. O nó atual é nulo?
            //3. Compare a chave com do nó
            ret.cmp = comparator.compare(chave, ret.no.par.getChave());
            if (ret.cmp == 0) {
                return ret; //Se for igual, encontrou.
            }
            //Se não for, o nó atual será considerado o novo pai
            ret.pai = ret.no;
            //O próximo nó é definido indo para esquerda ou direta
            ret.no = ret.cmp < 0 ? ret.no.esquerda : ret.no.direita;
        }
        //Não encontrou.
        return ret;
    }

    private NosRetorno<C, V> acharSucessor(No<C, V> no) {
        var ret = new NosRetorno<C, V>();
        ret.pai = no;
        ret.no = no.direita;
        while (ret.no.esquerda != null) {
            ret.pai = ret.no;
            ret.no = ret.no.esquerda;
        }
        return ret;
    }

    private void emOrdem(No<C, V> no, Consumer<Par<C, V>> consumer) {
        if (no == null) return;
        emOrdem(no.esquerda, consumer);
        consumer.accept(no.par);
        emOrdem(no.direita, consumer);
    }

    public void emOrdem(Consumer<Par<C, V>> consumer) {
        emOrdem(raiz, consumer);
    }

    private class ArvoreIterator implements Iterator<Par<C, V>> {
        C ultimo = null;
        Iterator<Par<C, V>> it;
        public ArvoreIterator(Iterator<Par<C, V>> it) {
            this.it = it;
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public Par<C, V> next() {
            var par = it.next();
            ultimo = par.getChave();
            return par;
        }

        @Override
        public void remove() {
            remover(ultimo);
        }
    }
}
