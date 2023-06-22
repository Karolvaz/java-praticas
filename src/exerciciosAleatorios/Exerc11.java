package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        // Crie um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 5 pessoas.
        // Faça um algoritmo que calcule e imprima:
        //a. a maior e a menor altura do grupo.
        //b. média de altura dos homens.
        //c. o número de mulheres.

        final int QTD_PESSOAS = 5;
        double[] altura = new double[5];
        String[] sexo = new String[5];
        double maiorAltura = 0;
        double menorAltura = 0;

        int i = 0;
        double somaAlturaDosHomens = 0.0;
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double mediaAlturaDosHomens = 0.0;

        Scanner sc = new Scanner(System.in);

        for(int index = 0; index < QTD_PESSOAS; index++) {
            System.out.print("Informe a altura: ");
            altura[index] = sc.nextDouble();

            System.out.print("Informe o sexo: ");
            sexo[index] = sc.next();

            if (altura[index] > 0) {
                if (altura[index] > maiorAltura) {
                    maiorAltura = altura[index];
                }

                if (altura[index] < menorAltura && menorAltura != 0) {
                    menorAltura = altura[index];
                }

                if (menorAltura == 0) {
                    menorAltura = altura[index];
                }
            }
        }

        do {
            if (sexo[i].equals("m")) {
                somaAlturaDosHomens += altura[i];
                qtdHomens += 1;
            } else {
                qtdMulheres += 1;
            }
            i++;
        } while (i < QTD_PESSOAS);

        mediaAlturaDosHomens = somaAlturaDosHomens / qtdHomens;

        System.out.println("A menor altura é " + menorAltura);
        System.out.println("A maior altura é " + maiorAltura);

        System.out.println("A quantidade de mulheres é de " + qtdMulheres);
        System.out.println("A média da altura dos homens é de " + mediaAlturaDosHomens);

        sc.close();
    }
}