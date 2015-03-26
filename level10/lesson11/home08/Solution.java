package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] res = new ArrayList[3];

        res[0] = new ArrayList<String>();
        res[0].add("str11");
        res[0].add("str12");

        res[1] = new ArrayList<String>();
        res[1].add("str21");
        res[1].add("str22");
        res[1].add("str23");

        res[2] = new ArrayList<String>();
        res[2].add("str31");
        res[2].add("str32");
        res[2].add("str33");
        res[2].add("str34");

        return res;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}