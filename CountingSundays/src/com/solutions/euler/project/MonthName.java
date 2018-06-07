package com.solutions.euler.project;

public enum MonthName {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private int value;

    MonthName(int value) {
        this.value = value;
    }

    public int toInt()
    {
        return value;
    }
};