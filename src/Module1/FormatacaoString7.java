package Module1;

public class FormatacaoString7 {
    static void main(String[] args) {
        var nome = "gustavo";
        var sobrenome = "silva";
        var idade = "23";
        var salario= "1232";

        System.out.printf("O %s %s de %s anos já ganha %s de salário por mês.", nome,
                sobrenome, idade, salario);

        String frase = String.format("\nO %s %s,\nde %s anos \nganha %s por mês!", nome,
                sobrenome, idade, salario);
        System.out.println(frase);
        System.out.println(frase.contains("gustavo"));
    }
}
