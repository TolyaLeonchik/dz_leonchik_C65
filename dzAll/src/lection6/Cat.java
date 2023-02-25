package lection6;

public class Cat {
    String name;
    int age;
    int amountFood;
    boolean feeding(int amountFood) {             //метод по заданию
        if (amountFood > 100) {
            return true;
        } else {
            return false;
        }
    }
    /*void feeding (int amountFood) {                //второй способ, если через метод класса
        if (amountFood > 100) {
            System.out.printf("Your pet %s is happy!", name);
        } else {
            System.out.printf("Your pet %s is hungry(", name);
        }
    }*/
}

