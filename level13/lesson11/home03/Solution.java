package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream;

        try
        {
            String fileName = reader.readLine();

            inStream = new FileInputStream(fileName);//"d:\\13_04.txt";

            reader = new BufferedReader(new InputStreamReader(inStream));

            String line = reader.readLine();

            while (line != null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e)
        {

        }
    }
}
