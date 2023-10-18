package com.acsousa.pilha;

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
}
