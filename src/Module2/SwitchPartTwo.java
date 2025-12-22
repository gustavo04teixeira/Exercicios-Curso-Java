package Module2;

import java.util.Scanner;

public class SwitchPartTwo {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String conceito = "";
        System.out.print("Digite a sua nota por favor: ");
        int nota = input.nextInt();

        switch (nota){
            case 5:
                conceito = "Conceito A";
                break;
            case 4:
                conceito = "Conceito B";
                break;
            case 3:
                conceito = "Conceito C";
                break;
            case 2:  case 1:
                conceito = "Conceito D";
                break;

                default:
                    System.out.println("Nota invalida");
        }

        System.out.println(conceito);
    }
}
