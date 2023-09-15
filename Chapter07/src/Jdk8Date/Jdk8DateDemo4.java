package Jdk8Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Jdk8DateDemo4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 12, 8, 10, 12);
        //public LocalDate toLocalDate ()    ת����Ϊһ��LocalDate����
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate); //2020-12-12

        //public LocalTime toLocalTime ()    ת����Ϊһ��LocalTime����
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime); //08:10:12
    }
}
