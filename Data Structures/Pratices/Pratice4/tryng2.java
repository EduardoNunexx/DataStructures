package Pratices.Pratice4;

import java.util.ArrayList;

public class tryng2 {
    public static void main(String[] args) {
        String S = "asdf! 3ab qqqq adw3";
        String[] x = S.split(" ");
        ArrayList<String> validated = new ArrayList<>();
        for (String aux : x) {
            if (validate(aux) == 1) {
                validated.add(aux);
            }
        }
        int size = -1;
        for (String aux : validated) {
            if (aux.length() > size) {
                size = aux.length();
            }
        }
        System.out.println(size);
    }

    public static int validate(String s) {
        char[] letters = new char[s.length()];
        for (int aux = 0; aux < letters.length; aux++) {
            letters[aux] = s.charAt(aux);
        }
        int numbers = 0;
        int nLetters = 0;
        for (int aux = 0; aux < letters.length; aux++) {
            if (!(((int) letters[aux] > 47 && (int) letters[aux] < 58)
                    || ((int) letters[aux] > 64 && (int) letters[aux] < 91)
                    || ((int) letters[aux] > 96 && (int) letters[aux] < 123))) {
                return 0;
            } else if (((int) letters[aux] > 47 && (int) letters[aux] < 58)) {
                numbers++;
            } else if (((int) letters[aux] > 64 && (int) letters[aux] < 91)
                    || ((int) letters[aux] > 96 && (int) letters[aux] < 123)) {
                nLetters++;
            }
        }

        if (nLetters % 2 != 0||numbers % 2 == 0) {
            return 0;
        }
        return 1;
    }
}