package Module1.Desafios;

public class DesafioExpressãoNumerica {
    static void main(String[] args) {
        int conta1 = (1-5) * (2-7);
        int div1 = conta1 / 2;
        int pow1 = (int) Math.pow(div1, 2);

        int conta2 =6 * (3 + 2);
        int pow2 = (int) Math.pow(conta2, 2);
        int div2 = pow2 / (3*2);

        int less1 = div2 - pow1;

        int pow3 = (int) Math.pow(less1, 3);

        int Denominator = (int) Math.pow(10, 3);

        int Resultado = pow3 / Denominator;

        System.out.print(Resultado);

    }
}
