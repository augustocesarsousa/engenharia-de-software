package com.acsousa.lista;

import com.acsousa.util.Colecao;

public interface Lista<T> extends Colecao<T> {

    //Inclusão de itens
    void adicionar(int pos, T valor);

    //Exclusão de itens
    T remover(int pos);

    //Acesso direto a valores da lista
    T get(int pos);
    void set(int pos, T valor);

    //Métodos para buscar itens
    int indice(T valor);
    int ultimoIndice(T valor);
}
