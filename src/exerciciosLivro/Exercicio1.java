package exerciciosLivro;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Escreva um programa que solicite ao usuário dois números
        // E exiba a soma, subtração, multiplicação e divição entre eles.

        int numero1;
        int numero2;
        int soma;
        long subtracao;
        long multiplicacao;
        long divisao;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        numero1 = leitor.nextInt();

        System.out.print("Digite o 2º número: ");
        numero2 = leitor.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = (long) numero1 * numero2;
        divisao = numero1 / numero2;

        System.out.printf("Você informou o número %d e o número %d. \n", numero1, numero2);
        System.out.println("A soma dos dois números é " + soma + ".");
        System.out.println("A subtração dos dois números é " + subtracao + ".");
        System.out.println("A multiplicação dos dois números é " + multiplicacao + ".");
        System.out.println("A divisão dos dois números é " + divisao + ".");

        leitor.close();
    }
}
