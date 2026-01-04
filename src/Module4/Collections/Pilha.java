package Module4.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("it a coisa");
        livros.push("Hobbit");
        livros.push("biblia");

        //Aqui como é uma pilha é utilizado LIFO
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); //retorna null
        System.out.println(livros.remove()); //retorna uma exceção
        System.out.println(livros.pop()); //retorna uma exceção

    }
}
