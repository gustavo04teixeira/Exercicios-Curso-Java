package Module2;

import javax.swing.*;

public class Switch10 {
    static void main(String[] args) {

        String faixa = JOptionPane.showInputDialog("Digite sua faixa: ");

        switch (faixa.toLowerCase()) {
            case "preta":
                JOptionPane.showMessageDialog(null, "Você sabe peek-a-boo");
            case "roxa":
                JOptionPane.showMessageDialog(null, "Você sabe gancho");
            case "verde":
                JOptionPane.showMessageDialog(null, "Você sabe cruzado");
            case "marrom":
                JOptionPane.showMessageDialog(null, "Você sabe direto");
            case "branca":
                JOptionPane.showMessageDialog(null, "Você sabe jab");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vai treinar vabagundo");
        }

    }
}
