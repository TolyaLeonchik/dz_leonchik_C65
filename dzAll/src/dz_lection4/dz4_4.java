package dz_lection4;

public class dz4_4 {
    public static void main(String[] args) {
        int[][] mas = {{5, 7, 9}, {11, 2, 17}, {30, 0, 25}};
        int sumAllElements = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                sumAllElements = sumAllElements + mas[i][j];
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n" + sumAllElements);
    }
}
