package com.acsousa.pilha;

public class TestePilhaEstatica {
    public static void main(String[] args) {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(10);

        //Adiciona os números de 0 a 9
        for (int i = 0; i < 10; i++) {
            pilhaEstatica.adicionar(i);
        }

        //Remove os elementos
        while (!pilhaEstatica.isVazia()){
            System.out.print(pilhaEstatica.remover() + " ");
        }
    }
}
