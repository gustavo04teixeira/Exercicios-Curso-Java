package Module2.desafios;

import java.util.Scanner;

public class DesagioAdivinharNumero {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 84;

        for (int rodadas = 1; rodadas <= 10; rodadas++){
            System.out.print("Digite um numero: ");
            int tentativa = input.nextInt();

            if(numero != tentativa && tentativa > numero){
                System.out.println("O número da rodada é:  " + rodadas + " , o seu número é maior.");
            }else if (numero != tentativa && tentativa < numero){
                System.out.println("O número da rodada é:  " + rodadas + " , o seu número é menor.");
            }else{
                System.out.println("Parabéns você acertou o número!!");
                break;
            }

        }
        input.close();
    }
}
