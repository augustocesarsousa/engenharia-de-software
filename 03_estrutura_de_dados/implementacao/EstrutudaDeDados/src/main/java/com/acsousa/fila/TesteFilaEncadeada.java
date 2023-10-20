package com.acsousa.fila;

public class TesteFilaEncadeada {
    public static void main(String[] args) {
        Fila<Integer> filaEncadeada = new FilaEncadeada<>();

        //Adiciona os números de 0 a 9
        for (int i = 0; i < 10; i++) {
            filaEncadeada.adicionar(i);
        }

        //Remove os elementos
        while (!filaEncadeada.isVazia()){
            System.out.print(filaEncadeada.remover() + " ");
        }
    }
}
