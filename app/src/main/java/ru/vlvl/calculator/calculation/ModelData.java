package ru.vlvl.calculator.calculation;

import java.util.ArrayList;
import java.util.List;

public class ModelData {
    private final List<Double> numbers = new ArrayList<>();
    private final List<String> operations = new ArrayList<>();

    public int sizeOperation() {
        return operations.size();
    }

    public void addNum(double d) {
        numbers.add(d);
    }

    public void addOperation(String c) {
        operations.add(c);
    }

    public void updateNum(double d, int index) {
        numbers.set(index, d);
    }

    public void  deleteOperation(int index) {
        operations.remove(index);
    }

    public void deleteNum(int index) {
        numbers.remove(index);
    }

    public int indexOfOperand(String c) {
        return operations.indexOf(c);
    }

    public boolean containsOperation(String c) {
        return indexOfOperand(c) != -1;
    }

    public double getNum(int i) {
        return numbers.get(i);
    }

    public String getOperation(int i) {
        return operations.get(i);
    }
}
