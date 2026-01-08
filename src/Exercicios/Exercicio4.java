package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = input.nextInt();

        System.out.println("Antecessor: " + (numero-1) + " Atual: " + numero + " Sucessor: " + (numero+1));
    }
}
