package Module1.Desafios;

import javax.swing.*;

public class DesafioCalculadora {
    static void main(String[] args) {
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));

        String op = JOptionPane.showInputDialog("Digite a operação que você deseja");

        double resultado = "+".equals(op)? num1+num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        JOptionPane.showMessageDialog(null, "O resultado é " + resultado);



    }
}
