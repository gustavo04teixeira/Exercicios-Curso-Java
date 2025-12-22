package Module1.Desafios;

public class DesafioOperadoresLogicos {
    static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        var tv50 = trabalho1 && trabalho2;
        var tv32 = trabalho1 ^ trabalho2;
        var icecream = trabalho1 || trabalho2;
        var anything = !trabalho1 && !trabalho2;

        System.out.println("Comprou uma TV de 50 polegadas?" + tv50);
        System.out.println("Comprou uma TV de 32 polegadas?" + tv32);
        System.out.println("Vamos tomar sorvete?" + icecream);
        System.out.println("vamos ficar mais saudáveis?" + anything);


    }
}
