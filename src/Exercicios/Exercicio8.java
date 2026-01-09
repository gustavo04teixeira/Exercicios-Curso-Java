package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = input.nextInt();

        System.out.print("\nDigite o segundo numero: ");
        int num2 = input.nextInt();

        System.out.print("\nDigite o terceiro numero: ");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.printf("Segue a ordem dos números descrecentes: %d, %d, %d", num3, num2, num1);
        }else if(num1 > num2 && num2 > num3) {
            System.out.printf("Segue a ordem dos números descrecentes: %d, %d, %d", num1, num2, num3);
        }else if(num1 > num2 && num1 > num3 && num2 < num3) {
            System.out.printf("Segue a ordem dos números descrecentes: %d, %d, %d", num1, num3, num2);
        }else if(num1 < num2 && num2 > num3 && num1 > num3) {
            System.out.printf("Segue a ordem dos números descrecentes: %d, %d, %d", num2, num1, num3);
        }else if(num1 > num2 && num1 < num3 && num2 < num3) {
            System.out.printf("Segue a ordem dos números descrecentes: %d, %d, %d", num3, num1, num2);
        }else{
            System.out.printf("Segue a ordem dos números descrecentes: %d, %d, %d", num2, num3, num1);
        }

        input.close();
    }
}
