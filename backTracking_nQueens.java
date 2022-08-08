//print all the places where queens are safe

public class backTracking_nQueens {

    public static void main(String[] args) {
        int n = 8;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        printNQueens(board, 0);

    }

    public static boolean printNQueens(char board[][], int col) {

        if (col >= board.length) {
            printBoard(board);
            return true;
        }

        for (int row = 0; row < board.length; row++) {
            if (isQueenSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (printNQueens(board, col + 1)) {
                    return true;
                }

                board[row][col] = '.';
            }
        }

        return false;
    }

    public static boolean isQueenSafe(char board[][], int row, int col) {

        int i = 0;
        int j = 0;

        for (i = 0; i < col; i++) {
            if (board[row][i] == 'Q')
                return false;
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;

        }

        for(i=row,j=col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;

        }

        return true;
    }

    public static void printBoard(char board[][]) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
}
