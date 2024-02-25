package ru.vlvl.calculator.calculation;

public class Calculation {

    public static double calculation(Double x, Double y, String string) {
        double result = 0.0;
        switch (string) {
            case ("*"): {
                result = x * y;
                return result;
            }
            case ("+"): {
                result = x + y;
                return result;
            }
            case ("-"): {
                result = x - y;
                return result;
            }
            case ("/"): {
                result = x / y;
                return result;
            }
            case ("^"): {
                return Math.pow(x, y);
            }
            case ("√"): {
                return Math.sqrt(x);
            }
        }return result;
    }
}
