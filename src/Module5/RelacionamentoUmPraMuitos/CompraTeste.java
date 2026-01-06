package Module5.RelacionamentoUmPraMuitos;

import java.util.Arrays;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Rodrigo";
        c1.adicionarItem("bola", 10, 55.00);
        c1.itens.add(new Item("caneta", 7, 2.80));
        c1.itens.add(new Item("caderno", 18, 5.45));

        Compra c2 = new Compra();

        c2.cliente = "jose";
        c2.adicionarItem("celular", 10, 785.00);
        c2.itens.add(new Item("jogo", 3, 17.80));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

        System.out.println(c2.itens.size());
        System.out.println(c2.getValorTotal());

    }
}
