package com.acsousa.pilha;

public class PilhaEstatica<T> implements Pilha<T> {

    private T[] dados;
    private int topo = -1;

    public PilhaEstatica(int tamanho) {
        dados = (T[]) new Object[tamanho];
    }

    @Override
    public void adicionar(T dado) {
        if(isCheia()) {
            throw new IllegalStateException("Pilha cheia!");
        }

        topo++;
        dados[topo] = dado;
    }

    @Override
    public T remover() {
        if(isVazia()) {
            throw new IllegalStateException("Pilha vazia!");
        }

        T dado = dados[topo];
        topo--;

        return dado;
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
}
