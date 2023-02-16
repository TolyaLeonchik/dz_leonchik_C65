package dz_lection4;

public class dz4_3 {
    public static void main(String[] args) {
        int masA[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int masB[][] = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int lengthFinalRow;
        int lengthFinalString;
        int maxAi = 0;
        int maxAj = 0;
        int maxBi = 0;
        int maxBj = 0;

        for (int i = 0; i < masA.length; i++) {                     //***Сделал для подсчета столбцов/строк для
            for (int j = 0; j < masA[i].length; j++) {              //    финальной матрицы
                maxAj++;
            }
            maxAi++;
        }
        maxAj = maxAj / maxAi;

        for (int i = 0; i < masB.length; i++) {
            for (int j = 0; j < masB[i].length; j++) {
                maxBj++;
            }
            maxBi++;
        }
        maxBj = maxBj / maxBi;

        if (maxAi > maxBi) {
            lengthFinalRow = maxBi;
        } else {
            lengthFinalRow = maxAi;
        }
        if (maxAj > maxBj) {
            lengthFinalString = maxBj;
        } else {
            lengthFinalString = maxAj;
        }
        int masFinal[][] = new int[lengthFinalRow][lengthFinalString];     //сам алгоритм умножения матриц
        for (int i = 0; i < lengthFinalRow; i++) {
            int k = 0;
            for (; k < lengthFinalString; k++) {
                int resultMultiply = 0;
                for (int j = 0; j < lengthFinalString; j++) {
                    resultMultiply = resultMultiply + masA[i][j] * masB[j][k];
                }
                masFinal[i][k] = resultMultiply;
                System.out.print(masFinal[i][k] + " ");
            }
            System.out.println();
        }
    }
}
