package ru.vlvl.calculator.parenthesis;

public class CheckCorrectParenthesis {

    public static String resultChecker(String text) {
        int i = check(text);
        if (i <= 0) {
            return text;
        }
        for (int s = 0; s < i; s++) {
            text = text.concat(")");
        }
        return text;
    }

    public static int check(String text) {
        int rsl = 0;
        if (!text.contains("(")) {
            return rsl;
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                rsl++;
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ')') {
                rsl--;
            }
        }
        return rsl;
    }
}
