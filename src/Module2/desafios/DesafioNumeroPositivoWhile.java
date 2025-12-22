package Module2.desafios;

import java.util.Scanner;

public class DesafioNumeroPositivoWhile {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int soma = 0;
        int  numero = 0;

        while(numero >= 0){
            System.out.print("Digite um numero: ");
            numero = input.nextInt();

            soma += numero;

            System.out.println("A soma dos numeros é: " + soma);
        }

        System.out.println("Fim do programa");

        input.close();
    }
}
