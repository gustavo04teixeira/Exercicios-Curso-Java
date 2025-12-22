package Module1;

public class ConveterTiposPrimitivos10 {
    public static void main(String[] args) {
        int i = 1765176;

        byte b = (byte) i;

        System.out.println(b);
        // o java não olha para o dado e sim para o tipo
        //então por isso ele não colcoa o mesmo número,
        //pois o primeiro numero é do tipo int, ele faz um conta estanha para trocxar.

        double a= 23.9;
        System.out.println(a);

        float f = 2211.9F;
        System.out.println(f);
    }
}
