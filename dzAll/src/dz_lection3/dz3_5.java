package dz_lection3;

import java.util.Random;
import java.util.Scanner;

public class dz3_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 100;

        System.out.println("Введите число x:    5 < x <= 10");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 5 || x > 10) {
            System.out.println("Вы ввели неправильное число!");
        } else {
            int[] mass = new int[x];


            boolean result = false;
            int l = 0;
            int y = 0;
            int j = 0;
            System.out.print("Дан массив: {");

            for (int i = 0; i < x; i++) {
                mass[i] = random.nextInt(0, max);
                //mass[i] = sc.nextInt();
                if (i != x - 1) System.out.print(mass[i] + ", ");
                else System.out.println(mass[i] + "}");
            }

            for (int i = 0; i < x; i++) {
                j = x;
                if (mass[i] % 2 == 0) {
                    l++;
                    result = true;
                }
            }
            int[] resultMass = new int[l];

            if (result == false) {
                System.out.println("В вашем массиве нету четных чисел");
            } else {
                System.out.print("Получен массив: ");

                for (int i = 0; i < x; ) {
                    if (mass[i] % 2 == 0) {
                        resultMass[y] = mass[i];
                        i++;
                        y++;
                    } else i++;
                }
                for (int m = 0; m < l; m++) {
                    System.out.print(resultMass[m] + " ");
                }
            }
        }
    }
}
