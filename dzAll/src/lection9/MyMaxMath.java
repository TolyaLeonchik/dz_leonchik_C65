package lection9;

import java.util.List;

public final class MyMaxMath {
    public static int calculateMax(List<Integer> List) {
        int max = List.get(0);
        for (Integer number :
                List) {
            if (max <= number) {
                max = number;
            }
        }
        return max;
    }
}
