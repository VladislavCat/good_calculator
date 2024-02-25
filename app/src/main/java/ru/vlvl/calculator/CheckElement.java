package ru.vlvl.calculator;

public class CheckElement {

    public static boolean checkNumber(char el) {
            return (el > 47 && el < 58) || el == '√';
        }
        public static boolean checkOperation(char el) {
            return el == '+' || el == '-'
                    || el == '*' || el == '/' || el == '^';
        }
}
