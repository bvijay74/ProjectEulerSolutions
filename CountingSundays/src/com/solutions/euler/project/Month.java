package com.solutions.euler.project;

public class Month {
    private final MonthName monthName;
    private int numOfDays;
    private Day firstDayOfMonth;

    Month (MonthName monthName, Day firstDayOfMonth, boolean leapYear)
    {
        this.monthName = monthName;
        this.firstDayOfMonth = firstDayOfMonth;
        numOfDays = 0;
        switch (monthName)
        {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                numOfDays = 31;
                break;

            case FEBRUARY:
                if (!leapYear) numOfDays = 28;
                else numOfDays = 29;
                break;

            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                numOfDays = 30;
        }
    }

    public MonthName getMonthName()
    {
        return monthName;
    }

    public int getNumberOfDays() {
        return numOfDays;
    }

    public Day getFirstDayOfMonth() {
        return firstDayOfMonth;
    }
}
