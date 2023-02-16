package dz_lection3;

import java.util.Arrays;

public class dz3_7 {
    public static void main(String[] args) {
        String[] mass = new String[]{"Светлана", "Валера", "Евгений", "Марк", "Богдан"};

        System.out.println("Первоначальный массив:");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

        System.out.println("\n \nОтсортированный массив:");
        Arrays.sort(mass);
        for (String i : mass) {
            System.out.print(i + " ");
        }
    }
}
