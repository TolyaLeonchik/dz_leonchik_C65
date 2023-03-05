package lection9;

import java.util.ArrayList;

public class lection9 {
    public static void main(String[] args) {
        ArrayList<Integer> L = new ArrayList<>();
        L.add(Integer.valueOf(7));
        L.add(Integer.valueOf(6));
        L.add(Integer.valueOf(5));
        L.add(Integer.valueOf(10));
        double avg = MyMath.calculateAvg(L);
        System.out.println(avg);
        int min = MyMinMath.calculateMin(L);
        System.out.println(min);
        int max = MyMaxMath.calculateMax(L);
        System.out.println(max);
    }
}
