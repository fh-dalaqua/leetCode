package leetcode.HashMaps;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        // HashMap criado
        HashMap<Character,Integer> map = new HashMap<>();

        // adicionando informações dentro do map
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int anterior = 0;

        // percorrendo o HashMap
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int atual = map.get(c);

            // verificação se é necessário subtrair
            if(atual >= anterior){
                total += atual;
            } else {
                total -= atual;
            }
            anterior = atual;
        }
        return total;
    }
}