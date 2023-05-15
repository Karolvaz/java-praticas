package exerciciosResolvidos;

import java.util.Scanner;

public class exercicioFundamentos2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int anoValor = leitor.nextInt();

        System.out.print("Digite o mês: ");
        int mesValor = leitor.nextInt();

        System.out.print("Digite o dia: ");
        int diaValor = leitor.nextInt();

        int idadeEmDias = (anoValor * 365) + (mesValor * 30) + diaValor;
        System.out.println("Sua idade em dias é: " + idadeEmDias);

        leitor.close();
    }
}
