package com.acsousa.fila;

import com.acsousa.util.Colecao;

public interface Fila<T> extends Colecao<T> {

    T remover();

    Integer getCapacidade();
}
