package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.print("===IDENTIFICADOR DE MENTIRA===\n\n" +
            "1- Verdadeiro\n2- Falso" +
            "\nDigite a opção desejada:");

    int opcao1 = input.nextInt();

    System.out.print("Escolha a segunda opção:");
    int opcao2 = input.nextInt();

    if (opcao1 == 1 && opcao2 == 1) {
        System.out.println("Ambas as escolhas são verdadeiras.");
    }else if (opcao1 == 2 && opcao2 == 2) {
        System.out.println("Ambas as escolhas são falsas.");
    }else{
            System.out.println("As escolhas são diferentes.");
    };

    input.close();
    }
}
