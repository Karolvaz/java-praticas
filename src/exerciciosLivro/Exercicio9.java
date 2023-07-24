package exerciciosLivro;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Escreva um programa que calcule o perímetro e a área de um retângulo.
        // Utilizando as fórmulas P = 2(l + c) e A=lc, onde l é a largura e c é o comprimento.

        double largura;
        double comprimento;
        double perimetro;
        double area;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a Largura: ");
        largura = leitor.nextDouble();

        System.out.print("Informe o comprimento: ");
        comprimento = leitor.nextDouble();

        perimetro = 2 * largura + comprimento;
        area = largura * comprimento;

        System.out.println("O perímetro é: " + perimetro);
        System.out.println("A área é: " + area);
        leitor.close();
    }
}

