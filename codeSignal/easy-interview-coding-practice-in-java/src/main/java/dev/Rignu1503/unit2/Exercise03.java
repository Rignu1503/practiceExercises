package dev.Rignu1503.unit2;

public class Exercise03 {

    public static void main(String[] args) {

        /**
         *Se le da una matriz de números enteros. Su tarea consiste en escribir
         *  una función en Java que devuelva el número de veces que aparece el
         *  elemento más pequeño en la matriz.
         *
         * Tenga en cuenta que en esta tarea no se deben utilizar métodos integrados
         * como Collections.min() o Collections.frequency(). El objetivo es realizar esta
         * tarea iterando manualmente sobre los elementos del array. Intente resolver
         * la tarea realizando un único recorrido por el array.
         */

        System.out.println(countMin(new int[]{1, 2, 3, 4, 5, 1, 7, 8, 9, 10}));
    }

    public static int countMin(int[] numbers) {

        if (numbers.length == 0) return 0;

        int small = numbers[0];
        int repeated = 0;

        for(int i: numbers){
            if (i < small) {
                small = i;
                repeated = 0;

            }if (small == i) {
                repeated++;
            }
        }
        return repeated;
    }

}
