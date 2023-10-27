package com.acsousa.pilha;

import com.acsousa.util.Colecao;

public interface Pilha<T> extends Colecao<T> {
    T remover();
}
