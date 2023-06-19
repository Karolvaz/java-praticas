package exerciciosLivro;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Escreva um programa que calcule a área de um círculo a partir do raio.
        // Utilizando a fórmula (A = π r²).

        Scanner leitor = new Scanner(System.in);

        final double PI = 3.1415;
        double area;

        System.out.print("Informe o valor de umm raio: ");
        double raio  = leitor.nextDouble();

        area = PI * (raio * raio) ;
        System.out.printf("A área de um círculo a partir do raio informado é %.2f.",area);

        leitor.close();
     }
}
