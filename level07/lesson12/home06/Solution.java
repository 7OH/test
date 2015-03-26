package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Дед1", true, 61, null, null);
        Human ded2 = new Human("Дед2", true, 60, null, null);
        Human bab1 = new Human("Баба1", false, 56, null, null);
        Human bab2 = new Human("Баба2", false, 55, null, null);

        Human father = new Human("Отец", true, 32, ded1, bab1);
        Human mother = new Human("Мать", false, 30, ded2, bab2);

        Human child1 = new Human("Сын1", true, 18, father, mother);
        Human child2 = new Human("Дочь1", false, 16, father, mother);
        Human child3 = new Human("Сын2", true, 14, father, mother);

        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(ded2);
        System.out.println(bab2);
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

        public Human father;
        public Human mother;

        public Human(String name, Boolean sex, Integer age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
