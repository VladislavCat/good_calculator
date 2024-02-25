package ru.vlvl.calculator;


import ru.vlvl.calculator.calculation.LogicPriority;
import ru.vlvl.calculator.parenthesis.ParenthesisSolution;
import ru.vlvl.calculator.parenthesis.SolutionParenthesis;

public class CheckExpressionFinal {
    private String number = null;
    private final LogicPriority logicEquals = new LogicPriority();
    private final ValidateNumber validateNumber = new ValidateNumber(logicEquals);

    public double checkExpressionFinal(String textX) {
        SolutionParenthesis parenthesisSolution = new ParenthesisSolution();
        String text = textX;
        while (parenthesisSolution.isParent(text, "(")) {
            text = parenthesisSolution.parentCalc(text, "(");
        }
        for (int i = 0; i < text.length(); i++) {
            char viewSymbol = text.charAt(i);
            if (CheckElement.checkNumber(viewSymbol)) {
                number = number == null ? String.valueOf(viewSymbol) : number + viewSymbol;
            } else if (CheckElement.checkOperation(viewSymbol)) {
                if (i == 0 || CheckElement.checkOperation(text.charAt(i - 1))) {
                    number = number == null ? String.valueOf(viewSymbol) : number + viewSymbol;
                } else {
                    validateNumber.valNum(number, String.valueOf(viewSymbol));
                    number = null;
                }
            } else if (viewSymbol == 46) {
                number += viewSymbol;
            }
        }
        validateNumber.valNum(number);
        return logicEquals.checkPrior();
    }
}
