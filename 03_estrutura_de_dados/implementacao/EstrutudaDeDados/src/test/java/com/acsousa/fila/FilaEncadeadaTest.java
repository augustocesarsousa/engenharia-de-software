package com.acsousa.fila;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class FilaEncadeadaTest {

    @Test
    public void deveCriarFilaCom10Elementos() {
        Fila<Integer> filaEncadeada = new FilaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            filaEncadeada.adicionar(i);
        }

        Assert.assertEquals(10, filaEncadeada.getTamanho());
    }

    @Test
    public void deveRemoverElementosDaFila() {
        Fila<Integer> filaEncadeada = new FilaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            filaEncadeada.adicionar(i);
        }

        for (int i = 0; i < 5; i++) {
            filaEncadeada.remover();
        }

        Assert.assertEquals(5, filaEncadeada.getTamanho());
    }

    @Test
    public void deveLancarErroAoRemoverElementoDeFilaVazia() {
        Fila<Integer> filaEncadeada = new FilaEncadeada<>();

        assertThrows(IllegalStateException.class, filaEncadeada::remover);
    }

    @Test
    public void deveLimparAFila() {
        Fila<Integer> filaEncadeada = new FilaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            filaEncadeada.adicionar(i);
        }

        filaEncadeada.limpar();

        Assert.assertEquals(0, filaEncadeada.getTamanho());
    }
}
