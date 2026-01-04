package Module4.Collections;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Pedro"));

        Usuario u1 = new Usuario("gustavo");
        lista.add(u1);

        lista.add(new Usuario("João"));
        lista.add(new Usuario("Lara"));
        lista.add(new Usuario("Ana"));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
