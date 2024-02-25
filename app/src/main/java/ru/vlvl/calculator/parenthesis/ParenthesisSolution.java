package ru.vlvl.calculator.parenthesis;

import androidx.annotation.NonNull;

import ru.vlvl.calculator.CheckExpressionFinal;

public class ParenthesisSolution implements SolutionParenthesis{

    @Override
    public String parentCalc(@NonNull String text, String charFind) {
        String textRsl = text;
        textRsl = textRsl.substring(textRsl.indexOf("(") + 1, textRsl.indexOf(")") + 1);
        return parentCalcNest(textRsl, text, charFind);
    }

    private String parentCalcNest(String textRsl, String text, String charFind) {
        CheckExpressionFinal cef = new CheckExpressionFinal();
        textRsl = textRsl.substring(textRsl.indexOf(charFind) + 1);
        if (textRsl.contains(charFind)){
            return parentCalcNest(textRsl, text, charFind);
        }
        double n = cef.checkExpressionFinal(textRsl);
        textRsl = text.replace(charFind + textRsl, String.valueOf(n));
        return textRsl;
    }
}
