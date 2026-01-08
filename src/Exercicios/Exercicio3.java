package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = input.nextInt();

        if (numero1 == numero2){
            int numero3 = numero1 + numero2;
            System.out.println("Os dois números são iguais e a soma deles é: " + numero3);
        }else{
            int numero3 = numero1 + numero2;
            System.out.println("Os números não são iguais e a soma deles é: " + numero3);
        }
    }
}
