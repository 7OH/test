package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Сын1", true, 18);
        Human child2 = new Human("Сын2", true, 16);
        Human child3 = new Human("Дочь1", false, 14);
        Human father = new Human("Отец", true, 34);
        Human mother = new Human("Мать", false, 32);
        Human grandFather1 = new Human("Дед1", true, 56);
        Human grandFather2 = new Human("Дед2", true, 55);
        Human grandMother1 = new Human("Баба1", false, 54);
        Human grandMother2 = new Human("Баба2", false, 53);

        father.addChild(child1);
        father.addChild(child2);
        father.addChild(child3);

        mother.addChild(child1);
        mother.addChild(child2);
        mother.addChild(child3);

        grandFather1.addChild(father);
        grandMother1.addChild(father);

        grandFather2.addChild(mother);
        grandMother2.addChild(mother);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        public String name;
        public Boolean sex;
        public Integer age;

        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, Boolean sex, Integer age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public void addChild(Human child)
        {
            children.add(child);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
