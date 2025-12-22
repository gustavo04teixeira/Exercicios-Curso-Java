package Module1;


public class String6 {
    static void main(String[] args) {

        String b = "olá, tudo bem x?";
        b= b.replace("x", "lindo");
        b= b.concat( " i love you");

        System.out.println(b);

        b= b.toUpperCase();
        System.out.println(b);

        var contar = b.length();
        System.out.println(contar);


    }
}
