package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();
        return  getLineNum();
    }

    public static int method2()
    {
        method3();
        return  getLineNum();
    }

    public static int method3()
    {
        method4();
        return  getLineNum();
    }

    public static int method4()
    {
        method5();
        return  getLineNum();
    }

    public static int method5()
    {
        return  getLineNum();
    }

    public static int getLineNum()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        //0 - getStackTrace
        //1 - getParentMethodName
        //2 - method name
        //3 - parent method name
        int res = stack[3].getLineNumber();

        return res;
    }
}
