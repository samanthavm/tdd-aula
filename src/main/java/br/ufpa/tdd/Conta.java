package br.ufpa.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta {
    private int saldo =0;
    private List<String> entradas = new ArrayList<>();

    public int getSaldo(){
        return saldo;
    }
    public List<String> getEntradas(){
        return entradas;
    }
    public void deposito(int valor){
        this.saldo += valor;
        this.entradas.add("Deposito "+ valor);
    }




}