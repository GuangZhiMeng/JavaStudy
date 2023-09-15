package Jdk8Date;

import java.time.LocalDate;
import java.time.Period;

/**
 *  计算两个时间的间隔
 */

public class Jdk8DateDemo9 {
    public static void main(String[] args) {
        //public static Period between(开始时间,结束时间)  计算两个"时间"的间隔

        LocalDate localDate1 = LocalDate.of(2020, 1, 1);
        LocalDate localDate2 = LocalDate.of(2048, 12, 12);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);//P28Y11M11D
        // P表示它是Period一个时间间隔对象，28Y：28年，11M：11月，11D：11天

        //public int getYears()         获得这段时间的年数
        System.out.println(period.getYears());//28
        //public int getMonths()        获得此期间的月数
        System.out.println(period.getMonths());//11
        //public int getDays()          获得此期间的天数
        System.out.println(period.getDays());//11

        //public long toTotalMonths()   获取此期间的总月数
        //toTotalMonths()计算从设置的开始时间到结束时间，中间一共过去了多少月
        System.out.println(period.toTotalMonths());//347
    }
}

