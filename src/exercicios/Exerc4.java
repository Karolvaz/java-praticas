package exercicios;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        //Informar um saldo e imprimir o saldo com reajuste de 1%.

        double saldoInicial;
        float percentual = 1f;
        double saldoReajustado;
        double saldoAtualizado;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        saldoInicial = leitor.nextDouble();

        saldoReajustado = (saldoInicial / percentual) * 100;

        saldoAtualizado = saldoReajustado + saldoInicial;
        System.out.print("O saldo atual é de R$ " + saldoAtualizado);

        leitor.close();
    }
}
