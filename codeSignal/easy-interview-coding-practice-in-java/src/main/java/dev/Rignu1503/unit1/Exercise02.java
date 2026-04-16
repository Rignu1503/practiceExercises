package dev.Rignu1503.unit1;

public class Exercise02 {

    public static void main(String[] args) {

        /**
         * Dado un string, necesitas devolver un nuevo string donde cada letra se desplace a la derecha por un
         * lugar en el orden alfabético. Las últimas letras z y Z deben ser reemplazadas por las primeras: a y A,
         * espectivamente. Si el carácter no es una letra, debe permanecer igual.
         *
         * Por ejemplo, dado el string "abc123XYz!", la función debería devolver "bcd123YZa!".
         *
         */

        System.out.println(new Exercise02().shiftByOneCharacter("abc123XYz!"));

    }

    public static String shiftByOneCharacter(String s) {

        String lowerCaseAlp = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseAlp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean pass;
        String shiftByOne = "";

        for(int i = 0; s.length() > i; i++){
            pass = false;

            for(int j = 0; lowerCaseAlp.length() > j; j++){

                if (s.charAt(i) == lowerCaseAlp.charAt(j)) {

                    if (s.charAt(i) == 'z'){
                        shiftByOne += lowerCaseAlp.charAt(0);
                        pass = true;
                        break;
                    }

                    shiftByOne += lowerCaseAlp.charAt(j + 1);
                    pass = true;
                    break;
                }
                if (s.charAt(i) == upperCaseAlp.charAt(j)) {

                    if (s.charAt(i) == 'Z'){
                        shiftByOne += upperCaseAlp.charAt(0);
                        pass = true;
                        break;
                    }

                    shiftByOne += upperCaseAlp.charAt(j + 1);
                    pass = true;
                    break;
                }
            }
            if( !pass ){
                shiftByOne += s.charAt(i);
            }
        }
        return shiftByOne;
    }
}

