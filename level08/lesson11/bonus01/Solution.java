package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String[] engList = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String[] rusList = {"ЯНВАРЬ","ФЕВРАЛЬ","МАРТ","АПРЕЛЬ","МАЙ","ИЮНЬ","ИЮЛЬ","АВГУСТ","СЕНТЯБРЬ","ОКТЯБРЬ","НОЯБРЬ","ДЕКАБРЬ"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myMonth = reader.readLine();

        int pos = 0;

        for (int i = 0; i < engList.length; i++)
        {
            if (engList[i].equals(myMonth.toUpperCase()))
            {
                pos = i + 1;
                break;
            }
        }

        if (pos==0)
        {
            for (int i = 0; i < rusList.length; i++)
            {
                if (rusList[i].equals(myMonth.toUpperCase()))
                {
                    pos = i + 1;
                    break;
                }
            }
        }

        if (pos>0)
            System.out.println(myMonth+" is "+pos+" month");
    }

}
