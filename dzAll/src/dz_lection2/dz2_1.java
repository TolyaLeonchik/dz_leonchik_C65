package dz_lection2;

public class dz2_1 {
    public static void main(String[] args) {
        double dayPath = 10;
        double sumPath = 0;
        for (int i = 0; i < 7; i++) {
            sumPath = sumPath + dayPath;
            dayPath = dayPath + dayPath * 0.1;
        }
        System.out.println(sumPath);
    }
}
