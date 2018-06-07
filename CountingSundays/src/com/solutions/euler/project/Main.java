package com.solutions.euler.project;

public class Main {

    public static void main(String[] args) {
        int yearNo = 1900;
        int sundayCount = 0;
        Year year = new Year(yearNo, Day.MONDAY);

        year = year.getNextYear();
        do {
            System.out.println(year.getYearNo());
            for (MonthName m: MonthName.values())
            {
                Month month = year.getMonth(m);
                if (month.getFirstDayOfMonth() == Day.SUNDAY)
                {
                    sundayCount++;
                    System.out.println(month.getMonthName().toString());
                }
            }
            year = year.getNextYear();
            yearNo = year.getYearNo();
        } while (yearNo<=2000);

        System.out.println("Month's first day Sundays from 1901 to 2000 " + sundayCount);
    }
}
