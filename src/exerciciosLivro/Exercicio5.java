package exerciciosLivro;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Escreva um programa que calcule o IMC de um indivíduo.
        // Utilizando a fórmula IMC = peso / altura².

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        double peso = leitor.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %.1f", imc);

        leitor.close();
    }
}
