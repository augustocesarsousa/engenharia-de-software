package com.acsousa.pilha;

import java.util.Iterator;

public class PilhaEstatica<T> implements Pilha<T> {

    private T[] dados;
    private int topo = -1;

    public PilhaEstatica(int tamanho) {
        dados = (T[]) new Object[tamanho];
    }

    @Override
    public void adicionar(T dado) {
        if(isCheia()) { //Está cheia? Dispara a exceção
            throw new IllegalStateException("Pilha cheia!");
        }

        topo++; //Movimenta o topo
        dados[topo] = dado; //Adiciona o dado no vetor
    }

    @Override
    public T remover() {
        if(isVazia()) { //Vazia? Dispara exceção
            throw new IllegalStateException("Pilha vazia!");
        }

        T dado = dados[topo]; //Guarda o valor
        dados[topo] = null; //Removemos o dado
        topo--; //Movimenta o topo

        return dado; //Retorna o dado
    }

    @Override
    public boolean isCheia() {
        return topo == dados.length - 1;
    }

    @Override
    public boolean isVazia() {
        return topo == -1;
    }

    @Override
    public void limpar() {
        topo = -1;

        for(int i = 0; i <= topo; i++) {
            dados[i] = null;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new PilhaEstaticaIterator();
    }

    private class PilhaEstaticaIterator implements Iterator<T> {
        private int atual = topo+1;
        @Override
        public boolean hasNext() {
            return atual > 0;
        }
        @Override
        public T next() {
            atual = atual - 1;
            return dados[atual];
        }
    }
}
