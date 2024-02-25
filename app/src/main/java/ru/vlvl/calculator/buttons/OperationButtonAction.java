package ru.vlvl.calculator.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class OperationButtonAction implements ButtonAction {

    @Override
    public void action(TextView textView, View view) {
        Button butt = (Button) view;
        String text = (String) textView.getText() + butt.getText();
        textView.setText(text);
    }
}
