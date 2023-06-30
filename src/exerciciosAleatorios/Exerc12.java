package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        double valor1;
        double valor2;
        int operador;
        double resultado = 0;

        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;

        int valorDigitado;
        int repetirTudo;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Bem-vinda(o) à Karol's Calculator \n");

        do {
            System.out.print("Informe o 1º Valor: ");
            valor1 = leitor.nextDouble();

            System.out.print("Digite o número correspondente à sua operação, sendo...\n" +
                    "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
            operador = leitor.nextInt();

            if (operador <= 0 || operador >= 5){
                System.out.println("Operação inválida, repita o procedimento... ");
            }

        } while (operador < 1 || operador > 4);
        System.out.print("Informe o 2º Valor: ");
        valor2 = leitor.nextDouble();

        if (operador == 1){
            soma = valor1 + valor2;
            resultado = soma;
            System.out.printf("Você solicitou por: %.2f + %.2f.\n", valor1, valor2);
            System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
        } else if (operador == 2){
            subtracao = valor1 - valor2;
            resultado = subtracao;
            System.out.printf("Você solicitou por: %.2f - %.2f.\n", valor1, valor2);
            System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
        } else if (operador == 3){
            multiplicacao = valor1 * valor2;
            resultado = multiplicacao;
            System.out.printf("Você solicitou por: %.2f * %.2f.\n", valor1, valor2);
            System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
        } else if (operador == 4){
            divisao = valor1 / valor2;
            resultado = divisao;
            System.out.printf("Você solicitou por: %.2f / %.2f.\n", valor1, valor2);
            System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
        } else if (resultado > 10_000){
            System.out.println("Você estourou o limite.");
        } if (resultado <0){
            System.out.println("Não é possível processar número negativo.");
        }

        do{
            System.out.print("Calcular novamente? [ 1: Sim ], [ 2 - Qualquer tecla para encerrar. ]: ");
            valorDigitado = leitor.nextInt();
            repetirTudo = valorDigitado;

            if (repetirTudo ==1){
                do {
                    System.out.print("Informe o 1º Valor: ");
                    valor1 = leitor.nextDouble();

                    System.out.print("Digite o número correspondente à sua operação, sendo...\n" +
                            "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
                    operador = leitor.nextInt();

                    if (operador <= 0 || operador >= 5){
                        System.out.println("Operação inválida, repita o procedimento... ");
                    }

                } while (operador < 1 || operador > 4);
                System.out.print("Informe o 2º Valor: ");
                valor2 = leitor.nextDouble();

                if (operador == 1){
                    soma = valor1 + valor2;
                    resultado = soma;
                    System.out.printf("Você solicitou por: %.2f + %.2f.\n", valor1, valor2);
                    System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
                } else if (operador == 2){
                    subtracao = valor1 - valor2;
                    resultado = subtracao;
                    System.out.printf("Você solicitou por: %.2f - %.2f.\n", valor1, valor2);
                    System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
                } else if (operador == 3){
                    multiplicacao = valor1 * valor2;
                    resultado = multiplicacao;
                    System.out.printf("Você solicitou por: %.2f * %.2f.\n", valor1, valor2);
                    System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
                } else if (operador == 4){
                    divisao = valor1 / valor2;
                    resultado = divisao;
                    System.out.printf("Você solicitou por: %.2f / %.2f.\n", valor1, valor2);
                    System.out.printf("O Resultado da operação é: %.2f.\n", resultado);
                } else if (resultado > 10_000){
                    System.out.println("Você estourou o limite.");
                } if (resultado <0){
                    System.out.println("Não é possível processar número negativo.");
                }

            }
            repetirTudo++;

        } while (repetirTudo == 2);
        System.out.println("Obrigado e até a próxima!");


        leitor.close();
    }
}
