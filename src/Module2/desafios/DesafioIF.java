package Module2.desafios;

import java.util.Scanner;

public class DesafioIF {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um dia da semana: ");

        String diaSemana = input.nextLine();

        if(diaSemana.equals("domingo")){
            System.out.println("1");
        }else if(diaSemana.equals("segunda")){
            System.out.println("2");
        }else if(diaSemana.equals("terca") || diaSemana.equals("terça")){
            System.out.println("3");
        }else if(diaSemana.equals("quarta")){
            System.out.println("4");
        }else if(diaSemana.equals("quinta")){
            System.out.println("5");
        }else if(diaSemana.equals("sexta")){
            System.out.println("6");
        }else if(diaSemana.equals("sabado")){
            System.out.println("7");
        }
        input.close();
    }
}
