package exerciciosLivro;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Escreva um programa que calcule o perímetro e a área de um triângulo.
        // Utilizando as fórmula P = a + b + c e A = (b * h) / 2.
        // Onde a, b e c são lados do triângulo e h é a altura relativa ao lado b.

        double ladoA;
        double ladoB;
        double ladoC;
        double altura;
        double perimetro;
        double area;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor A: ");
        ladoA = leitor.nextDouble();

        System.out.print("Informe o valor B: ");
        ladoB = leitor.nextDouble();

        System.out.print("Informe o valor C: ");
        ladoC = leitor.nextDouble();

        System.out.print("Digite a altura 'H' relativa ao Lado B: ");
        altura = leitor.nextDouble();

        perimetro = ladoA + ladoB + ladoC;
        area = ladoB * altura / 2;

        System.out.print("O perímetro do triângulo é: " + perimetro);
        System.out.print("A área do triângulo é: " + area);

        leitor.close();
    }
}
