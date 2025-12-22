package Module2;

import javax.swing.*;

public class Else2 {
    static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número:");

        int valor = Integer.parseInt(numero);

        if(valor % 2 == 0){
            JOptionPane.showMessageDialog(null,"O número é par");
        } else{
            JOptionPane.showMessageDialog(null, "O número é impar");
        }
    }
}
