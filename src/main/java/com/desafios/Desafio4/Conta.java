package com.desafios.Desafio4;

public class Conta {
    private double saldo;

    private int numConta;
    private String nome;

    //criar construtores

    private double dep;

    private double saq;
    public static final int tax = 5;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }



    public double getDep() {
        return dep;
    }

    public void setDep(double dep) {
        this.dep = dep;
    }

    public double getSaq() {
        return saq;
    }

    public void setSaq(double saq) {
        this.saq = saq;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Account: " + numConta +
                ", Holder: " + nome + '\'' +
                '}';
    }
}


