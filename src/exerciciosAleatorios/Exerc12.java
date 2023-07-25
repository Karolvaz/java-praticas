package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        double valor1;
        double valor2;
        int operador;
        double resultado = 0;
        boolean erroDivisao;
        int repetir;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Bem-vinda(o) à Karol's Calculator \n");

        do {
            System.out.print("Informe o 1º Valor: ");
            valor1 = leitor.nextDouble();

            System.out.print("Digite o número correspondente à sua operação, sendo...\n" +
                    "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
            operador = leitor.nextInt();

            System.out.print("Informe o 2º Valor: ");
            valor2 = leitor.nextDouble();

            erroDivisao = false; // Vai apagar a variável antes de cada cálculo.

            switch (operador) {
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("Você solicitou por: %.2f + %.2f.\n", valor1, valor2);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("Você solicitou por: %.2f - %.2f.\n", valor1, valor2);
                }
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("Você solicitou por: %.2f * %.2f.\n", valor1, valor2);
                }
                case 4 -> {
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                        System.out.printf("Você solicitou por: %.2f / %.2f.\n", valor1, valor2);
                    } else {
                        erroDivisao = true; // Vai deixar a variável como true, se tiver divisão por zero.
                        System.out.println("Erro! Não é possível dividir por zero!");
                    }
                }
                default -> System.out.println("Operador inválido!");
            }

            if (!erroDivisao) { // Vai procurar se não houve divisão por zero, antes de mostrar o resultado.
                if (resultado < 0) {
                    System.out.println("Não é possível calcular número negativo!");
                } else if (resultado > 10_000) {
                    System.out.println("Você estourou o limite!");
                } else {
                    System.out.printf("O resultado da operação é: %.2f\n", resultado);
                }
            }

            System.out.print("Calcular novamente? [ 1: Sim ], [ 2: Aperte Qualquer Tecla] : ");
            repetir = leitor.nextInt();

        } while (repetir == 1);

        System.out.println("Obrigado e até a próxima!");

        leitor.close();
    }
}