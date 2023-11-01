package com.acsousa.lista;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertThrows;

public class ListaEncadeadaTest {

    @Test
    public void deveCriarUmaListaCom10Elementos() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        Assert.assertEquals(10, listaEncadeada.getTamanho());
    }

    @Test
    public void deveRetornarUmElementoDaLista() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        Assert.assertEquals(5, (int) listaEncadeada.get(5));
    }

    @Test
    public void deveLancarErroQuandoRetornarElementoEmPosicaoInexistente() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> listaEncadeada.get(100));
    }

    @Test
    public void deveAlterarUmElementoDaLista() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        listaEncadeada.set(5, 20);

        Assert.assertEquals(20, (int) listaEncadeada.get(5));
    }

    @Test
    public void deveLancarErroQuandoAlterarElementoEmPosicaoInexistente() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> listaEncadeada.set(100, 20));
    }

    @Test
    public void deveRetornarIndiceDoElemento() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        Assert.assertEquals(5, listaEncadeada.indice(5));
    }

    @Test
    public void deveRetornarIndiceNegativoQuandoElementoInexistente() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        Assert.assertEquals(-1, listaEncadeada.indice(100));
    }

    @Test
    public void deveRemoverElementoPelaPosicao() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        listaEncadeada.remover(5);

        Assert.assertEquals(9, listaEncadeada.getTamanho());
    }

    @Test
    public void deveLancarErroQuandoRemoverElementoPelaPosicaoInexistente() {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            listaEncadeada.adicionar(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> listaEncadeada.remover(100));
    }

    @Test
    public void deveOrdernarAListaComSelectionShort() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            listaEncadeada.adicionar(numero);
        }

        listaEncadeada.selectionSort(Comparator.naturalOrder());

        Assert.assertTrue(listaEncadeada.get(0) < listaEncadeada.get(5));
        Assert.assertTrue(listaEncadeada.get(5) < listaEncadeada.get(9));
    }

    @Test
    public void deveOrdernarAListaComQuickShort() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        for (int i = 0; i < 100; i++) {
            int numero = (int) (Math.random() * 100);
            listaEncadeada.adicionar(numero);
        }

        listaEncadeada.quickSort(Comparator.naturalOrder());

        Assert.assertTrue(listaEncadeada.get(0) < listaEncadeada.get(50));
        Assert.assertTrue(listaEncadeada.get(50) < listaEncadeada.get(99));
    }
}
