package com.desafios.Desafio3;

public class Employee {
    public String nome;
    public double grossSalary;

    public double tax;
    public double hora;
    public double valorH;

    public double aumento;

    @Override
    public String toString() {
        return "Employee{" +
                "Nome: '" + nome + '\'' +
                ", Horas trabalhadas: " + hora +
                ", Valor hora: " + valorH +
                '}';
    }

}
