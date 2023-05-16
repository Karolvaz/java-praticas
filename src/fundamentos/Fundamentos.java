package fundamentos;

public class Fundamentos {

    // EXERCÍCIO 1
    // Encontre a média aritmética de 3 valores inteiros distindos vindos por parâmetro.
    // O resultado deverá coincidir com o resultado mostrado no terminal.
    // O resultado deverá ser também um número inteiro.
    public int exercicio1(int a, int b, int c) {

        int mediaValores = (a + b + c) / 3;
        return mediaValores;
    }


    // EXERCÍCIO 2
    // Faça um algoritmo que leia a idade de uma pessoa em dias.
    // Considere o ano com 365 dias e os meses com 30 dias.
    // Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.
    public int exercicio2(int ano, int mes, int dia) {

        int idadeEmDias = (ano * 365 + mes * 30) + dia;
        return idadeEmDias;
    }


    // EXERCÍCIO 3
    // Converta a temperatura em graus celsius para Fahrenheit
    // Fórumula: F = C * 1.8 + 32
    public double exercicio3(int celsius) {

        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }


    // EXERCÍCIO 4
    // Retorne um caractere aleatório minúsculo de uma palavra aleatória vindos como parâmetro do método.
    // Exemplo: palavraSorteada: "Carro", posicaoDoCaractereSorteado: 0, resposta: 'c'
    public char exercicio4(String palavraSorteada, int posicaoDoCaractereSorteado) {


        return 'a';
    }


    // EXERCÍCIO 5
    // Encontre o resultado da raíz quadrada de "a".
    // Se "a" for igual à 36, a resposta deverá ser igual a 6.
    public int exercicio5(int a) {

        return 0;
    }
}