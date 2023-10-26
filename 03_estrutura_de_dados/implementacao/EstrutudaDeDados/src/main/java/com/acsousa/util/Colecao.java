package com.acsousa.util;

import java.util.Objects;

public interface Colecao<T> extends Iterable<T> {
    void limpar();
    void adicionar(T valor);
    boolean isVazia();
    boolean isCheia();

    default void adicionarTodos(Colecao<? extends T> valores){
        if(valores == this) {
            throw new UnsupportedOperationException();
        }

        for (T valor : valores) {
            adicionar(valor);
        }
    }

    default void removerTodos(Colecao<? extends T> valores) {
        if(valores == this) {
            limpar();
            return;
        }

        var it = iterator();

        while (it.hasNext()) {
            T valor = it.next();

            if (valores.contem(valor)) {
                it.remove();
            }
        }
    }

    default boolean contem(Object valor) {
        for (T dado : this) {
            if (Objects.equals(dado, valor)) {
                return true;
            }
        }

        return false;
    }

    default void imprimir(Colecao<? extends T> valores) {
        valores.forEach(System.out::print);
    }
}
