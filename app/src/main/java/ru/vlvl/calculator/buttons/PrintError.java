package ru.vlvl.calculator.buttons;

import android.view.View;
import android.widget.TextView;

public class PrintError implements ButtonAction {

    @Override
    public void action(TextView textView, View view) {
        String text = (String) textView.getText();
        text = text.contains("=Ошибка") ? text : text + "=Ошибка";
        textView.setText(text);
    }

}
