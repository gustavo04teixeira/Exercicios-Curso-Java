package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        double salarioMinimo = 1293.00;

        Scanner input = new Scanner(System.in);

        double salario;
        System.out.print("Qual o seu salário? ");
        salario = input.nextDouble();

        double calculo = salario / salarioMinimo;

        System.out.printf("O seu salário é equivalente %.2f salários minimos.", calculo);

        input.close();
    }
}
