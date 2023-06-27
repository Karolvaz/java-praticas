package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        double valor1;
        double valor2;
        int valorOperador;
        int operador;
        double resultado = 0;

        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;

        int valorDigitado;
        boolean repetirTudo;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Bem-vinda(o) à Karol's Calculator \n");

        do {
            System.out.print("Digite o 1º valor: ");
            valor1 = leitor.nextDouble();

            System.out.print("Digite o número correspondente à operação, sendo.. \n " +
                    "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
            valorOperador = leitor.nextInt();
            operador = valorOperador;

            System.out.print("Digite o 2º valor: ");
            valor2 = leitor.nextDouble();

            if (operador == 1) {
                soma = valor1 + valor2;
                resultado = soma;
                System.out.printf("Você informou: %.2f + %.2f.\n", valor1, valor2);
            }
            if (operador == 2) {
                subtracao = valor1 - valor2;
                resultado = subtracao;
                System.out.printf("Você informou: %.2f - %.2f.\n", valor1, valor2);
            }
            if (operador == 3) {
                multiplicacao = valor1 * valor2;
                resultado = multiplicacao;
                System.out.printf("Você informou: %.2f * %.2f.\n", valor1, valor2);
            }
            if (operador == 4) {
                divisao = valor1 / valor2;
                resultado = divisao;
                System.out.printf("Você informou: %.2f /+ %.2f.\n", valor1, valor2);
            }

        } while (operador < 1 || operador > 4);
        System.out.printf("O resultado é %.2f\n", resultado);


        do{
            System.out.print("Calcular novamente? [ 1: Sim ], [ 2 - Não ]: ");
            valorDigitado = leitor.nextInt();
            repetirTudo = (valorDigitado == 1);

             if (repetirTudo){
                 System.out.print("Digite o 1º valor: ");
                 valor1 = leitor.nextDouble();

                 System.out.print("Digite o número correspondente à operação, sendo.. \n " +
                         "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
                 operador = leitor.nextInt();

                 System.out.print("Digite o 2º valor: ");
                 valor2 = leitor.nextDouble();

                 if (operador == 1){
                     soma = valor1 + valor2;
                     resultado = soma;
                     System.out.printf("Você informou: %.2f + %.2f.\n", valor1, valor2);
                 } if (operador == 2){
                     subtracao = valor1 - valor2;
                     resultado = subtracao;
                     System.out.printf("Você informou: %.2f - %.2f.\n", valor1, valor2);
                 } if (operador == 3){
                     multiplicacao = valor1 * valor2;
                     resultado = multiplicacao;
                     System.out.printf("Você informou: %.2f * %.2f.\n", valor1, valor2);
                 } if (operador == 4){
                     divisao = valor1 / valor2;
                     resultado = divisao;
                     System.out.printf("Você informou: %.2f /+ %.2f.\n", valor1, valor2);
                 }
                 System.out.println("O resultado da Operação é: " + resultado);
             }
              valorDigitado++;

        } while (valorDigitado == 2);
        System.out.println("Obrigado e até a próxima!");

        leitor.close();
    }
}