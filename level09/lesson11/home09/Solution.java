package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> res = new HashMap<String, Cat>();
        res.put("Name1", new Cat("Name1"));
        res.put("Name2", new Cat("Name2"));
        res.put("Name3", new Cat("Name3"));
        res.put("Name4", new Cat("Name4"));
        res.put("Name5", new Cat("Name5"));
        res.put("Name6", new Cat("Name6"));
        res.put("Name7", new Cat("Name7"));
        res.put("Name8", new Cat("Name8"));
        res.put("Name9", new Cat("Name9"));
        res.put("Name10", new Cat("Name10"));

        return res;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> res = new HashSet<Cat>();
        res.addAll(map.values());

        return res;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
