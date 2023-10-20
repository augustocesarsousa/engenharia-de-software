package com.acsousa.fila;

public interface Fila<T> {
    void adicionar(T dado);
    T remover();
    boolean isCheia();
    boolean isVazia();
    void limpar();
}
