package Module4.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue <String> fila = new LinkedList<>();

        //O comportamento muda quando a fila está cheia
        fila.add("Lara"); //lança uma exceção
        fila.offer("Ana"); //retorna falso
        fila.add("Gustavo");
        fila.offer("João");

        //O comportamento muda quando a fila está vazia
        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.element()); //lança uma exceção

        System.out.println(fila.poll()); // Ele retorna o primeiro elemento da fila e ja remove ele

        System.out.println(fila.peek());

        /*
        * Outros metodos utilizados
        *
        * fila.clear()
        * fila.size()
        * fila.isEmpty()
        * */

    }
}
