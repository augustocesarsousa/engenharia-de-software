package com.acsousa.fila;

public class FilaEncadeada<T> implements Fila<T> {
    private static class No<T> {
        T dado;
        No proximo;
    }

    private No<T> topo;
    private No<T> base;

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

        return dado;
    }

    @Override
    public boolean isCheia() {
        return false;
    }

    @Override
    public boolean isVazia() {
        return base == null;
    }

    @Override
    public void limpar() {
        base = null;
        topo = null;
    }
}
