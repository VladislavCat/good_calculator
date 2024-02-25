package ru.vlvl.calculator.calculation;

import static ru.vlvl.calculator.calculation.Calculation.calculation;

public class LogicPriority {
    private final ModelData data = new ModelData();

    public void addNumber(double d) {
        data.addNum(d);
    }

    public void addOperation(String c) {
        data.addOperation(c);
    }

    private void popElem(int x, Double result){
        data.updateNum(result, x);
        data.deleteNum(x + 1);
        data.deleteOperation(x);
    }

    private double checkExpression(String[] string) {
        int xA = data.indexOfOperand(string[0]);
        int xB = data.indexOfOperand(string[1]);
        int xC = data.indexOfOperand(string[2]);
        int x = MaxMinIndex.MinIndexThree(xA, xB, xC);
        double result;
        String operation = data.getOperation(x);
        result = calculation(data.getNum(x), data.getNum(x + 1), operation);
        popElem(x, result);
        return result;
    }

    public double checkPrior() {
        double result = data.getNum(0);
        while (data.sizeOperation() != 0) {
            if (data.containsOperation("*") || data.containsOperation("/") || data.containsOperation("^")) {
                String[] array = new String[]{"*", "/", "^"};
                result = checkExpression(array);
                continue;
            }
            if (data.containsOperation("+") || data.containsOperation("-")) {
                String[] array = new String[]{"+", "-", ""};
                result = checkExpression(array);
            }
        }
        return result;
    }
}
