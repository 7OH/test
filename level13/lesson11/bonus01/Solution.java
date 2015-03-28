package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        FileInputStream inStream;
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String fileName = reader.readLine();

            inStream = new FileInputStream(fileName);//"d:\\13_04.txt"

            reader = new BufferedReader(new InputStreamReader(inStream));

            String line = reader.readLine();

            while (line != null)
            {
                int data = Integer.parseInt(line);
                list.add(data);
                line = reader.readLine();
            }

            for (int i = 0; i < list.size() - 1; i++)
            {
                int ind=i;
                for (int j = i+1; j < list.size(); j++)
                {
                    if (list.get(j)<list.get(ind))
                    {
                        ind = j;
                    }
                }
                if (ind!=i)
                {
                    int tmp = list.get(i);
                    list.set(i, list.get(ind));
                    list.set(ind, tmp);
                }
            }
        }
        catch (Exception e)
        {

        }


        for (Integer i: list)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
