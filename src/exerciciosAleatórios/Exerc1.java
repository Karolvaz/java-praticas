package exerciciosAleatórios;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        double altura;
        double base;
        double area;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor da altura: ");
        altura = leitor.nextDouble();

        System.out.print("Informe o valor da base: ");
        base = leitor.nextDouble();

        area = base * altura / 2;
        System.out.println("O valor da área informada é: " + area);

        leitor.close();
    }
}