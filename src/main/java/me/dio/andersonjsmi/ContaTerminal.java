package me.dio.andersonjsmi;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        String read;
        System.out.println("Por favor, digite o número da Conta!");
        read = scanner.nextLine();
        conta.setNumero(Integer.parseInt(read));

        System.out.println("Por favor, digite o número da Agência!");
        read = scanner.nextLine();
        conta.setAgencia(read);

        System.out.println("Por favor, digite o Nome do Propietário Conta!");
        read = scanner.nextLine();
        conta.setNome(read);

        System.out.println("Por favor, digite o saldo da Conta!");
        read = scanner.nextLine();
        conta.setSaldo(Double.parseDouble(read));

        System.out.println("Olá " + conta.getNome()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia()
                + ", conta " + conta.getNumero()
                + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");

    }
}