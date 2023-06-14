package exerciciosAleatórios;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {
        //Desenvolva um algoritmo em Java que leia um número inteiro.
        //E imprima o seu antecessor e seu sucessor.

        int numero;
        int antecessor;
        int sucessor;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número: ");
        numero = leitor.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("O número informado foi " + numero + " seu antecessor é " + antecessor +
                " e seu sucessor é " + sucessor + ".");

        leitor.close();
    }
}
