public class sudokuSolver {

    public static boolean isSafe(int[][] sBoard, int row, int col, int num) {
        // for col
        for (int i = 0; i < sBoard.length; i++) {
            if (sBoard[i][col] == num)
                return false;
        }

        // for row
        for (int j = 0; j < sBoard.length; j++) {
            if (sBoard[row][j] == num)
                return false;
        }

        // for grid
        int startingRow = (row/3)*3;
        int startingCol = (col/3)*3;

        for (int i = startingRow; i < (startingRow + 3); i++) {
            for (int j = startingCol; j < (startingCol + 3); j++) {
                if(sBoard[i][j]==num)
                    return false;
            }
        }
        return true;
    }

    public static boolean helper(int[][] sBoard, int row, int col) {
        //base case
        if (row == sBoard.length - 1 && col == sBoard.length) {
            return true;
        }

        if (col == sBoard.length) {
            col = 0;
            row++;
        }

        if (sBoard[row][col] != 0) {
            return helper(sBoard, row, col + 1);
        }

        for (int num = 1; num < 10; num++) {
            if (isSafe(sBoard, row, col, num)) {
                sBoard[row][col] = num;

                if(helper(sBoard,row,col+1))
                return true;
            }

            sBoard[row][col] = 0;
        }

        return false;

    }

    public static void printSudoku(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudokuBoard = { 
                { 8, 0, 3, 1, 0, 5, 4, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 6, 0, 0 },
                { 0, 1, 0, 7, 0, 6, 0, 3, 0 },
                { 0, 9, 0, 0, 0, 0, 3, 0, 8 },
                { 0, 0, 0, 3, 4, 7, 0, 0, 0 },
                { 6, 0, 5, 0, 0, 0, 0, 1, 0 },
                { 0, 7, 0, 6, 0, 9, 0, 4, 0 },
                { 0, 0, 2, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 6, 2, 0, 8, 5, 0, 9 }
                };

        if(helper(sudokuBoard, 0, 0))
            printSudoku(sudokuBoard);
            else
                System.out.println("No valid Solution exists");

    }
}