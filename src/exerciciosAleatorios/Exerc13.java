package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        //O usuário deve digitar uma frase, e o código deve puxar a 1º letra de cada palavra.

        String frase;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva uma frase: ");
        frase = leitor.nextLine();

        String[] palavrasDaFrase = frase.formatted().split("");
        StringBuilder letra = new StringBuilder();

        for (String palavra : palavrasDaFrase) {
            if (!palavra.isEmpty())
                letra.append(palavra.charAt(0));
        }

        System.out.println("Sua frase é: \n" + frase.toUpperCase());
        System.out.println(letra);

        leitor.close();
    }
}