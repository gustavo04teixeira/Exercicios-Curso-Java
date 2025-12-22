package Module2.desafios;

import java.util.Scanner;

public class DesafioNotas {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nota: ");
        double nota1 =  input.nextDouble();
        System.out.print("Digite sua outra nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media < 7 && media > 4){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
