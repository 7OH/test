package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int pos=2;
        String c1 = " ";
        String c2 = " ";
        s = "  "+s+"  ";
        while (pos<s.length())
        {
            c1 = s.substring(pos-1, pos);
            c2 = s.substring(pos, pos+1);
            if (c1.equals(" ") && !c2.equals(" "))
            {
                s = s.substring(0, pos) + c2.toUpperCase() + s.substring(pos+1);
            }
            pos++;
        }
        s = s.substring(2);
        s = s.substring(0, s.length()-2);

        System.out.println(s);
    }


}
