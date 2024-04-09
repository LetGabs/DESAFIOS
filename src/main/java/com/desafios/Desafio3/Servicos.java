package com.desafios.Desafio3;

public class Servicos {

    public static double calcularSalB (double hora, double valorH){ return (hora * valorH * 30);
    }
    public static double netSalary (double bruto, double tax, double aum){ return bruto - (bruto * tax) + (bruto * aum); // salário liquido
    }

}
