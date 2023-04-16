package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        // type code to get current date

        Date currentDay = new Date();  // Date classtan  curretnDay isimli object olusturdum
        System.out.println(currentDay);//==> Fri Jan 27 21:55:12 CET 2023
                                       // Date classtan gunun tarihini ve zamanini aldim

        System.out.println(currentDay.getTime());

        // type coden to get current time in your local area
        LocalTime myTime= LocalTime.now();
        System.out.println(myTime); //22:55:01.387184

        // type coden to get current date in your local area
        LocalDate nmyDAte= LocalDate.now();
        System.out.println(nmyDAte);//2023-01-27

        // type coden to get current time and date in your local area

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);//2023-01-27T22:58:44.809424

        // how to get a specific component from date and time
        System.out.println(nmyDAte.getMonthValue());//1
        System.out.println(nmyDAte.getMonth());// January

        System.out.println(myDateTime.getDayOfWeek());// FRIDAY
        System.out.println(myDateTime.getDayOfMonth());//27

        // how to get time in another time zone
        LocalDateTime a = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));//2023-01-28T07:10:07.716576
        System.out.println(a);
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));//2023-01-28T01:12:56.523128

        // How to go future or past in date and time
        System.out.println( nmyDAte.plusYears(3).plusMonths(4).plusDays(12));//2026-06-08

        System.out.println(myTime.minusHours(3).minusMinutes(20));

        // How to compare two dates (LOcal date clastan of method kullandim)
        LocalDate firsKidsDob=LocalDate.of(2005,8,23);
        LocalDate secondKidsDob=LocalDate.of(2011,3,11);

        boolean isFirstKidAfter= firsKidsDob.isAfter(secondKidsDob);
        System.out.println(isFirstKidAfter);//false

        boolean isFirstKidBefore= firsKidsDob.isBefore(secondKidsDob);
        System.out.println(isFirstKidBefore);//true

        boolean isFirstKidEquals= firsKidsDob.isEqual(secondKidsDob);
        System.out.println(isFirstKidEquals);//false

        //How to format Date Time(DateTimeFormatter classtan ofPattern methodu kullandim)
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String formattedMyDate= dtf.format(nmyDAte);
        System.out.println(formattedMyDate);//27:01:2023

      DateTimeFormatter sa= DateTimeFormatter.ofPattern("dd:MMM:yy");
      String formedcurcentDay = sa.format(nmyDAte);
        System.out.println(formedcurcentDay);//27:Jan:23

        // M==>1,2,3...12
        // MM==>01,02.......12
        // MMM==>Jan,Feb,.....Dec
        // MMMM==>January, February.......December
        // yy==>23
        // yy==>2023          pattern:model sekil
        // d==>1,2,3.....31
        // dd==>01,02........31

        //how to format time
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime= dtf3.format(myTime);
        System.out.println(formattedTime);//23:48

        DateTimeFormatter ne= DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime2= ne.format(myTime);
        System.out.println(formattedTime2);//11:50 PM

        //Note:HH--> 24 hour system
        //HH--> 12 hour system
        // after time pattern leave a space put "a" it puts AM or PM nest to the time

    }


}
