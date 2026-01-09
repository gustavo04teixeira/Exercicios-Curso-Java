package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um um numero: ");
        int numero = input.nextInt();

        double reajuste = numero * 0.05;

        double resultado = numero + reajuste;

        System.out.println("Segue o seu número com 5% de reajuste: " + resultado);
        input.close();
    }
}
