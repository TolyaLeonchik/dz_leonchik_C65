package dz_lection4;

public class dz4_5 {
    public static void main(String[] args) {
        int[][] mas = {{6, 7, 2}, {10, 3, 4}, {0, 5, 8}};
        System.out.println("Главная диагональ:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][i] + " ");
        }
        System.out.println("\nПобочная диагональ:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][mas.length - 1 - i] + " ");
        }
    }
}
