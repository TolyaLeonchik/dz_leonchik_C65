package dz_lection2;

public class dz2_8 {
    public static void main(String[] args) {
        int i = 4;
        int n = 4;
        String x = "*";
        String h = "";
        System.out.println("Часть (1)");

        for (int u = 3; u >= 0; u--) {
            int l = 1;
            while (l < n) {
                System.out.print(" ");
                l++;
            }
            n = n - 1;
            System.out.println(x);
            x = x + "*";
        }

        System.out.println("Часть (2)");
        for (int r = 3; r >= 0; r--) {
            int k = 0;
            System.out.print(h);
            while (k < i) {
                System.out.print("*");
                k++;
            }
            h = h + " ";
            i = i - 1;
            System.out.println();
        }
    }
}
