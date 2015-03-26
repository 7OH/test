package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        Date mydate = new Date(date);
        Date begYear = new Date(date);
        Boolean res=false;

        begYear.setMonth(0);
        begYear.setDate(1);

        int diff = (int) ((mydate.getTime()-begYear.getTime())/1000/86400)+1;

        return (diff % 2 == 0)?false:true;
    }
}
