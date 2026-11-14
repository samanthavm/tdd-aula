package br.ufpa.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void novaContaIniciaComSaldo0() {
        Conta acc = new Conta();
        assertEquals(0, acc.getSaldo());
    }
    @Test
    void extratoContaComSaldo0() {
        Conta acc = new Conta();
        assertTrue(acc.getEntradas().isEmpty());
    }

    @Test
    void depositoEmConta(){
        Conta acc = new Conta();
        acc.deposito(100);
        assertEquals(100, acc.getSaldo());
        assertEquals(1,  acc.getEntradas().size());

    }
    @Test
    void saqueConta(){
        Conta acc = new Conta();
        acc.deposito(200);
        acc.saque(50);
        assertEquals(150, acc.getSaldo());
    }

}