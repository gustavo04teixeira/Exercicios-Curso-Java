package Module3;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    double PrecoComDesconto(){
        return preco * (1- desconto);}

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    };

    public Produto(){

    };
}
