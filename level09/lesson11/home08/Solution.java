package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> res = new ArrayList<int[]>(5);
        int[] m1 = {1,2,3,4,5};
        res.add(m1);
        int[] m2 = {1,2};
        res.add(m2);
        int[] m3 = {1,2,3,4};
        res.add(m3);
        int[] m4 = {1,2,3,4,5,6,7};
        res.add(m4);
        int[] m5 = {};
        res.add(m5);

        return res;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
