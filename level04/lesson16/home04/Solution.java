package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.util.Scanner;

public class Solution
{
    public static int i = 3;

    public static void main(String[] args) throws Exception
    {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int y = scanner.nextInt();
//        int m = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        System.out.println("Меня зовут "+name);
//        System.out.println("Я родился "+d+"."+m+"."+y);

        int iRes = 1 / 4;
        double dRes = 1.0 / 4;

        System.out.println("iRes = " + iRes);
        System.out.println("dRes = " + dRes);

        System.out.println("class i = " + i);

        test();
    }

    public static void test()
    {
        for (int j = 0; j < 5; j++)
        {
            int i = j;
            System.out.println("for i = " + i);
        }
        System.out.println("test i = " + i);
    }
}
