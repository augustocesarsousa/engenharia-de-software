package com.acsousa.lista;

import java.util.Iterator;
import java.util.Objects;

public class ListaEstatica<T> implements Lista<T> {
    private T[] dados;
    private int tamanho;
    public ListaEstatica(int capacidade) {
        this.dados = (T[]) new Object[capacidade];
    }

    public int getCapacidade() {
        return dados.length;
    }

    @Override
    public boolean isVazia() {
        return getTamanho() == 0;
    }

    @Override
    public boolean isCheia() {
        return getTamanho() == getCapacidade();
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void adicionar(T valor) {
        adicionar(tamanho, valor);
    }

    @Override
    public void adicionar(int pos, T valor) {
        if (pos < 0 || pos > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        //Objects.checkIndex(pos, tamanho+1);

        //Move os dados para a direita
        for (int i = tamanho-1; i >= pos; i--) {
            dados[i+1] = dados[i];
        }

        dados[pos] = valor; //Insere o dado
        tamanho = tamanho + 1; //Aumenta o tamanho
    }

    @Override
    public void limpar() {
        for (int i = 0; i < getTamanho(); i++) {
            dados[i] = null;
        }

        //Arrays.fill(dados, 0, getTamanho(), null);

        tamanho = 0;
    }

    @Override
    public T remover(int pos) {
        Objects.checkIndex(pos, tamanho);

        T dado = dados[pos]; //Dado a ser retornado

        //Move os elementos para a esquerda
        for (int i = pos; i < tamanho-1; i++) {
            dados[i] = dados[i+1];
        }

        dados[tamanho-1] = null; //Elimina o último dado
        tamanho--; //Reduz o tamanho da lista

        return dado;
    }

    @Override
    public T get(int pos) {
        Objects.checkIndex(pos, tamanho);
        return dados[pos];
    }

    @Override
    public void set(int pos, T valor) {
        Objects.checkIndex(pos, tamanho);
        dados[pos] = valor;
    }

    @Override
    public int indice(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (Objects.equals(valor, dados[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int ultimoIndice(T valor) {
        for (int i = tamanho-1; i >= 0; i--) {
            if (Objects.equals(valor, dados[i])) {
                return i;
            }
        }
        return -1;
    }

    public void imprimir() {
        for (var valor : dados) {
            System.out.print(valor + " ");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator();
    }

    private class ListaIterator implements Iterator<T> {
        private int atual = -1;
        @Override
        public boolean hasNext() {
            return (atual+1) < getTamanho();
        }

        @Override
        public T next() {
            atual = atual + 1;
            return dados[atual];
        }

        @Override
        public void remove() {
            remover(atual);
            atual = atual - 1;
        }
    }
}
