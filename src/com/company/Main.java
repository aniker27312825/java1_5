package com.company;

public class Main {

    public static void main(String[] args) {

        Boss takebai = new Boss();
        takebai.setHealth(700);
        takebai.setDamage(50);
        takebai.setTypeOfDefence("Power");

        System.out.println("Boss health = " + takebai.getHealth() + ", damage = " + takebai.getDamage()
                + ", Type of defence = " + takebai.getTypeOfDefence());

        int count = 0;
        for (Hero hero : createHeroes()){
            count++;
            System.out.println("Hero "+count + " "+ hero);

        }

        //● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
        // Затем распечатать всю информацию о боссе.
        //ДЗ на сообразительность:
        //● Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев
        // с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй).
        // Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый
        // результат метода createHeroes.
        //● Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
    }
    public  static Hero[] createHeroes(){
        Hero archer = new Hero(200,60,"Arbalet");
        Hero strongMan = new Hero (500, 40);
        Hero magician = new Hero (600, 70, "magic");

        return new Hero[]{archer,strongMan,magician};
    }
}
