package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        double valor1;
        double valor2;
        int operador;
        double resultado = 0;
        int repetirTudo;


        Scanner leitor = new Scanner(System.in);
        System.out.print("Bem-vinda(o) à Karol's Calculator \n");
        System.out.println();

        System.out.print("Digite o 1º valor: ");
        valor1 = leitor.nextDouble();

        do {
            System.out.print("Digite o número correspondente à operação, sendo.. \n " +
                "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
            operador = leitor.nextInt();
            } while (operador < 1 || operador > 4);
                System.out.print("Digite o 2º valor: ");
                valor2 = leitor.nextInt();

        System.out.println();

        if (operador == 1){
            resultado = valor1 + valor2;
            System.out.println("Você informou: " + valor1 + " + " + valor2);
        } if (operador == 2){
            resultado = valor1 - valor2;
            System.out.println("Você informou: " + valor1 + " - " + valor2);
        } if (operador == 3){
            resultado = valor1 * valor2;
            System.out.println("Você informou: " + valor1 + " * " + valor2);
        } if (operador == 4){
            resultado = valor1 / valor2;
            System.out.println("Você informou " + valor1 + " / " + valor2);
        }

        System.out.println("O resultado da Operação é: " + resultado);
        System.out.println();

        do{
            System.out.println("Calcular novamente? [ 1: Sim ], [ 2 - Não ]");
            repetirTudo = leitor.nextInt();
        } while (repetirTudo == 2);

        System.out.print("Digite o 1º valor: ");
        valor1 = leitor.nextDouble();

        do {
            System.out.print("Digite o número correspondente à operação, sendo.. \n " +
                    "[ 1: + ], [ 2: - ], [ 3: * ], [ 4: / ] : ");
            operador = leitor.nextInt();
        } while (operador < 1 || operador > 4);
        System.out.print("Digite o 2º valor: ");
        valor2 = leitor.nextInt();

        System.out.println();

        if (operador == 1){
            resultado = valor1 + valor2;
            System.out.println("Você informou: " + valor1 + " + " + valor2);
        }
        if (operador == 2){
            resultado = valor1 - valor2;
            System.out.println("Você informou: " + valor1 + " - " + valor2);
        }
        if (operador == 3){
            resultado = valor1 * valor2;
            System.out.println("Você informou: " + valor1 + " * " + valor2);
        }
        if (operador == 4){
            resultado = valor1 / valor2;
            System.out.println("Você informou " + valor1 + " / " + valor2);
        }

        System.out.println("O resultado da Operação é: " + resultado);
        System.out.println();

        do{
            System.out.println("Calcular novamente? [ 1: Sim ], [ 2 - Não ]");
            repetirTudo = leitor.nextInt();
        } while (repetirTudo != 2);
        System.out.println("Obrigado, até a próxima");

        leitor.close();
    }
}