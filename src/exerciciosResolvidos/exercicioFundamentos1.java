package exerciciosResolvidos;

import java.util.Scanner;

public class exercicioFundamentos1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1º Valor: ");
        int valor1 = leitor.nextInt();

        System.out.print("Digite o 2º Valor: ");
        int valor2 = leitor.nextInt();

        System.out.print("Digite o 3º Valor: ");
        int valor3 = leitor.nextInt();

        int mediaValores = (valor1 + valor2 + valor3) / 3;
        System.out.println("A média dos três valores é: " + mediaValores);

        leitor.close();
    }
}
