package com.acsousa.pilha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class PilhaEstaticaTest {
    @Test
    public void deveCriarPilhaDeCapacidade10() {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(10);

        Assert.assertEquals(10, (int) pilhaEstatica.getCapacidade());
    }


    @Test
    public void deveCriarPilhaCom3Elementos() {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(10);

        for (int i = 0; i < 3; i++) {
            pilhaEstatica.adicionar(i);
        }

        Assert.assertEquals(3, pilhaEstatica.getTamanho());
    }

    @Test
    public void deveLancarErroQuandoTentarAdicionarEmPilhaCheia() {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(1);

        pilhaEstatica.adicionar(1);

        assertThrows(IllegalStateException.class, () -> pilhaEstatica.adicionar(2));
    }

    @Test
    public void deveRemoverItemDaPilha() {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(2);

        pilhaEstatica.adicionar(1);
        pilhaEstatica.adicionar(2);
        pilhaEstatica.remover();

        Assert.assertEquals(1, pilhaEstatica.getTamanho());
    }

    @Test
    public void develancarErroQuandoTentaRemoverItemEmPilhaVazia() {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(1);

        assertThrows(IllegalStateException.class, pilhaEstatica::remover);
    }

    @Test
    public void deveLimparAPilha() {
        Pilha<Integer> pilhaEstatica = new PilhaEstatica<>(10);

        for (int i = 0; i < 10; i++) {
            pilhaEstatica.adicionar(i);
        }
        pilhaEstatica.limpar();

        Assert.assertEquals(0, pilhaEstatica.getTamanho());

    }

}
