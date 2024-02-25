package ru.vlvl.calculator.buttons;

import android.view.View;
import android.widget.TextView;

import ru.vlvl.calculator.CheckExpressionFinal;
import ru.vlvl.calculator.parenthesis.CheckCorrectParenthesis;

import java.text.DecimalFormat;

public class EqualsButtonAction implements ButtonAction {
    @Override
    public void action(TextView textView, View view) {
        String text;
        String textResult;
        CheckExpressionFinal check = new CheckExpressionFinal();
        PrintError error = new PrintError();
        text = CheckCorrectParenthesis.resultChecker((String) textView.getText());
        try {
            double a = check.checkExpressionFinal(text);
            if (a % 1 == 0) {
                textResult = Double.toString(a).replace(".0", "");
            } else {
                textResult = new DecimalFormat("#0.0000").format(a);
            }
            text = text + "=" + textResult;
            textView.setText(text);
        } catch (NumberFormatException | ArithmeticException e) {
            error.action(textView, view);
        }
    }
}
