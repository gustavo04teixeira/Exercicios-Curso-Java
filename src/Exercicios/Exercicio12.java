package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do produto que você vai comprar? ");
        double valor = input.nextDouble();

        System.out.print("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "\n" +
                " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "\n" +
                " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "\n" +
                " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%" +
                "\n\n Qual a forma de pagamento? ");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1: valor = valor - (valor * 0.15);
            System.out.printf("Perfeito, realizado a compra do produto com 15% de desconto, totalizando: " + valor);
            break;

            case 2: valor =valor - (valor * 0.10);
            System.out.println("Perfeito, realizado a compra do produto com 10% de desconto, totalizando: " + valor);
            break;

            case 3:
                System.out.println("Perfeito, realizado com sucesso o parcelamento sem " +
                    "juros do valor: " + valor);
            break;

            case 4: valor = valor + (valor * 0.10);
            System.out.println("Perfeito, realizado com sucesso o parcelamento com " +
                        "juros de 10%: " + valor);
            break;

            default:
                System.out.println("Opção incorreta!");
        }

        input.close();
    }
}
