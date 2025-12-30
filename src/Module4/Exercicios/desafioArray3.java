package Module4.Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class desafioArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas que você gostaria de adicionar: ");
        int QuantidadeDeNotas = input.nextInt();

        double[] notasAluno = new double[QuantidadeDeNotas];

        for (int i = 0; i < QuantidadeDeNotas; i++ ) {
            System.out.print("Digite a sua nota: ");
            notasAluno[i] = input.nextDouble();
        }

        double soma = 0;
        for(double nota : notasAluno){
            soma += nota;
        }

        double media = soma / QuantidadeDeNotas;
        System.out.println("A média do aluno é: " + media);


        input.close();
    }
}
