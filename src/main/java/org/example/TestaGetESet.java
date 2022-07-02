package org.example;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        //conta.numero = 1337;//
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente anne = new Cliente();
        //conta.titular = anne;//
        anne.setNome("anne monteiro");

        conta.setTitular(anne);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programadora");
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programadora");

        System.out.println(titularDaConta);
        System.out.println(anne);
        System.out.println(conta.getTitular());
    }

}