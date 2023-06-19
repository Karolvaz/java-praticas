package exerciciosAleatórios;

public class Exerc9 {
    public static void main(String[] args) {
        // Calcular e apresentar o valor do volume de uma lata de óleo.
        // Utilizando fórmula: Volume = 3.14159 * Raio * Raio * Altura.
        // Para confirmar a resposta utilize, V = 3.14159 * 3.2 * 3.2 * 4.9.

        final double V = 3.14159;
        double R = 3.2;
        double A = 4.9;

        double volumeFinal = V * R * R * A;
        System.out.printf("O volume do produto informado é de %.2f.",volumeFinal);
    }
}
