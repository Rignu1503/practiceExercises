package dev.Rignu1503.unit1;

public class Exercise03 {

    public static void main(String[] args) {

        /**
         *
         * Dada una cadena inputString, su tarea consiste en escribir un método que transforme todas
         * las letras minúsculas en mayúsculas y todas las letras mayúsculas en minúsculas. Si el
         * carácter no es una letra, no lo transforme.
         *
         * La transformación debe hacerse sin utilizar ningún método Java incorporado como
         * toLowerCase(), toUpperCase(), o similares en su código.
         *
         * Por ejemplo, para la cadena de entrada «HelLo WoRld 123», la salida debería ser «hELlO wOrLD 123».
         */

        System.out.println(new Exercise03().transformString("Hello World!"));
    }

    public String transformString(String inputString) {

        String lowerCaseAlp = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseAlp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean pass;
        String output = "";

        for(int i = 0; inputString.length() > i; i++){
            pass = true;
            for (int j = 0; j < lowerCaseAlp.length(); j++) {
                if (inputString.charAt(i) == lowerCaseAlp.charAt(j)) {

                    output += upperCaseAlp.charAt(j);
                    pass = false;
                    break;
                }
                if (inputString.charAt(i) == upperCaseAlp.charAt(j)) {

                    output += lowerCaseAlp.charAt(j);
                    pass = false;
                    break;
                }
            }
            if (pass) {
                output += inputString.charAt(i);
            }
        }
        return output;
    }
}
