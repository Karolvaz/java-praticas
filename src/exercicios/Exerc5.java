package exercicios;

public class Exerc5 {
    public static void main(String[] args) {

        //Fazer um programa que imprima a média aritmética dos números 8, 9 e 7.
        //A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

        double valor1 = 8 + 9 + 7;
        double valor2 = 4 + 5 + 6;
        double mediaValor1;
        double mediaValor2;
        double mediaValores;

        mediaValor1 = valor1 / 3;
        System.out.println("A média de [8,9,7] é " + mediaValor1);

        mediaValor2 = valor2 / 3;
        System.out.println("A média de [4,5,6] é " + mediaValor2);

        mediaValores = (mediaValor1 + mediaValor2) / 2;
        System.out.println("A média de [8,5] é " + mediaValores);
    }
}