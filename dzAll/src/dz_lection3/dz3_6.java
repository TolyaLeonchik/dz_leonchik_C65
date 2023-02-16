package dz_lection3;

import java.util.Random;

public class dz3_6 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        int max = 100;

        System.out.println("Первоначальный массив:");

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, max);
            System.out.print(mass[i] + " ");
        }

        System.out.println("\n" + "Массив, у которого каждый элемент с нечётным индексом равен нулю:");

        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) mass[i] = 0;
            System.out.print(mass[i] + " ");
        }
    }
}
