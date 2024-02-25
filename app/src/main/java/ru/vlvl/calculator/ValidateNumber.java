package ru.vlvl.calculator;

import ru.vlvl.calculator.calculation.LogicPriority;

public class ValidateNumber {
    private final LogicPriority logicPriority;

    public ValidateNumber(LogicPriority logicPriority) {
        this.logicPriority = logicPriority;
    }


    public void valNum(String num, String operation) {
        logicPriority.addNumber(Double.parseDouble(num));
        logicPriority.addOperation(operation);
    }

    public void valNum(String num){
        logicPriority.addNumber(Double.parseDouble(num));
    }

}
