package Module1;

public class SecondClass {
    static void main(String[] args) {
        double pi = 3.14159;

        // Colocando "final" o valor dessa variavel nunca irá mudar.
        final double raio = 6.98;

        double resultado = pi * raio;
        System.out.println("o resultado é: " + resultado);
    }
}
