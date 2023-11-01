package com.acsousa.lista;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class ListaEstatica<T> implements Lista<T> {
    private T[] dados;
    private int tamanho;
    public ListaEstatica(int capacidade) {
        this.dados = (T[]) new Object[capacidade];
    }

    @Override
    public Integer getCapacidade() {
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
        //Já está em capacidade máxima
        if (getTamanho() == getCapacidade()) {
            //Redimenciona
            int novaCapacidade = (int) (getCapacidade() * 1.5);
            dados = Arrays.copyOf(dados, novaCapacidade);
        }

        Objects.checkIndex(pos, tamanho+1);

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
        ajustar(); //Ajusta o tamanho da lista

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

    public void ajustar() {
        dados = Arrays.copyOf(dados, getTamanho());
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

    private void troca(int i, int j) {
        var temp = dados[i];
        dados[i] = dados[j];
        dados[j] = temp;
    }

    public void bubbleSort(Comparator<? super T> comparator) {
        for (int i = 0; i < getTamanho(); i++) {
            boolean trocou = false;
            for (int j = 0; j < getTamanho() - 1 - i; j++) {
                if(comparator.compare(dados[j], dados[j+1]) > 0) {
                    troca(j, j+1);
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }

    public void selectionSort(Comparator<? super T> comparator) {
        for (int i = 0; i < getTamanho()-1; i++) {
            int menor = i;
            for (int j = i+1; j < getTamanho(); j++) {
                if (comparator.compare(dados[menor], dados[j]) > 0) {
                    menor = j;
                }
            }
            troca(i, menor);
        }
    }
}
