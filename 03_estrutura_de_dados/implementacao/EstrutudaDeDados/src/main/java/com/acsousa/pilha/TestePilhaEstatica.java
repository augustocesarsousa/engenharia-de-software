package com.acsousa.pilha;

public class TestePilhaEstatica {
    public static void main(String[] args) {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            pilhaEstatica.adicionar(i);
        }

        while (!pilhaEstatica.isVazia()){
            System.out.print(pilhaEstatica.remover() + " ");
        }
    }
}
