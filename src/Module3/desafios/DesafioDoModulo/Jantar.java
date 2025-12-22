package Module3.desafios.DesafioDoModulo;

public class Jantar {
    static void main(String[] args) {

        Pessoa gustavo = new Pessoa("gustavo", 50);

        Comida Feijao = new Comida("Feijao", 1);

        System.out.printf("O nome da pessoa é %s e o peso é %s", gustavo.nomePessoa , gustavo.comer(Feijao));
    }
}
