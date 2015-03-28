package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        FileOutputStream outStream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer;

        try
        {
            String fileName = reader.readLine();

            outStream = new FileOutputStream(fileName);//"d:\\13_04.txt"

            writer = new BufferedWriter(new OutputStreamWriter(outStream));

            while (true)
            {
                String line = reader.readLine();

                writer.write(line);

                if (line.equals("exit"))
                    break;

                writer.newLine();
            }
            reader.close();
            writer.close();
        }
        catch (Exception e)
        {

        }
    }
}
