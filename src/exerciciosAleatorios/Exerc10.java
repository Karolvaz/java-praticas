package exerciciosAleatorios;

public class Exerc10 {
    public static void main(String[] args) {
        // Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa
        // de M quilogramas a uma altura de H metros em T segundos.
        // Considere Cavalos = (M * H / T) / 745,6999.
        // Para confirmar considere Cavalos = (21 * 2.2 / 1.4) / 745,6999 = 0.044253727270179344.

        double cavalos;
        double m = 21;
        double h = 2.2;
        double t = 1.4;

        cavalos =  (m * h / t)/745.6999;
        System.out.println("A quantidade de cavalos é " + cavalos + ".");
    }
}
