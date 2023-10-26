package com.acsousa.pilha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class PilhaEncadeadaTest {

    @Test
    public void deveCriarUmaPilhaCom10Elementos() {
        Pilha<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            pilhaEncadeada.adicionar(i);
        }

        Assert.assertEquals(10, pilhaEncadeada.getTamanho());
    }

    @Test
    public void deveRemoverItemDaPilha() {
        Pilha<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        for (int i = 0; i < 5; i++) {
            pilhaEncadeada.adicionar(i);
        }
        int valorRemovido = pilhaEncadeada.remover();

        Assert.assertEquals(4, pilhaEncadeada.getTamanho());
        Assert.assertEquals(4, valorRemovido);
    }

    @Test
    public void deveLancarErroQuandoTentarRemoverItemDePilhaVazia() {
        Pilha<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        assertThrows(IllegalStateException.class, pilhaEncadeada::remover);
    }

    @Test
    public void deveLimparAPilha() {
        Pilha<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        for (int i = 0; i < 5; i++) {
            pilhaEncadeada.adicionar(i);
        }
        pilhaEncadeada.limpar();

        Assert.assertTrue(pilhaEncadeada.isVazia());
    }
}
