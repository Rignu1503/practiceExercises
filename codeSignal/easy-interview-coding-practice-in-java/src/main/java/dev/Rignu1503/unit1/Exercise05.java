package dev.Rignu1503.unit1;

public class Exercise05 {

    public static void main(String[] args) {

        /**
         * Se te asigna una cadena . Tu tarea es escribir una función que
         * devuelva una cadena en la que se intercambia cada par de caracteres adyacentes
         * de la cadena original. Si la cadena tiene una longitud impar, deja el último carácter tal cual.s
         *
         * No está permitido usar funciones integradas en Java como o en esta tarea,
         * deberías implementar la solución sin usarlas.reverse()String.join()
         *
         * Por ejemplo, si se te da la cadena , tu función debería devolver .
         * Si la cadena es , tu función debería devolver ."abcdef""badcfe""hello""ehllo"
         */

        System.out.println(swapPairs("abcde"));
    }

    public static String swapPairs(String s) {

        String output = "";

        for(int i = 1; s.length() > i; i += 2){

            output += s.charAt(i);
            output += s.charAt(i - 1);

        }
        if (s.length() % 2 != 0 ) {
            output += s.charAt(s.length() -1);

        }

        return output;
    }
}
