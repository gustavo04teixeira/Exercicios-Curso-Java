package Module1;

public class OperadoresAtribuição {
    static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c =10;

        a += b;
        c -= a;
        b *= a;
        c /= b;

        b++;

        b %= 2;
        //se aparecer 0 é porquê é par e se aparecer 1 é porquê é impar

        System.out.println(b);
    }
}
