package lection9;

import java.util.List;

public final class MyMinMath {
    public static int calculateMin(List<Integer> List) {
        int min = List.get(0);
        for (Integer number :
                List) {
            if (min >= number) {
                min = number;
            }
        }
        return min;
    }
}
