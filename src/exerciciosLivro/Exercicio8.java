package exerciciosLivro;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Escreva um programa que calcule o delta de uma equação de 2º grau (Δ = b2 – 4ac).

        double a;
        double b;
        double c;
        double delta;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        a = leitor.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = leitor.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = leitor.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O resultado da equação é: " + delta + ".");
        leitor.close();
    }
}
