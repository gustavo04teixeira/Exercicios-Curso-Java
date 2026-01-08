package Module5.Desafio;

public class Sistema {

    static void main(String[] args) {

    Cliente c1 = new Cliente("Gustavo");

    Compra compra1 = new Compra();
    compra1.addItem("caneta", 54.4, 32);
    compra1.addItem("celular", 789.88, 2);
    compra1.addItem(new Produto("quadro", 45.89), 3);

    Compra compra2 = new Compra();
    compra2.addItem("carro", 5845.8, 4);
    compra2.addItem("bateria", 79.88, 2);
    compra2.addItem(new Produto("monitor", 489.76), 3);

    c1.compras.add(compra1);
    c1.compras.add(compra2);

    System.out.println(c1.obterValorTotal());
    }
}
