package Module4.Exercicios;

import java.util.Arrays;

public class exercicioForEach {
        public static void main(String[] args) {
            double [] notasAlunos1 = new double[5];

            notasAlunos1[2] = 7.3;
            notasAlunos1[1] = 1.3;
            notasAlunos1[0] = 5.3;
            notasAlunos1[3] = 2.4;
            notasAlunos1[4] = 7.4;

            System.out.println(Arrays.toString(notasAlunos1));

            int totalAlunos1 = 0;
            for (double nota : notasAlunos1) {
                totalAlunos1 += nota;
            }
            double media =  totalAlunos1 / notasAlunos1.length;
            System.out.println("Média do aluno: " + media);

            //Notas da segunda classe de alunos
            double notaRecuperacao = 7.8;
            double[] notasAlunos2 = {4.4 , notaRecuperacao, 8.8};

            System.out.println("\nNota do aluno: " + Arrays.toString(notasAlunos2));

            int totalAlunos2 = 0;
            for (double notas2 : notasAlunos2) {
                totalAlunos2 += notas2;
            }
            double media2 =  totalAlunos2 / notasAlunos2.length;
            System.out.println("Média do aluno: " + media2);
        }
    }
