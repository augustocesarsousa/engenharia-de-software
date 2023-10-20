package com.acsousa.fila;

public class TesteFilaCircular {
    public static void main(String[] args) {
        Fila<Integer> filaCircular = new FilaCircular<>(10);

        //Adiciona os números de 0 a 9
        for (int i = 0; i < 10; i++) {
            filaCircular.adicionar(i);
        }

        //Remove os elementos
        while (!filaCircular.isVazia()){
            System.out.print(filaCircular.remover() + " ");
        }
    }
}
