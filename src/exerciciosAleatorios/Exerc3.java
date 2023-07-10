package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {

        //Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário.
        //Calcule a quantidade de salários mínimos, esse usuário ganha e imprima o resultado.
        // 1SM=R$788,00.

        double salarioMinimo = 788.00;
        double salarioUsuario;
        char repetir;

        Scanner leitor = new Scanner(System.in);

        System.out.printf("O salário mínimo atual é de: R$ %.2f \n",salarioMinimo);

        do{
            System.out.print("Informe o seu salário atual: ");
            salarioUsuario = leitor.nextDouble();

            double minimoUsuario = salarioUsuario / salarioMinimo;
            System.out.printf("Você recebe R$ %.2f que é equivalente à %.2f salários mínimos.\n",
                    salarioUsuario, minimoUsuario);

            do{
                System.out.print("Deseja repetir a operação (s/n)? ");
                repetir = leitor.next().toLowerCase().charAt(0);

            } while (repetir != 's' && repetir != 'n');

        } while (repetir == 's');

        leitor.close();
    }
}