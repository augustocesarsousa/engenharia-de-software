package com.acsousa.lista;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertThrows;

public class ListaEstaticaTest {

    @Test
    public void deveCriarUmaListaCom10Elementos() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        Assert.assertEquals(10, listaEstatica.getTamanho());
        Assert.assertEquals(10, (int) listaEstatica.getCapacidade());
    }

    @Test
    public void deveRetornarUmElementoDaLista() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        Assert.assertEquals(5, (int) listaEstatica.get(5));
    }

    @Test
    public void deveLancarErroQuandoRetornarElementoEmPosicaoInexistente() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> listaEstatica.get(100));
    }

    @Test
    public void deveAlterarUmElementoDaLista() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        listaEstatica.set(5, 20);

        Assert.assertEquals(20, (int) listaEstatica.get(5));
    }

    @Test
    public void deveLancarErroQuandoAlterarElementoEmPosicaoInexistente() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> listaEstatica.set(100, 20));
    }

    @Test
    public void deveAdicionarUmElementoNaListaCheiaEAumentarOTamanhoDaLista() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        listaEstatica.adicionar(5, 20);

        Assert.assertEquals(20, (int) listaEstatica.get(5));
        Assert.assertEquals(11, listaEstatica.getTamanho());
        Assert.assertEquals(15, (int) listaEstatica.getCapacidade());
    }

    @Test
    public void deveRetornarIndiceDoElemento() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        Assert.assertEquals(5, listaEstatica.indice(5));
    }

    @Test
    public void deveRetornarIndiceNegativoQuandoElementoInexistente() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        Assert.assertEquals(-1, listaEstatica.indice(100));
    }

    @Test
    public void deveRemoverElementoPelaPosicao() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        listaEstatica.remover(5);

        Assert.assertEquals(9, listaEstatica.getTamanho());
    }

    @Test
    public void deveAjustarListaQuandoRemoverElemento() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(15);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        listaEstatica.remover(5);

        Assert.assertEquals(9, listaEstatica.getTamanho());
    }

    @Test
    public void deveLancarErroQuandoRemoverElementoPelaPosicaoInexistente() {
        Lista<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            listaEstatica.adicionar(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> listaEstatica.remover(100));
    }

    @Test
    public void deveOrdernarAListaComBubbleShort() {
        ListaEstatica<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            listaEstatica.adicionar(numero);
        }

        listaEstatica.bubbleSort(Comparator.naturalOrder());

        Assert.assertTrue(listaEstatica.get(0) < listaEstatica.get(5));
        Assert.assertTrue(listaEstatica.get(5) < listaEstatica.get(9));
    }

    @Test
    public void deveOrdernarAListaComSelectionShort() {
        ListaEstatica<Integer> listaEstatica = new ListaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            listaEstatica.adicionar(numero);
        }

        listaEstatica.selectionSort(Comparator.naturalOrder());

        Assert.assertTrue(listaEstatica.get(0) < listaEstatica.get(5));
        Assert.assertTrue(listaEstatica.get(5) < listaEstatica.get(9));
    }
}
