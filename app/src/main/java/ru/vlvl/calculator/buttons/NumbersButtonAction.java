package ru.vlvl.calculator.buttons;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class NumbersButtonAction implements ButtonAction {

    @Override
    public void action(TextView textView, View view) {
            Button butt = (Button) view;
            String text = (String) butt.getText();
            if (textView.getText() == null) {
                textView.setText(text);
            } else {
                String text2 = textView.getText() + text;
                textView.setText(text2);
        }
    }
}
