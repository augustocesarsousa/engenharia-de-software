package com.acsousa.mapa;

import java.util.Iterator;
import java.util.function.BiConsumer;

public interface Mapa<C, V> {
    class Par<C, V> {
        private C chave;
        private V valor;

        public Par(C chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public C getChave() {
            return chave;
        }

        public V getValor() {
            return valor;
        }

        protected V setValor(V valor) {
            var antigo = this.valor;
            this.valor = valor;
            return antigo;
        }

        @Override
        public String toString() {
            return chave + ": " + valor;
        }
    }

    //Informações
    int getTamanho();
    boolean isVazio();
    //Inclusão de itens
    V adicionar(C chave, V valor);
    //Exclusão de itens
    void limpar();
    V remover(C chave);
    //Acesso direto a valores
    V get(C chave);
    //Métodos para buscar itens
    boolean contem(C chave);
    //Iteração
    Iterator<Par<C, V>> iterator();

    //Iteração
    default Iterable<C> chaves() {
        return () -> new ChaveIterator<>(iterator());
    }
    default Iterable<V> valores() {
        return () -> new ValorIterator<>(iterator());
    }
    default Iterable<Par<C, V>> entradas() {
        return this::iterator;
    }
    default void forEach(BiConsumer<C, V> consumer) {
        for (var par : entradas()) {
            consumer.accept(par.getChave(), par.getValor());
        }
    }
}

class ChaveIterator<C, V> implements Iterator<C> {
    private Iterator<Mapa.Par<C, V>> iterator;
    public ChaveIterator(Iterator<Mapa.Par<C, V>> iterator) {
        this.iterator = iterator;
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
    @Override
    public C next() {
        return iterator.next().getChave();
    }
    @Override
    public void remove() {
        iterator.remove();
    }
}

class ValorIterator<C, V> implements Iterator<V> {
    private Iterator<Mapa.Par<C, V>> iterator;
    public ValorIterator(Iterator<Mapa.Par<C, V>> iterator) {
        this.iterator = iterator;
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
    @Override
    public V next() {
        return iterator.next().getValor();
    }
    @Override
    public void remove() {
        iterator.remove();
    }
}
