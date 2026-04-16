package dev.Rignu1503.unit1;

public class Exercise04 {

    public static void main(String[] args) {
        System.out.printf(replaceCharacter("Hello World!", 'l', 'L'));
    }

    public static String replaceCharacter(String inputString, char c1, char c2) {

        String output = "";
        boolean pass = true;

        for(int i = 0; inputString.length() > i; i++){
            pass = true;

            if (inputString.charAt(i) == c1) {
                output += c2;
                pass = false;
            }
            if (pass) {
                output += inputString.charAt(i);
            }
        }

        return output;
    }
}
