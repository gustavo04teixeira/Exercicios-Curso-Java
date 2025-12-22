package Module2.desafios;

import java.util.Scanner;

public class DesafioVerificarNumero {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Double numero = input.nextDouble();

        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            System.out.println("O número está dentro do limite e é par");
        }else if(numero >= 0 && numero <= 10 && numero % 2 == 1){
            System.out.println("O número esta dentro do limite mas é impar");
        }else{
            System.out.println("número invalido");
        }
    }
}
