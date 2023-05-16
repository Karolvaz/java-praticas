package exercicios;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {

        double salarioMinimo = 788.00;
        double salarioUsuario;
        char repetir = 's';

        Scanner leitor = new Scanner(System.in);

        do{
            System.out.printf("O salário mínimo atual é de: R$ %.2f \n",salarioMinimo);
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