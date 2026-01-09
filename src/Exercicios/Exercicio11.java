package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 =  input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 =  input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 =  input.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 =  input.nextDouble();

        double media = (nota1+nota2+nota3+nota4) / 4;

        if(media >= 7){
            System.out.println("Você foi aprovado! Segue a sua média: " + media);
        }else{
            System.out.println("Você foi reprovado! Segue a sua média: " + media);
        }

        input.close();
    }
}
