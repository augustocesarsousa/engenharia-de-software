package com.acsousa.pilha;

public class TestePilhaEncadeada {
    public static void main(String[] args) {
        Pilha<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        //Adiciona os números de 0 a 9
        for (int i = 0; i < 10; i++) {
            pilhaEncadeada.adicionar(i);
        }

        //Remove os elementos
        while (!pilhaEncadeada.isVazia()){
            System.out.print(pilhaEncadeada.remover() + " ");
        }
    }
}
