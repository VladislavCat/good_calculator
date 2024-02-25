package ru.vlvl.calculator.buttons;

import android.view.View;
import android.widget.TextView;

import ru.vlvl.calculator.CheckElement;
import ru.vlvl.calculator.buttons.ButtonAction;

public class BackspaceButtonAction implements ButtonAction {
    @Override
    public void action(TextView textView, View view) {
        String text = (String) textView.getText();
        if (text.length() != 0) {
            text = text.substring(0, text.length() - 1);
            textView.setText(text);
        }
    }

    public static boolean getFlags(TextView textView) {
        String text = (String) textView.getText();
            return !(CheckElement.checkOperation(
                    text.charAt(textView.length() - 1))) && !(text.contains("="));
    }
}
