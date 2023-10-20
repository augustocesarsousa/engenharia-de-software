package com.acsousa.fila;

public class FilaCircular<T> implements Fila<T>{
    private int base = 0;
    private int topo = -1;

    private T[] dados;

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

        return dado;
    }

    @Override
    public boolean isCheia() {
        return !isVazia() && mover(topo) == base;
    }

    @Override
    public boolean isVazia() {
        return topo == -1;
    }

    @Override
    public void limpar() {
        base = 0;
        topo = -1;

        for(int i = 0; i < dados.length; i++) {
            dados[i] = null;
        }
    }
}
