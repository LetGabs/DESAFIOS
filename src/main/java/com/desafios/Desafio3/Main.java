package com.desafios.Desafio3;

import javax.swing.*;

    public class Main {
        public static void main(String[] args) {

            boolean rodando = true; //aplicando o while
            while (rodando) {

                Employee employee = new Employee();
                // MENU PRINCIPAL
                JOptionPane.showMessageDialog(null," ====  BEM VINDO A FOLHA DE PAGAMENTO ==== ");
                String opcao = JOptionPane.showInputDialog(null," [1] Adicionar Funcionário \n [2] SAIR \n =====> Digite a opção desejada: ");
                // PROCESSANDO INPUT
                switch (opcao) {
                    case "1": {
                        // adicionar funcionários

                        employee.nome = (JOptionPane.showInputDialog(null, "-----> Digite o nome do funcionário: "));
                        employee.hora = (Double.parseDouble(JOptionPane.showInputDialog(null, "-----> Digite a quantidade de horas trabalhadas por dia: ")));
                        employee.valorH = (Double.parseDouble(JOptionPane.showInputDialog(null, "-----> Digite o valor pago por hora: ")));
                        double tx = Double.parseDouble(JOptionPane.showInputDialog(null, "-----> Digite a porcentagem retida: "));
                        employee.tax = (tx / 100);
                        double bruto = Servicos.calcularSalB(employee.hora, employee.valorH);
                        employee.grossSalary = (bruto);
                        double aum = Double.parseDouble(JOptionPane.showInputDialog(null, "-----> Digite a porcentagem do aumento: "));
                        employee.aumento = (aum / 100);
                        JOptionPane.showMessageDialog(null, "===== DADOS DO FUNCIONÁRIO =====" + employee);
                        JOptionPane.showMessageDialog(null, "===== INFORMAÇÕES DO SALÁRIO ===== \n " + "TAXA RETIDA: " + (employee.tax * 100) + " % \n" + "TAXA DE AUMENTO: " + (employee.aumento * 100) + " % \n" + " ======> SALÁRIO BRUTO: R$ " + bruto + "\n" + " ======> SALÁRIO LÍQUIDO: R$ " + (Servicos.netSalary(employee.grossSalary, employee.tax, employee.aumento)));
                        break;
                    }
                    case "2":{
                        rodando = false;
                        JOptionPane.showMessageDialog(null, "---> Encerrando programa...");
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "---> Digite uma opção válida!!! ");
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "----> Programa encerrado com sucesso!");
        }
    }

