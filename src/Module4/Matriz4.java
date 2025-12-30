package Module4;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = input.nextInt();

        System.out.print("Digite a quantidade de notas por aluno: ");
        int qtdNotas = input.nextInt();

        double[][] notasAlunos = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int a = 0; a < qtdAlunos; a++){
            for(int n = 0; n < qtdNotas; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", (n+1), (a+1));
                notasAlunos[a][n] =  input.nextDouble();
                total += notasAlunos[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média dos alunos é: " + media);

        for (double[] notasDaTurma : notasAlunos) {
            System.out.println(Arrays.toString(notasDaTurma));
        }


        input.close();
    }
}
