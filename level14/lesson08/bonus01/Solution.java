package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        exceptions.add(new Exception("Ex2"));
        exceptions.add(new Exception("Ex3"));
        exceptions.add(new Exception("Ex4"));
        exceptions.add(new Exception("Ex5"));
        exceptions.add(new Exception("Ex6"));
        exceptions.add(new Exception("Ex7"));
        exceptions.add(new Exception("Ex8"));
        exceptions.add(new Exception("Ex9"));
        exceptions.add(new Exception("Ex10"));

    }
}
