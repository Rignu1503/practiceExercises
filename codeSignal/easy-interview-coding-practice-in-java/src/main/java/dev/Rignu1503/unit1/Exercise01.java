package dev.Rignu1503.unit1;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {

    /**
     *
     * Write a function that takes a string s, iterates through it, and collects all 0-based
     * positions of vowels in it to a list.
     * <p>
     * Note that you should not use any Java built-in string methods to solve this task.
     * <p>
     * For example, System.out.println(new Solution().solution("Hello WORLD")); should output
     * [1, 4, 7]. Here, 'e' is a vowel, and its position in the string "Hello" is 1. 'o' is also
     * a vowel, and its position is 4. The last vowel is O at position 7.
     */


    public static void main(String[] args) {
        String originalString = "HEllo World";

        List<Integer> result = Solution(originalString);
        System.out.println(result);

    }


    public static List<Integer> Solution(String s) {

        List<Integer> number = new ArrayList<>();
        String vocalists = "AaEeIiOoUu";

        //Ciclo para recorrer cada uno de los caracteres
        for (int i = 0; s.length() > i; i++) {
            //Ciclo de las vocales
            for (int j = 0; vocalists.length() > j; j++) {

                if (s.charAt(i) == vocalists.charAt(j)) {
                    number.add(i);
                }
            }
        }
        return number;
    }


}