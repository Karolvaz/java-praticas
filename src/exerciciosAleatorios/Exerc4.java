package exerciciosAleatorios;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        //Informar um saldo e imprimir o saldo com reajuste de 1%.

        double saldoInicial;
        int percentual = 100;
        double saldoReajustado;
        double saldoAtualizado;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        saldoInicial = leitor.nextDouble();

        saldoReajustado = (saldoInicial / percentual);

        saldoAtualizado = saldoReajustado + saldoInicial;
        System.out.printf("O saldo atual é de R$ %.2f", saldoAtualizado);

        leitor.close();
    }
}
