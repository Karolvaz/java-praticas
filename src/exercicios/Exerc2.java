package exercicios;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

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
