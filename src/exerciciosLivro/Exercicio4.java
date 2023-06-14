package exerciciosLivro;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercicio4 {
    public static void main(String[] args) {
        // Escreva um programa que calcule a média geométrica entre três números, informados pelo usuário.
        // A média geométrica de 2, 8 e 32 será igual a 8.

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o 1º valor: ");
        int valor1 = leitor.nextInt();

        System.out.print("Informe o 2º valor: ");
        int valor2 = leitor.nextInt();

        System.out.print("Informe o 3º valor: ");
        int valor3 = leitor.nextInt();

        int mediaValores= (int) Math.pow((valor1 * valor2 * valor3), 1.0/3.0);
        System.out.println("A média geométrica é: " + mediaValores );

        leitor.close();
 }
}