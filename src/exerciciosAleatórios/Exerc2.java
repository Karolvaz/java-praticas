package exerciciosAleatórios;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias.
        //Ex: 3 anos, 2 meses e 15 dias = 1170 dias.

        int ano;
        int mes;
        int dia;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        ano = leitor.nextInt();

        System.out.print("Informe o mês: ");
        mes = leitor.nextInt();

        System.out.print("Informe o dia: ");
        dia = leitor.nextInt();

        int anosEmDias = ano * 365 + mes * 30 + dia;
        System.out.println("Sua idade em dia é: " + anosEmDias);

        leitor.close();
    }
}
