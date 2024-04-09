package com.desafios.Desafio1.Exercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número: "));
        JOptionPane.showMessageDialog(null, "===> UTILIZANDO O LOOP FOR");
        String aux= "";
        for (int i = 0; i < numero; i++) {
            aux = (aux + "for: " + i + "\n");
        }
        JOptionPane.showMessageDialog(null, aux);
        JOptionPane.showMessageDialog(null, "===> UTILIZANDO O LOOP WHILE");
        int contadorWhile = 0;
        String aux1 = "";
        while (contadorWhile < numero) {
            aux1 = (aux1 + "While: " + contadorWhile + "\n");
            contadorWhile++;
        }
        JOptionPane.showMessageDialog(null, aux1);
        JOptionPane.showMessageDialog(null,"===> UTILIZANDO O LOO DO WHILE: ");
        int contadorDoWhile = 0;
        String aux2 = "";
        do {
            aux2 = (aux2 + "do while: " + contadorDoWhile + "\n");
            contadorDoWhile++;
        } while (contadorDoWhile < numero);
        JOptionPane.showMessageDialog(  null,aux2);

    }
}
