package Module4.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {
    static void main(String[] args) {

       // Set<String> lista = new HashSet(); //Não respeita inserção
        Set<String> lista = new LinkedHashSet<>(); //Respeita inserção

        lista.add("João");
        lista.add("Carlos");
        lista.add("Gustavo");

        for( String candidato : lista ) {
            System.out.println(candidato);
        }


    }
}
