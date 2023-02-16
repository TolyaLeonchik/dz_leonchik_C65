package dz_lection4;

public class dz4_2 {
    public static void main(String[] args) {
        String[][] masChessBoard = new String[8][8];
        String black = "B";
        String white = "W";
        for (int i = 0; i < masChessBoard.length; i++) {
            for (int j = 0; j < masChessBoard[i].length; j = j + 2) {
                if (i % 2 == 0) {
                    masChessBoard[i][j] = white;
                    masChessBoard[i][j + 1] = black;
                } else {
                    masChessBoard[i][j] = black;
                    masChessBoard[i][j + 1] = white;
                }
                System.out.print(masChessBoard[i][j] + " " + masChessBoard[i][j + 1] + " ");
            }
            System.out.println();
        }
    }
}
