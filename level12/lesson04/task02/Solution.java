package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(2);
        print((Integer)33);
    }

    public static void print(int toPrint)
    {
        System.out.println(toPrint);
    }

    public static void print(Integer toPrint)
    {
        System.out.println(toPrint);
    }
}
