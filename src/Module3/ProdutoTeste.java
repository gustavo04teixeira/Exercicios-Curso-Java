package Module3;

import Module3.desafios.DesafioData;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "bola";
        p1.preco = 100.99;


        var p2 = new Produto();
        p2.nome = "celular";
        p2.preco = 1500.49;

        Produto p3 = p1;

        Produto.desconto = 0.50;

        System.out.printf("O %s está com o valor de %.2f", p1.nome, p1.PrecoComDesconto());
        System.out.printf("%nO %s está com o valor de %.2f", p2.nome, p2.PrecoComDesconto());
        System.out.printf("%nO %s está com o valor de %.2f", p3.nome, p3.PrecoComDesconto());
        System.out.printf("%nO %s está com o valor", p3.nome);

        p3.nome = "raquete";
        System.out.printf("%nO %s está com o valor", p1.nome);
    }
}
