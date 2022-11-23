package it.develhope.datetime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.printf(today.getDayOfMonth() + "\s" );
        System.out.printf(today.getMonth() + "\s");
        int year = today.getYear();
        System.out.printf(year % 100 + "\s");
        System.out.printf(today.getHour() + "\s");
        System.out.printf(today.getMinute() + "\s" +"\n");
        ZonedDateTime todayISO = ZonedDateTime.now();
        System.out.println(todayISO.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}



