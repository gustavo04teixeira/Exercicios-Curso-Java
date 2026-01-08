package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor um: ");
        double valorUm= input.nextDouble();

        System.out.print("Digite o valor dois: ");
        double valorDois= input.nextDouble();

        System.out.print("Digite o valor três: ");
        double valorTres= input.nextDouble();

        double soma = valorUm+valorDois;
        if (soma > valorTres){
            System.out.print("A soma do Valor Um e do Valor Dois é: " + soma +
                    " ,e a soma é maior que o Valor Três: " + valorTres);
        }else{
            System.out.print("A soma do Valor Um e do Valor Dois é: " + soma +
                    " ,e a soma é menor que o Valor Três: " + valorTres);
        }
    }
}
