package Module1.Desafios;

import java.util.Scanner;

public class DesafioConversão {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro salário:");
        String Salario1 = input.nextLine().replace(",", ".");

        System.out.print("Digite o segundo salário:");
        String Salario2 = input.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salário:");
        String Salario3 = input.nextLine().replace(",", ".");

        Double salario1 = Double.parseDouble(Salario1);
        Double salario2 = Double.parseDouble(Salario2);
        Double salario3 = Double.parseDouble(Salario3);
        Double media = salario1+salario2+salario3;

        System.out.print("A média dos salários é: " + media / 3);

        input.close();
    }
}
