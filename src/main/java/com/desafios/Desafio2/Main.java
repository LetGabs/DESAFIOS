package com.desafios.Desafio2;
import javax.swing.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        boolean rodando = true;
        //MENU PRINCIPAL + INPUT
        JOptionPane.showMessageDialog(null," ==== BEM VINDO A LISTA DE TAREFAS === ");
        while (rodando) {
            String opcao = JOptionPane.showInputDialog(null, """
                    ===> Digite a opção desejada:\s
                     [1] Adicionar Tarefa\s
                     [2] Visualizar Tarefas\s
                     [3] Remover Tarefa\s
                     [4] SAIR""");
            //processando o input do usuário
            switch (opcao) {
                case Auxiliar.ADICIONAR -> {
                    String nome = JOptionPane.showInputDialog(null, " ==== NOVA TAREFA ==== \n " + "Digite a tarefa que você quer registrar: ");
                    tarefas.add(nome);
                }
                case Auxiliar.VISUALIZAR -> {
                    JOptionPane.showMessageDialog(null, "===== TAREFAS =====");
                    for (int i = 0; i < tarefas.size(); i++) {
                        JOptionPane.showMessageDialog(null, "\n" + (i + 1) + " - " + tarefas.get(i));
                    }
                }
                case Auxiliar.REMOVER -> {
                    int numTarefas = Integer.parseInt(JOptionPane.showInputDialog(null, "===== REMOVER TAREFAS ===== \n " + "Digite o número da tarefa que você quer remover: "));
                    tarefas.remove(numTarefas - 1);
                }
                case Auxiliar.SAIR -> {
                    rodando = false;
                    JOptionPane.showMessageDialog(null, "---> Encerrando programa...");
                }
                case null, default -> JOptionPane.showMessageDialog(null,"---> Digite uma opção válida!!! ");
            }
            }
        JOptionPane.showMessageDialog(null,"----> Programa encerrado com sucesso!");
        }
    }

