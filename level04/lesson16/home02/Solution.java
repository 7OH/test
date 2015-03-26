package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int i1= scanner.nextInt();
        int i2= scanner.nextInt();
        int i3= scanner.nextInt();

        if (i1 < i2 && i1<i3)
        {
            if (i2<i3)
                System.out.println(i2);
            else
                System.out.println(i3);
        }
        else
        {
            if (i2<i1 && i2<i3)
            {
                if (i1<i3)
                    System.out.println(i1);
                else
                    System.out.println(i3);
            }
            else
            {
                if (i1<i2)
                    System.out.println(i1);
                else
                    System.out.println(i2);
            }
        }


    }
}
