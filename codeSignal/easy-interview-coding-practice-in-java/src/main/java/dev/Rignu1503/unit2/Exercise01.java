package dev.Rignu1503.unit2;

public class Exercise01 {

    public static void main(String[] args) {

        /**
         * Se te asigna un array de enteros. Tu tarea es escribir una función , que devuelva
         * el número mínimo del array sin usar los métodos integrados de Java como .findMinElementArrays.stream().min()
         *
         * Si el array está vacío, tu función debería devolver .null
         */
        System.out.println(findMinElement(new int[]{1, 2, 3, 4, 5}));
    }

    public static Integer findMinElement(int[] array) {
        if (array.length == 0) return null;
        Integer min = array[0];

        for (int i: array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
