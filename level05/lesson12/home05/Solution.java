package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        int Num;
        int Sum = 0;

        while (!sNum.equals("сумма"))
        {
            try
            {
                Num = Integer.parseInt(sNum);
            }
            catch (NumberFormatException e)
            {
                Num = 0;
            }

            Sum += Num;
            sNum = reader.readLine();
        }
        System.out.println(Sum);
    }
}
