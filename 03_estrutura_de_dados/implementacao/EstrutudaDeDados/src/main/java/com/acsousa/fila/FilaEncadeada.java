package com.acsousa.fila;

import java.util.Iterator;

public class FilaEncadeada<T> implements Fila<T> {

    private static class No<T> {
        T dado;
        No proximo;
    }

    private No<T> topo;
    private No<T> base;
    private int tamanho;

    @Override
    public void adicionar(T dado) {
        var no = new No<T>();
        no.dado = dado;

        if(isVazia()) {
            topo = no;
            base = no;
        } else {
            topo.proximo = no;
            topo = no;
        }

        tamanho++;
    }

    @Override
    public T remover() {
        if(isVazia()) {
            throw new IllegalStateException("Fila vazia!");
        }

        T dado = base.dado;
        base = base.proximo;

        if(base == null) {
            topo = null;
        }

        tamanho--;
        return dado;
    }

    @Override
    public Integer getCapacidade() {
        return null;
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
    public boolean isVazia() {
        return base == null;
    }

    @Override
    public void limpar() {
        base = null;
        topo = null;
        tamanho = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class FilaEncadeadaIterator implements Iterator<T> {
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
    }
}
