package com.acsousa.lista;

public class TesteListaEstatica {
    public static void main(String[] args) {
        Lista<Integer> listaEstatica = new ListaEstatica<>(11);

        //Adiciona os números de 0 a 9
        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        //Adicionar o valor 11 na posição 3
        listaEstatica.adicionar(3, 11);

        //Retorna o índice do valor 6
        System.out.println(listaEstatica.indice(6));

        //Alterar o valor da posição 9
        listaEstatica.set(9, 15);

        //Imprimindo a lista
        listaEstatica.imprimir(listaEstatica);
        System.out.println(" ");

        //Adiciona mais 3 números à lista
        for (int i = 0; i < 3; i++) {
            listaEstatica.adicionar(i);
        }

        //Imprimindo a lista
        listaEstatica.imprimir(listaEstatica);
        System.out.println(" ");

        //Remove o elemento na posição 9
        System.out.println(listaEstatica.remover(9));

        //Imprimindo a lista
        listaEstatica.imprimir(listaEstatica);
        System.out.println(" ");
    }
}
