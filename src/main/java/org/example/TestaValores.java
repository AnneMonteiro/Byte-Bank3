package org.example;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);

        System.out.println(conta.getAgencia());


        Conta conta1 = new Conta(1414,56560);
        Conta conta2 = new Conta(7878,89897);

        System.out.println("-------------------------------");
        System.out.println("O total de contas abertas foram: " +Conta.getTotal());

    }
}
