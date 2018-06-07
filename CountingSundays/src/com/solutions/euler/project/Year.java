package com.solutions.euler.project;

public class Year {
    private int yearNo;
    private Day firstDay;
    private Month[] months;
    private boolean leapYear;

    public Year(int yearNo, Day firstDay) {
        this.yearNo = yearNo;
        this.firstDay = firstDay;
        months = new Month[12];
        Day day = firstDay;

        if (yearNo%4 == 0) {
            leapYear = true;
        }
        if (yearNo%100 == 0) {
            if (yearNo%400 != 0) {
                leapYear = false;
            }
        }

        int dayOffset, dayVal;
        for (MonthName m:MonthName.values()) {
            months[m.toInt() - 1] = new Month(m, day, leapYear);
            dayOffset = months[m.toInt() - 1].getNumberOfDays() % 7;
            dayVal = day.toInt()+dayOffset;
            if (dayVal > 7) {
                dayVal = dayVal - 7;
            }
            day = Day.fromInt(dayVal);
        }
    }

    public int getYearNo() {
        return yearNo;
    }

    public Month getMonth(MonthName monthName) {
        return months[monthName.toInt()-1];
    }

    public Year getNextYear() {
        int dayOffset, dayVal;

        dayOffset = 1;
        if (leapYear)
            dayOffset++;
        dayVal = firstDay.toInt()+dayOffset;
        if (dayVal > 7)
            dayVal = dayVal - 7;

        return new Year(yearNo+1, Day.fromInt(dayVal));
    }
}