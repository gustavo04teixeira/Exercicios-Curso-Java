package Module1;

public class OperadoresLogicos13 {
    static void main(String[] args) {

        // vou criar aqui os operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;

        //Operador lógico &&
        System.out.println("Operador lógico &&\n");
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro && verdadeiro);
        System.out.println(falso && falso);
        System.out.println(falso && verdadeiro);

        //Operador lógico ||
        System.out.println("\nOperador lógico ||\n");
        System.out.println(falso || verdadeiro);
        System.out.println(falso || falso);
        System.out.println(verdadeiro || verdadeiro);
        System.out.println(verdadeiro || falso);

        //Operador lógico ^
        System.out.println("\nOperador lógico ^\n");
        System.out.println(verdadeiro ^ falso);
        System.out.println(verdadeiro ^ verdadeiro);
        System.out.println(falso ^ falso);
        System.out.println(falso ^ verdadeiro);

        //Operador lógico !
        System.out.println("\nOperador lógico &&");
        System.out.println(!falso && !falso);
        System.out.println(!falso && falso);
        System.out.println(!falso || !falso);
        System.out.println(!verdadeiro || !falso);
        System.out.println(!verdadeiro ^ !falso);
        System.out.println(verdadeiro ^ !falso);
    }
}
