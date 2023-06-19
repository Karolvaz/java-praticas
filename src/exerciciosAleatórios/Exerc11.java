package exerciciosAleatórios;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        //Existe um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
        // Faça um algoritmo que calcule e escreva:
        //a. a maior e a menor altura do grupo;
        //b. média de altura dos homens;
        //c. o número de mulheres.

        int sexo;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        float altura;
        float somaHomens = 0;
        float mediaHomens = 0;
        float maiorAltura = 0;
        float menorAltura = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i=0; i< 10; i++) {
            System.out.print("Informe o sexo [ 1 - Mulher | 2 - Homem]: ");
            sexo = leitor.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            altura = leitor.nextFloat();

            if (sexo == 1) {
                quantidadeMulheres++;
            } else if (sexo == 2) {
                quantidadeHomens++;
                somaHomens = somaHomens + altura;
            } else {
                System.out.println("Opção inválida!");
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }
        }
        mediaHomens = somaHomens / quantidadeHomens;
        System.out.println("A maior altura do grupo é de " + maiorAltura + " m, e a menor é de " + menorAltura + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + quantidadeMulheres);

        leitor.close();
 }
}