package com.acsousa.pilha;

public interface Pilha<T> {
    void adicionar(T dado);
    T remover();
    boolean isCheia();
    boolean isVazia();
    void limpar();
}
