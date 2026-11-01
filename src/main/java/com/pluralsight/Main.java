package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);

        System.out.println(" ");

        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneId.of("GMT"));

        DateTimeFormatter option1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter option2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter option3 = DateTimeFormatter.ofPattern("EEEE,MMMM d, yyyy");
        DateTimeFormatter option4 = DateTimeFormatter.ofPattern("EEEE,MMM d , HH:mm");


        System.out.println(gmtDateTime.format(option1));
        System.out.println(gmtDateTime.format(option2));
        System.out.println(gmtDateTime.format(option3));
        System.out.println(gmtDateTime.format(option4));



    }
}