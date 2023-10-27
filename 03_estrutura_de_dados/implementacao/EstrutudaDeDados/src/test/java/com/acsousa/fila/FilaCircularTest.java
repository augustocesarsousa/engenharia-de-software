package com.acsousa.fila;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class FilaCircularTest {

    @Test
    public void deveCriarFilaDeCapacidade10() {
        Fila<Integer> filaCircular = new FilaCircular<>(10);

        Assert.assertEquals(10, (int) filaCircular.getCapacidade());
    }

    @Test
    public void deveLancarErroQuandoTentarAdicionarEmFilaCheia() {
        Fila<Integer> filaCircular = new FilaCircular<>(10);

        for (int i = 0; i < 10; i++) {
            filaCircular.adicionar(i);
        }

        assertThrows(IllegalStateException.class, () -> filaCircular.adicionar(11));
    }

    @Test
    public void deveRemoverItensDaFila() {
        Fila<Integer> filaCircular = new FilaCircular<>(10);

        for (int i = 0; i < 10; i++) {
            filaCircular.adicionar(i);
        }

        int itemRemovido = filaCircular.remover();

        Assert.assertEquals(0, itemRemovido);
        Assert.assertEquals(9, filaCircular.getTamanho());
    }

    @Test
    public void develancarErroQuandoTentaRemoverItemEmPilhaVazia() {
        Fila<Integer> filaCircular = new FilaCircular<>(1);

        assertThrows(IllegalStateException.class, filaCircular::remover);
    }

    @Test
    public void deveLimparAFila() {
        Fila<Integer> filaCircular = new FilaCircular<>(10);

        for (int i = 0; i < 10; i++) {
            filaCircular.adicionar(i);
        }
        filaCircular.limpar();

        Assert.assertEquals(0, filaCircular.getTamanho());
    }

}
