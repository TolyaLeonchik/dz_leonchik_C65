package dz_lection4;

import java.util.Arrays;

public class dz4_6 {
    public static void main(String[] args) {
        int[][] mas = {{6, -41, 24}, {-63, -1, -7}, {0, 94, 53}};
        System.out.println("Дана матрица:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Отсортированный вид:");
        for (int i = 0; i < mas.length; i++) {
            int[] sortedMas = new int[mas.length];
            for (int j = 0; j < mas[i].length; j++) {
                sortedMas[j] = mas[i][j];
            }
            Arrays.sort(sortedMas);
            for (int k = 0; k < mas.length; k++) {
                System.out.print(sortedMas[k] + " ");
            }
            System.out.println();
        }
    }
}
