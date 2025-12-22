package Module1.Desafios;

import java.util.Scanner;

public class CalculadoraIMC {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        double IMC = peso / (altura  * altura);

        System.out.print("Seu imc é: " + IMC);
    }
}
