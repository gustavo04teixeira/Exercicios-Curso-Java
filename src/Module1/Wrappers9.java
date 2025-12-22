package Module1;

public class Wrappers9 {
    public static void main(String[] args) {

        Byte b = 100;
        Byte b2 = 100;
        Short s = 100;
        Integer i = 100000;
        Long l = 100000000L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        Float f = 162.90F;
        System.out.println(f);

        Double d = 1243243.90;
        System.out.println(d);

        System.out.println(Double.isFinite(d));
        System.out.println(b.equals(b2));

    }
}

