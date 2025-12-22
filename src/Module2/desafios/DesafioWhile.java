package Module2.desafios;

import java.util.Scanner;

public class DesafioWhile {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int QuantidadeNotas = 0;
        double nota = 0;
        double ValorTotal = nota;

        while(nota !=-1){
            System.out.print("Qual a sua outra nota?");
            nota = input.nextDouble();

            if(nota >= 0 && nota <= 10){
                ValorTotal = ValorTotal + nota;
                QuantidadeNotas++;
            }

        }

        Double media = (ValorTotal / QuantidadeNotas);
        System.out.println(media);
    }
}
