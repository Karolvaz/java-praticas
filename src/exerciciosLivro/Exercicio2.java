package exerciciosLivro;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva um programa que calcule a média arirmética de dois números.

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Informe o 1º número: ");
        double numero2 = leitor.nextDouble();

        double media = (numero1 + numero2) / 2;
        System.out.println("A média dos números informados é: " + media);

        leitor.close();
    }
}
