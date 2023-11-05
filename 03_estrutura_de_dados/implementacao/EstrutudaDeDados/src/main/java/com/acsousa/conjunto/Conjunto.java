package com.acsousa.conjunto;

import com.acsousa.util.Colecao;

public interface Conjunto<T> extends Colecao<T> {
    boolean contem(Object valor);
    int getTamanho();
    void remover(T valor);
}
