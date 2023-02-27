package lection6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat_les6 member = new Cat_les6();
        System.out.println("Your pets name:");
        member.name = sc.nextLine();
        System.out.println("His/her age:");
        member.age = sc.nextInt();
        System.out.println("The number of grams of food you give your cat:");
        member.amountFood = sc.nextInt();
        if (member.feeding(member.amountFood)) {          //метод по заданию
            System.out.printf("Your pet %s is happy!", member.name);
        }   else {
            System.out.printf("Your pet %s is hungry(", member.name);
        }
        //member.feeding(member.amountFood);                //второй способ, если через метод класса
    }
}
