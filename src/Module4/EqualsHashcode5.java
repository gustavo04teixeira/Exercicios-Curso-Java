package Module4;

public class EqualsHashcode5 {
    public static void main(String[] args) {
        Usuario5 teste1 = new Usuario5();

        teste1.nome = "Gustavo";
        teste1.email = "gustavo@teste.com";

        Usuario5 teste2 = new Usuario5();

        teste2.nome = "Gustavo";
        teste2.email = "gustavo@teste.com";

        System.out.println(teste1 == teste2);
        System.out.println(teste1.equals(teste2));
    }
}
