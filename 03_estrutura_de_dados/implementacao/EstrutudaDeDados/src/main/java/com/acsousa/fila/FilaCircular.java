package com.acsousa.fila;

import java.util.Iterator;

public class FilaCircular<T> implements Fila<T>{
    private int base = 0;
    private int topo = -1;
    private T[] dados;
    private int tamanho;

    public FilaCircular(int tamanho) {
        this.dados = (T[]) new Object[tamanho];
    }

    private int mover(int posicao) {
        return posicao + 1 == dados.length ? 0 : posicao + 1;
    }

    @Override
    public void adicionar(T dado) {
        if(isCheia()) { //Está cheia? Dispara a exceção
            throw new IllegalStateException("Fila cheia!");
        }

        topo = mover(topo);
        dados[topo] = dado;
        tamanho++;
    }

    @Override
    public T remover() {
        if(isVazia()) { //Está vazia? Dispara a exceção
            throw new IllegalStateException("Fila vazia!");
        }

        T dado = dados[base];

        if(base == topo) { //Útimo elemento?
            limpar();
        } else {
            dados[base] = null;
            base = mover(base);
        }

        tamanho--;

        return dado;
    }

    @Override
    public Integer getCapacidade() {
        return dados.length;
    }

    @Override
    public boolean isCheia() {
        return !isVazia() && mover(topo) == base;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public boolean isVazia() {
        return topo == -1;
    }

    @Override
    public void limpar() {
        base = 0;
        topo = -1;
        tamanho = 0;

        for(int i = 0; i < dados.length; i++) {
            dados[i] = null;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new FilaCircularIterator();
    }

    private class FilaCircularIterator implements Iterator<T> {
        private int atual = -100;
        @Override
        public boolean hasNext() {
            return !isVazia() && atual != topo;
        }
        @Override
        public T next() {
            atual = (atual == -100 ? base : mover(atual));
            return dados[atual];
        }
    }
}
