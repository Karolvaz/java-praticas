package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        // Crie um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 5 pessoas.
        // Faça um algoritmo que calcule e imprima:
        //a. a maior e a menor altura do grupo.
        //b. média de altura dos homens.
        //c. o número de mulheres.

        int sexo;
        int numMulheres = 0;
        int numHomens = 0;

        double alturaGrupo;
        double alturaHomens = 0;
        double maiorAltura = 0;
        double menorAltura = 0;
        double mediaHomens = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Qual o sexo 1 - Mulher | 2 - Homem: ");
            sexo = leitor.nextInt();

            System.out.print("Qual a altura da pessoa: ");
            alturaGrupo = leitor.nextDouble();

            if (sexo == 1) {
                numMulheres++;
            } else if (sexo == 2) {
                numHomens++;
            } else {
                System.out.println("Opção inválida!");
            }

            if (numHomens == alturaGrupo) {
                alturaHomens++;
            }

            mediaHomens = numHomens / alturaHomens;

            if (alturaGrupo > maiorAltura){
                maiorAltura = alturaGrupo;
            } else if (menorAltura < alturaGrupo) {
                menorAltura = alturaGrupo;
            }
        }

        System.out.println("A maior altura é " + maiorAltura + " e a menor altura do grupo é " + menorAltura);
        System.out.println("A altura media dos homens é " + mediaHomens + ".");
        System.out.println("O número de mulheres no grupo é " + numMulheres + ".");

        leitor.close();
    }
}