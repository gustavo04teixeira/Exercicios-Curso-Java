package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = input.nextDouble();

        System.out.print("Digite a seu peso: ");
        double peso = input.nextDouble();

        double calculo = peso / (Math.pow(altura,2));

        if (calculo <= 18.5){
            System.out.println("O seu IMC está abaixo do peso: " + calculo);
        } else if(calculo > 18.5 && calculo <= 25 ){
            System.out.println("Parabéns! O seu IMC está ideal: " + calculo);
        } else if(calculo > 25 && calculo <= 29.9){
            System.out.println("O seu IMC está levemente acima do peso: " + calculo);
        }else if(calculo > 29.9 && calculo <= 34.9){
            System.out.println("O seu IMC está como Obesidade Grau I: " + calculo);
        }else if(calculo > 34.9 && calculo <= 39.9){
            System.out.println("O seu IMC está como Obesidade Grau II: " + calculo);
        }else{
            System.out.println("O seu IMC está como Obesidade Grau III: " + calculo);
        }

        input.close();
    }
}
