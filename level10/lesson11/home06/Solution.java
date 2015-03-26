package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public String name;
        public Integer age;
        public Boolean sex;
        public Integer height;
        public Integer quality;
        public String color;

        public Human(String name)
        {
            this.name = name;
            this.age = 1;
            this.sex = true;
            this.height = 1;
            this.quality = 50;
            this.color = "white";
        }

        public Human(Integer age)
        {
            this.name = "noname";
            this.age = age;
            this.sex = true;
            this.height = 1;
            this.quality = 50;
            this.color = "white";
        }

        public Human(Boolean sex)
        {
            this.name = "noname";
            this.age = 1;
            this.sex = sex;
            this.height = 1;
            this.quality = 50;
            this.color = "white";
        }

        public Human(String name, Integer age)
        {
            this.name = name;
            this.age = age;
            this.sex = true;
            this.height = 1;
            this.quality = 50;
            this.color = "white";
        }

        public Human(String name, Integer age, Boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = 1;
            this.quality = 50;
            this.color = "white";
        }

        public Human(String name, Integer age, Boolean sex, Integer height)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.quality = 50;
            this.color = "white";
        }

        public Human(String name, Integer age, Boolean sex, Integer height, Integer quality)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.quality = quality;
            this.color = "white";
        }

        public Human(String name, Integer age, Boolean sex, Integer height, Integer quality, String color)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.quality = quality;
            this.color = color;
        }

        public Human(String name, String color)
        {
            this.name = name;
            this.age = 1;
            this.sex = true;
            this.height = 1;
            this.quality = 50;
            this.color = color;
        }

        public Human(Integer age, Boolean sex, Integer height)
        {
            this.name = "noname";
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.quality = 50;
            this.color = "white";
        }
    }
}
