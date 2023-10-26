package com.acsousa.pilha;

import java.util.Iterator;

public class PilhaEncadeada<T> implements Pilha<T>{

    private static class No<T> {
        public No anterior;
        public T dado;
    }

    private No<T> topo = null;

    @Override
    public void adicionar(T dado) {
        var novo = new No<T>();     //1. Cria o no
        novo.dado = dado;           //e associa o dado
        novo.anterior = topo;       //2. Associa o topo ao anterior
        topo = novo;                //3. Atualiza o topo
    }

    @Override
    public T remover() {
        if(isVazia()) { //Vazia? Dispara exceção
            throw new IllegalStateException("Pilha vazia!");
        }

        var dado = topo.dado; //1. Dado a ser removido
        topo = topo.anterior; //2. Atualiza o topo

        return dado;
    }

    @Override
    public boolean isCheia() {
        return false;
    }

    @Override
    public boolean isVazia() {
        return topo == null;
    }

    @Override
    public void limpar() {
        topo = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new PilhaEncadeadaIterator();
    }

    private class PilhaEncadeadaIterator implements Iterator<T> {
        private No<T> atual = null;
        @Override
        public boolean hasNext() {
            return !isVazia() && (atual == null || atual.anterior != null);
        }
        @Override
        public T next() {
            atual = (atual == null ? topo : atual.anterior);
            return atual.dado;
        }
    }
}
