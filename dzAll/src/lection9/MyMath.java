package lection9;

import java.util.List;

public final class MyMath {
    public static double calculateAvg(List<Integer> List){
        int sum = 0;
        for (Integer number:
             List) {
            sum = sum + number;
        }
        return (double)sum / List.size();
    }
}
