package Module1;

public class OperadoresRelacionais14 {
    static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println( 2 > 6);
        System.out.println( 3 < 5);
        System.out.println( 8 <= 6);
        System.out.println( 8 >= 6);
        System.out.println( 8 != 6);

        Double nota = 7.6;
        boolean BomComportamento = true;
        boolean Desconto = BomComportamento && nota >=7.5;
        System.out.println("Tem desconto? " + Desconto);
    }
}
