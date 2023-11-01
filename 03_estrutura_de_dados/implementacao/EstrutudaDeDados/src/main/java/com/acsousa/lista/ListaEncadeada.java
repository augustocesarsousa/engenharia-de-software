package com.acsousa.lista;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class ListaEncadeada<T> implements Lista<T>{
    private static class No<T> {
        No<T> anterior;
        T dado;
        No<T> proximo;
        public No(T valor) {
            dado = valor;
        }
    }
    private No<T> base = null;
    private No<T> topo = null;
    private int tamanho = 0;

    @Override
    public boolean isVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean isCheia() {
        return false;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public Integer getCapacidade() {
        return null;
    }

    @Override
    public void adicionar(T valor) {
        var no = new No<T>(valor);

        if (isVazia()) {
            base = no;
        } else {
            no.anterior = topo; //1
            topo.proximo = no; //2
        }

        topo = no; //3
        tamanho = tamanho + 1; //3
    }

    @Override
    public void adicionar(int pos, T valor) {
        Objects.checkIndex(pos, getTamanho()+1);

        //Adicionando no fim?
        if (pos == getTamanho()) {
            adicionar(valor);
            return;
        }

        var no = new No<T>(valor);
        var proximo = getNo(pos);
        var anterior = proximo.anterior;
        no.anterior = anterior; //1
        no.proximo = proximo; //1

        if (anterior == null) { //Base?
            base = no;
        } else {
            anterior.proximo = no; //2
        }

        proximo.anterior = no; //3
        tamanho = tamanho+1; //3
    }

    private No<T> getNo(int pos) {
        Objects.checkIndex(pos, tamanho);
        int meio = tamanho / 2;

        //Itera para frente
        if (pos <= meio) {
            No<T> atual = base;
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            return atual;
        }

        //Itera para trás
        No<T> atual = topo;
        for (int i = tamanho-1; i != pos; i--) {
            atual = atual.anterior;
        }
        return atual;
    }

    @Override
    public void limpar() {
        base = null;
        topo = null;
        tamanho = 0;
    }

    private T remover(No<T> no) {
        T dado = no.dado;
        var anterior = no.anterior;
        var proximo = no.proximo;

        if (anterior == null) {
            base = proximo;
        } else {
            anterior.proximo = proximo; //1
        }
        if (proximo == null) {
            topo = anterior;
        } else {
            proximo.anterior = anterior; //2
        }
        tamanho = tamanho - 1; //2
        return dado;
    }

    @Override
    public T remover(int pos) {
        return remover(getNo(pos));
    }

    @Override
    public T get(int pos) {
        return getNo(pos).dado;
    }

    @Override
    public void set(int pos, T valor) {
        getNo(pos).dado = valor;
    }

    @Override
    public int indice(T valor) {
        if (isVazia()) return -1;
        var atual = base;
        int pos = 0;

        while (atual != null) {
            if (Objects.equals(atual.dado, valor)) {
                return pos;
            }
            pos = pos + 1;
            atual = atual.proximo;
        }

        return -1;
    }

    @Override
    public int ultimoIndice(T valor) {
        if (isVazia()) return -1;
        var atual = topo;
        int pos = tamanho;

        while (atual != null) {
            if (Objects.equals(atual.dado, valor)) {
                return pos;
            }
            pos = pos - 1;
            atual = atual.anterior;
        }

        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator();
    }

    private class ListaIterator implements Iterator<T> {
        private No<T> atual = null;
        @Override
        public boolean hasNext() {
            return !isVazia() && atual != topo;
        }
        @Override
        public T next() {
            atual = (atual == null ? base : atual.proximo);
            return atual.dado;
        }
        @Override
        public void remove() {
            remover(atual);
            atual = atual.anterior;
        }
    }

    public void selectionSort(Comparator<? super T> comparator) {
        var primeiro = this.base;

        while(primeiro != null) {
            var proximo = primeiro.proximo;
            var menor = primeiro;
            var elemento = primeiro.proximo;

            while(elemento != null) {
                if(comparator.compare(menor.dado, elemento.dado) > 0) {
                    menor = elemento;
                }
                elemento = elemento.proximo;
            }

            var tmp = primeiro.dado;
            primeiro.dado = menor.dado;
            menor.dado = tmp;

            primeiro = proximo;
        }
    }

    public void quickSort(Comparator<? super T> comparator) {
        if (getTamanho() < 2) return;

        var menores = new ListaEncadeada<T>();
        var iguais = new ListaEncadeada<T>();
        var maiores = new ListaEncadeada<T>();
        var pivo = topo.dado;

        for (var dado : this) {
            var cmp = comparator.compare(dado, pivo);
            if (cmp < 0) {
                menores.adicionar(dado);
            } else if (cmp == 0) {
                iguais.adicionar(dado);
            } else {
                maiores.adicionar(dado);
            }
        }

        menores.quickSort(comparator);
        maiores.quickSort(comparator);

        limpar();
        adicionarTodos(menores);
        adicionarTodos(iguais);
        adicionarTodos(maiores);
    }
}
