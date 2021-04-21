package pl.edu.pja;

import java.text.DateFormatSymbols;

public class Mydate {
    private final int day;
    private final int month;
    private final int year;

    public Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //@Override
    //public String toString() {
    //    return "Mydate{" +
    //           "day=" + day +
    //            ", month=" + month +
    //           ", year=" + year +
    //            '}';
    //}


    //@Override
    //public String toString() {
    //   return String.format("%02d.%02d.%04d", day, month, year);
    //}

    @Override
    public String toString() {
        return "Mydate{" +
               "day=" + day +
                ", month=" + new DateFormatSymbols().getShortMonths()[this.month - 1] +
                ", year=" + year +
                '}';
    }
}
