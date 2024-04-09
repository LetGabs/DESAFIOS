package com.desafios.Desafio4;

public class Calcular {
    public double calcularSaldo(double saldo, double dep, double saq, int tax) {
        if (saq!=0){
            return (saldo + dep) - (saq + tax);}
        else {
            return (saldo + dep) - saq;
        }
    }
    public double calcularSaque( double saq, int tax) {
        {
            return (saq + tax);

        }
    }
}
