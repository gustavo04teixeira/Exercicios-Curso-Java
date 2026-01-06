package Module4.Collections;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1,"Maria");
        usuarios.put(2,"João");
        usuarios.put(27,"Gustavo");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(27));
        System.out.println(usuarios.containsValue(27));

        System.out.println(usuarios.get(1));

        for(int chave : usuarios.keySet()){
            System.out.println("Aqui são as chaves: " + chave);
        }

        for (String valor : usuarios.values()){
            System.out.println("Aqui são os valores: " + valor);
        }

        for (Map.Entry<Integer,String> usuario : usuarios.entrySet()){
            System.out.println(usuario.getKey() + " - " + usuario.getValue());
        }
    }
}
