package com.desafios.Desafio4;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static Conta usuarioLogado = null;

    public static Conta conta = new Conta();
    public static Calcular calcular = new Calcular();
    public static void main(String[] args) {

        ArrayList<Conta> cBanc = new ArrayList <>();

        boolean rodando = true;
        JOptionPane.showMessageDialog(null,"=====> BEM VINDO AO SISTEMA DO BANCO <=====");
        while (rodando) {
            //MENU PRINCIPAL

            String escolha = JOptionPane.showInputDialog(null, " Escolha um número que represente a ação desejada: \n [1] Fazer cadastro \n [2] Fazer login \n [3] SAIR! \n ----> DIGITE A OPÇÃO DESEJADA: ");
            // processando input menu pricipal:

            switch (escolha){
                case "1": {
                    String nome = JOptionPane.showInputDialog(null,"===== CADASTRO ===== \n ====> Digite o titular da conta: ");
                    conta.setNome(nome);
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog(null," ===== CADASTRO ===== \n ====> Digite o número da conta: "));
                    conta.setNumConta(numConta);
                    Conta u = new Conta();
                    u.setNome(nome);
                    u.setNumConta(numConta);
                    cBanc.add(u);
                    JOptionPane.showMessageDialog(null,"====== Usuário cadastrado com sucesso! ======");
                    int decisao = JOptionPane.showConfirmDialog( null,"========> Deseja realizar um deposito incial: ");
                    if (decisao == JOptionPane.YES_OPTION){
                        double vD = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do depósito: R$" ));
                        conta.setSaldo(vD);
                        JOptionPane.showMessageDialog(null,"=======> Depósito realizado com sucesso, seu saldo inicial é de: R$ " + conta.getSaldo());
                    }else{
                        JOptionPane.showMessageDialog(null,"=======> Você optou não realizar depósito incial!");
                        conta.setSaldo(0);
                    }
                    break;
                } // encerra case1
                case "2":{
                    String nome = JOptionPane.showInputDialog(null, "===== LOGIN ===== \n Digite seu nome: ");
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog(null,"===== LOGIN ===== \n Digite o número da sua conta: " ));
                    boolean loginSucesso = false;
                    for(Conta u : cBanc ){
                        String uNome = u.getNome();
                        int uNumConta  = u.getNumConta();
                        boolean nomeConfere = nome.equals(uNome);
                        boolean contaConfere = numConta == (uNumConta);
                        if(nomeConfere && contaConfere){
                            //usuário logado
                            loginSucesso = true;
                            usuarioLogado = u;
                            break;
                        }
                    }
                    if(!loginSucesso){
                        //login sem sucesso
                        JOptionPane.showMessageDialog(null,"-------> Usuário/Número da conta INCORRETOS! \n =========> TENTE NOVAMENTE ");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"-----> Login feito com sucesso! ");
                        homePage();
                    }
                    break;
                }
                case "3":{
                    rodando = false;
                    JOptionPane.showMessageDialog(null,"---> Encerrando programa...");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,"---> Digite uma opção válida!!! ");
                    break;
                }
            }
        } // encerra while menu principal
        JOptionPane.showMessageDialog(null, "----> Programa encerrado com sucesso!");
    }
    public static void homePage() {
        boolean rodando = true;
        while (rodando) {
            String opcao = JOptionPane.showInputDialog(null, """
                    ======= MENU USUÁRIO =======\s
                     Digite um número que represente a ação desejada:\s
                     [1] DEPÓSITO \s
                     [2] SAQUE\s
                     [3] VISUALIZAR SALDO\s
                     [4] LOGOUT\s
                     ----> DIGITE A OPÇÃO DESEJADA:""");
            switch (opcao) {
                case "1": {
                    double valorDep = Double.parseDouble(JOptionPane.showInputDialog(null, "-----> Digite o valor que você quer deseja depositar: R$  "));
                    conta.setDep(valorDep);
                    JOptionPane.showMessageDialog(null, "Déposito realizado com sucesso! \n Valor do depósito: R$ " + conta.getDep());
                    JOptionPane.showMessageDialog(null, conta);
                    break;
                } //encerra case 1
                case "2": {
                    double valorSac = Double.parseDouble(JOptionPane.showInputDialog(null, "=====> TAXA DE SAQUE R$ 5,00 <=====  \n -----> Digite o valor que você que deseja sacar: R$  "));
                    conta.setSaq(valorSac);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \n Valor do original do saque: R$ " +
                            conta.getSaq() + " \n Valor do saque com a taxa: R$ " + calcular.calcularSaque(conta.getSaq(), Conta.tax));
                    JOptionPane.showMessageDialog(null, conta);
                    break;
                } //encerra case 2
                case "3": {
                    JOptionPane.showMessageDialog(null, "======> SALDO FINAL DA CONTA: R$ " + (calcular.calcularSaldo(conta.getSaldo(), conta.getDep(), conta.getSaq(), Conta.tax)));
                    JOptionPane.showMessageDialog(null, conta);
                    break;
                } // fim case 3
                case "4": {
                    rodando = false;
                    JOptionPane.showMessageDialog(null, "---> Fazendo LOGOUT...");
                    usuarioLogado = null;
                    break;
                }//fim case 4
                default: {
                    JOptionPane.showMessageDialog(null, "---> Digite uma opção válida!!! ");
                    break;
                }
            }//fim switch

                }//fim while
    }
}

