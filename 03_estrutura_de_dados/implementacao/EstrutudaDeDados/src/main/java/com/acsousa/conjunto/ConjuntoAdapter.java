package com.acsousa.conjunto;

import com.acsousa.mapa.Mapa;

import java.util.Iterator;

public class ConjuntoAdapter<T> implements Conjunto<T> {
    private Mapa<T, ?> mapa;

    public ConjuntoAdapter(Mapa<T, ?> mapa) {
        this.mapa = mapa;
    }

    @Override
    public boolean contem(Object valor) {
        return mapa.contem((T)valor);
    }

    @Override
    public void limpar() {
        mapa.limpar();
    }

    @Override
    public void adicionar(T valor) {
        mapa.adicionar(valor, null);
    }

    @Override
    public boolean isVazia() {
        return mapa.isVazio();
    }

    @Override
    public boolean isCheia() {
        return false;
    }

    @Override
    public int getTamanho() {
        return mapa.getTamanho();
    }

    @Override
    public Integer getCapacidade() {
        return null;
    }

    @Override
    public void remover(T valor) {
        mapa.remover(valor);
    }

    @Override
    public Iterator<T> iterator() {
        return mapa.chaves().iterator();
    }
}
