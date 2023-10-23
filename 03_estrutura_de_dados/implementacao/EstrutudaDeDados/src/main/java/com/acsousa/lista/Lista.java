package com.acsousa.lista;

public interface Lista<T> extends Iterable<T> {
    //Informações
    boolean isVazia();
    boolean isCheia();
    int getTamanho();

    //Inclusão de itens
    void adicionar(T valor);
    void adicionar(int pos, T valor);

    //Exclusão de itens
    void limpar();
    T remover(int pos);

    //Acesso direto a valores da lista
    T get(int pos);
    void set(int pos, T valor);

    //Métodos para buscar itens
    int indice(T valor);
    int ultimoIndice(T valor);


}
