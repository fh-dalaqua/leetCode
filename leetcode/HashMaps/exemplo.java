package leetcode.HashMaps;

import java.util.HashMap;

public class  exemplo{
    public static void main(String[] args) {
        // criando um objeto HashMap
            HashMap<Integer, Integer> map = new HashMap<>();

            // adicionando elementos
            map.put(5, 1);
            map.put(11, 2);
            map.put(22, 3);

            // removendo elementos
            map.remove(5);

            // acessar elementos
            map.get(11);

            // limpar todos os itens
            map.clear();

            // tamanho da map
            map.size();

            // loop em um HashMap, print keys
            for(int i: map.keySet()){
                System.out.println(i);
            }

            for(int i: map.values()){
                System.out.println(i);
            }
    }
}

