package exerciciosLivro;

import java.util.Scanner;
public class Exercicio4 {
        public static void main(String[] args) {
                // Escreva um programa que calcule a média geométrica entre 4 números, informados pelo usuário.
                // A média geométrica de 3, 12, 16 e 36 será igual a 12.

                Scanner leitor = new Scanner(System.in);

                System.out.print("Informe o 1º valor: ");
                double valor1 = leitor.nextInt();

                System.out.print("Informe o 2º valor: ");
                double valor2 = leitor.nextInt();

                System.out.print("Informe o 3º valor: ");
                double valor3 = leitor.nextInt();

                System.out.print("Informe o 4º valor: ");
                double valor4 = leitor.nextInt();

                double mediaValores = Math.pow(valor1 * valor2 * valor3 * valor4, 1.0 / 4.0);
                System.out.println("A média geométrica dos valores informados é de: " + mediaValores);

                leitor.close();
        }
}