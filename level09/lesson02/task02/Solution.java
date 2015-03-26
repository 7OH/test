package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        return getParentMethodName();
    }

    public static String method2()
    {
        method3();
        return getParentMethodName();
    }

    public static String method3()
    {
        method4();
        return getParentMethodName();
    }

    public static String method4()
    {
        method5();
        return getParentMethodName();
    }

    public static String method5()
    {
        return getParentMethodName();
    }

    public static String getParentMethodName()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        //0 - getStackTrace
        //1 - getParentMethodName
        //2 - method name
        //3 - parent method name
        String res = stack[3].getMethodName();

        return res;
    }
}
