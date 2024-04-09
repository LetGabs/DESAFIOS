package com.desafios.Desafio1.Exercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;
        while (rodando) {
            JOptionPane.showMessageDialog(null, "===> Bem vindo ao programa dias da semana");
            String opcao = JOptionPane.showInputDialog(null, " Escolha um número que represente a ação desejada: \n [1] CONTINUAR \n [2] SAIR");
            switch (opcao) {
                case "1": {
                    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "===> Digite um número de 1 a 7: "));
                    if (num == Constantes.DOMINGO) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é DOMINGO");
                    } else if (num == Constantes.SEGUNDA) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é SEGUNDA");
                    } else if (num == Constantes.TERÇA) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é TERÇA");
                    } else if (num == Constantes.QUARTA) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é QUARTA");
                    } else if (num == Constantes.QUINTA) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é QUINTA");
                    } else if (num == Constantes.SEXTA) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é SEXTA");
                    } else if (num == Constantes.SABADO) {
                        JOptionPane.showMessageDialog(null, "O dia da semana é SÁBADO");
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite uma opção válida!!!");
                    } break;
                }
                case "2": {rodando = false;
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
