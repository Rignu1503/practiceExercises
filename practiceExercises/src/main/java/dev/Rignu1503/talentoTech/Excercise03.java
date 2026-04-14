package dev.Rignu1503.talentoTech;

import java.util.Arrays;

public class Excercise03 {

    /**
     * 
     * Retorna los índices de los dos números que suman target
     * 
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }  
        }
        return new int[]{};
    }

}
