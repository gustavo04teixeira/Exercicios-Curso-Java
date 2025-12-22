package Module4;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        double [] notas = new double[5];

        notas[2] = 7.3;
        notas[1] = 1.3;
        notas[0] = 5.3;
        notas[3] = 2.4;
        notas[4] = 7.4;

        System.out.println(Arrays.toString(notas));

        int total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        double media =  total / 5;
        System.out.println("Média do aluno: " + media);
    }
}
