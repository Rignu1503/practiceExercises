package dev.Rignu1503.unit2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }

    public static int[] solution(int[] nums) {

        int even = 0;
        int odd = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                even += 1;
            }else{
                odd += 1;
            }
        }
        int[] number = {even, odd};

        return number;
    }
}
