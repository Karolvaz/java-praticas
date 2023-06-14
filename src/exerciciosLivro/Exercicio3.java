package exerciciosLivro;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário.

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        double valor1 = leitor.nextDouble();

        System.out.print("Informe o 2º número: ");
        double valor2 = leitor.nextDouble();

        System.out.print("Informe o 3º número: ");
        double valor3 = leitor.nextDouble();

        double media = (valor1 + valor2 + valor3) / 3;
        System.out.printf("A média aritmética dos valores informados é: %.2f", media);

        leitor.close();
    }
}
