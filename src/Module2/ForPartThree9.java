package Module2;

public class ForPartThree9 {
    static void main(String[] args) {

        //eu só consigo chamar uma variavel do for, dentro laço do For, se eu quiser usar a variavel, preciso declarar ela fora do for
        for( int i = 0; i < 10; i++){
            for(int contador = 0; contador < 10; contador++){
                System.out.printf("Contador: [%d %d]", i, contador);
            }
        }
    }
}
