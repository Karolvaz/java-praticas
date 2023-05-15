package exerciciosResolvidos;

import java.util.Scanner;

public class exercicioFundamentos3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int celsius;
        double fahrenheit;

        System.out.print("Informe a temperatura em Celsius:  ");
        int valorcelsius = leitor.nextInt();

        celsius = valorcelsius;
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit é de: " + fahrenheit + "º");

        leitor.close();
    }
}
