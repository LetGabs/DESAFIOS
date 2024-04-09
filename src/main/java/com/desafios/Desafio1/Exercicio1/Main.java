package com.desafios.Desafio1.Exercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;
        JOptionPane.showMessageDialog(null, "===> Bem vindo ao programa");
        while (rodando) {
            String opcao = JOptionPane.showInputDialog(null, " Escolha um número que represente a ação desejada: \n [1] CONTINUAR \n [2] SAIR");
            switch (opcao) {
                case "1": {
                    int num = Integer.parseInt(JOptionPane.showInputDialog(null, " ====> Digite um número qualquer: "));
                    if (num > 0) {
                        JOptionPane.showMessageDialog(null, "===> O número é POSITIVO!");
                    } else if (num == 0) {
                        JOptionPane.showMessageDialog(null, "===> O número é ZERO!");
                    } else {
                        JOptionPane.showMessageDialog(null, "===> O número é NEGATIVO!");
                    }
                    break;
                }
                case "2":{
                    rodando = false;
                    JOptionPane.showMessageDialog(null,"---> SAINDO...");
                    break;
                }
                default:  {
                    JOptionPane.showMessageDialog(null,"---> Digite uma opção válida!!! ");
                    break;}
            }
        }
    }
}