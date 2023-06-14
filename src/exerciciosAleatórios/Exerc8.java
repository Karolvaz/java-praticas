package exerciciosAleatórios;
public class Exerc8 {
    public static void main(String[] args) {
        // Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30.
        // E a multiplicação dos números pares entre 0 e 30.

        // Resultado da Soma números impares = 225.
        // Resultado da Multiplicação números pares = 1428329123020800.

        int valorMin = 1;
        int valorMax = 29;
        int somaImpares = 0;
        long multPares = 1;

//        for (; valorMin <= valorMax; valorMin++) {
//            if (valorMin % 2 == 1) {
//                somaImpares = somaImpares + valorMin;
//            } else {
//                multPares = multPares * valorMin;
//            }
//        }



//        do {
//            if (valorMin % 2 == 0) {
//                multPares = multPares * valorMin;
//            } else {
//                somaImpares = somaImpares + valorMin;
//            }
//            valorMin++;
//        } while (valorMin <= valorMax);



        while (valorMin <= valorMax) {
            if (valorMin % 2 == 0) {
                multPares = multPares * valorMin;
            } else {
                somaImpares = somaImpares + valorMin;
            }
            valorMin++;
        }

        System.out.println(somaImpares);
        System.out.println(multPares);

    }
}
