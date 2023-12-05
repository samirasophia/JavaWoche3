package SilvanBonus;

//In minem Lebe werd ich fürimmer es Krüzworträtsel girlie bliebe
public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        boolean solved = doSudoku(board);
        if (solved) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean doSudoku(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == 0) {
                    for (int i = 1; i <= 9; i++) {
                        if (valid(board, r, c, i)) {
                            board[r][c] = i;
                            if (doSudoku(board)) {
                                return true;
                            } else {
                                board[r][c] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean valid(int[][] board, int r, int c, int num) {
        for (int b = 0; b < 9; b++) {
            if (board[r][b] == num) {
                return false;
            }
        }
        for (int b = 0; b < 9; b++) {
            if (board[b][c] == num) {
                return false;
            }
        }


        int startRow = r - r % 3;
        int startCol = c - c % 3;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row + startRow][col + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void printBoard(int[][] board) {
        for (int i = 0; i <= 8; i++) {
            System.out.println();
            for (int j = 0; j <= 8; j++) {
                System.out.print(board[i][j]);
            }
        }

    }
}