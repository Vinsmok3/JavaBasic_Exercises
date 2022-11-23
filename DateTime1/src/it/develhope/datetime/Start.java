package it.develhope.datetime;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Start {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        long daysBetween = DAYS.between(today, endOfMonth);
        System.out.println(today);
        System.out.println(endOfMonth);
        System.out.println(daysBetween);
        System.out.println("----------------YEAR");
        LocalDate endOfYear = today.withDayOfYear(today.lengthOfYear());
        long daysLeftYear = DAYS.between(today,endOfYear);
        System.out.println(today);
        System.out.println(endOfYear);
        System.out.println(daysLeftYear);
    }

}


