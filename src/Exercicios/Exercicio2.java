package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0 && numero >= 0){
            System.out.println("O número é par e maior que zero!");
        }else if (numero % 2 == 0 && numero <= 0){
            System.out.println("O número é par e menor que zero!");
        }else if (numero % 2 == 1 && numero >= 0){
            System.out.println("O número é impar e maior que zero!");
        }else{
            System.out.println("O número é impar e menor que zero!");
        }
    }
}
