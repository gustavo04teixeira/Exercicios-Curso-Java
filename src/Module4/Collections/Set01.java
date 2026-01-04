package Module4.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        //Uma collection não aceita tipo primitivo, mas aqui ela converte automaticamente para Wrapper
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add('1');

        System.out.println("O tamanho é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto.contains('1'));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); //Junção dos conjutos
        System.out.println("Agora o conjunto foi mergiado ao outro");

        System.out.println(conjunto);
        System.out.println(nums);

        conjunto.retainAll(nums);//permanece somente os valores do nums
        System.out.println(conjunto);
    }
}
