package com.acsousa.mapa;

import java.util.Iterator;

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
}
