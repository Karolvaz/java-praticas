package exerciciosLivro;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Crie um programa que calcule e exiba o perímetro de um círculo, solicitando o raio ao usuário.
        // O perímetro de círculo, com raio de 5 cm é 31,4 cm.

        Scanner leitor = new Scanner(System.in);

        final double PI = 3.1415;
        final int DOIS = 2;

        System.out.print("Informe o raio: ");
        double raioInicial = leitor.nextDouble();

        double diametro = DOIS * raioInicial;
        double perimetro = diametro * PI;
        System.out.printf("O perímetro do círculo é de : %.1f cm.", perimetro);

        leitor.close();
    }
}