package ru.vlvl.calculator.calculation;

public class MaxMinIndex {
    public static int MinIndexThree(int fist, int second, int third) {
        return MinIndexTwo(MinIndexTwo(fist, second), MinIndexTwo(second, third));
    }

    public static int MinIndexTwo(int first, int second) {
        if ((first < second && first != -1) || second == -1) {
            return first;
        }
        return second;
    }
}
