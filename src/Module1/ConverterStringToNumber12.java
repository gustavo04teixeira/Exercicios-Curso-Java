package Module1;

import javax.swing.*;

public class ConverterStringToNumber12 {
    static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro valor: ");

        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo valor: ");

        System.out.println(valor1 + valor2);
        //aqui ele não vai somar, pois está como uma string, no poximo vou fazer a conversão

        double number1 = Double.parseDouble(valor1);
        double number2 = Double.parseDouble(valor2);
        double media = number1 + number2;

        System.out.println(number1 + number2);
        System.out.println("A Média do aluno é:" + media / 2);

    }
}
