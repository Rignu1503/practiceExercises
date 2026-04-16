package dev.Rignu1503.unit2;

public class Exercise04 {

    public static void main(String[] args) {

        /**
         * Se le da una matriz de números enteros. Su tarea es escribir una función
         * Java para encontrar el segundo mayor número entre estos enteros. Si la
         * matriz tiene menos de dos números únicos, devuelve null.
         *
         * No puede utilizar ningún método Java incorporado para ordenar
         * o encontrar máximos (por ejemplo, Arrays.sort, Collections.max).
         * En su lugar, debe implementar la tarea utilizando operaciones
         * básicas con matrices.
         */

        System.out.println(secondMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public static Integer secondMax(int[] nums) {

        if (nums == null || nums.length < 2) {
            return null;
        }

        Integer max = null;
        Integer secondMax = null;

        for (int num : nums) {
            if (max == null || num > max) {
                // El segundo mayor se convierte en el antiguo mayor
                secondMax = max;
                max = num;
            } else if (num != max && (secondMax == null || num > secondMax)) {
                // Actualiza solo si es distinto del mayor y mayor que el segundo
                secondMax = num;
            }
        }

        return secondMax;
    }
}
