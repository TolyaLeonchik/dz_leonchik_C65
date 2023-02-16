package dz_lection3;

import java.util.Random;
import java.util.Scanner;

public class dz3_3 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Выберите способ создания размера длины массива:" +
                "\n 1: Произвольное число (от 3 до 15) " +
                "\n 2: Введете размер массива самостоятельно");
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int minRange = 3;
        int minMas = -100000; // ограничил массив тк очень большие значения попадаются
        int maxRange = 15;
        int maxMas = 100000;

        int max;
        int min;
        double avg;

        if (l == 1) {
            int[] mas = new int[random.nextInt(minRange, maxRange)];
            max = mas[0];
            min = mas[0];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = random.nextInt(minMas, maxMas);
                System.out.print(mas[i] + " ");
                for (int k = 1; k < mas.length; k++) {
                    if (max < mas[k])
                        max = mas[k];
                    if (min > mas[k])
                        min = mas[k];
                }
            }
            avg = (double) (max + min) / 2;
            System.out.println("\n" + min + " " + max + " " + avg);
        } else if (l == 2) {
            System.out.println("Введете размер массива:");
            int r = sc.nextInt();
            int[] mas = new int[r];
            max = mas[0];
            min = mas[0];
            if (r > 2) {
                for (int i = 0; i < mas.length; i++) {
                    mas[i] = random.nextInt(minMas, maxMas);
                    System.out.print(mas[i] + " ");
                    for (int k = 1; k < mas.length; k++) {
                        if (max < mas[k])
                            max = mas[k];
                        if (min > mas[k])
                            min = mas[k];
                    }
                }
            } else if (r == 2) {
                for (int i = 0; i < mas.length; i++) {
                    mas[i] = random.nextInt(minMas, maxMas);
                    System.out.print(mas[i] + " ");

                    if (max < mas[1])
                        max = mas[1];
                    else
                        max = mas[0];
                    if (min > mas[1])
                        min = mas[1];
                    else
                        min = mas[0];
                }
            } else
                System.out.println("Ваш размер для массива слишком мал");
            avg = (double) (max + min) / 2;
            System.out.println("\n" + min + " " + max + " " + avg);
        } else
            System.out.println("Вы ввели неправильное число");
    }
}
