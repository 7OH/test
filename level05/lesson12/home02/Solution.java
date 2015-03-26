package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("name1", 15, "addr1");
        Man man2 = new Man(16);
        Woman woman1 = new Woman("wm1");
        Woman woman2 = new Woman(3, "addr2");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man
    {
        public String name;
        public int age;
        public String address;

        public Man(String newName, int newAge, String newAddress)
        {
            name = newName;
            age = newAge;
            address = newAddress;
        }

        public Man(String newName, String newAddress)
        {
            name = newName;
            age = 1;
            address = newAddress;
        }

        public Man(String newName, int newAge)
        {
            name = newName;
            age = newAge;
            address = "none";
        }

        public Man(int newAge, String newAddress)
        {
            name = "noname";
            age = newAge;
            address = newAddress;
        }

        public Man(String newName)
        {
            name = newName;
            age = 1;
            address = "none";
        }

        public Man(int newAge)
        {
            name = "noname";
            age = newAge;
            address = "none";
        }

        public String toString() {
            return name+" : "+age+" : "+address;
        }
    }

    public static class Woman
    {
        public String name;
        public int age;
        public String address;

        public Woman(String newName, int newAge, String newAddress)
        {
            name = newName;
            age = newAge;
            address = newAddress;
        }

        public Woman(String newName, String newAddress)
        {
            name = newName;
            age = 1;
            address = newAddress;
        }

        public Woman(String newName, int newAge)
        {
            name = newName;
            age = newAge;
            address = "none";
        }

        public Woman(int newAge, String newAddress)
        {
            name = "noname";
            age = newAge;
            address = newAddress;
        }

        public Woman(String newName)
        {
            name = newName;
            age = 1;
            address = "none";
        }

        public Woman(int newAge)
        {
            name = "noname";
            age = newAge;
            address = "none";
        }

        public String toString() {
            return name+" : "+age+" : "+address;
        }
    }

}
