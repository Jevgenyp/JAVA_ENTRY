public class h5_3 {
    private static final int BOARD_SIZE = 8;
    private static int[] queens = new int[BOARD_SIZE];

    public static void main(String[] args) {
        placeQueens(0);
        printQueens();
    }

    private static void placeQueens(int row) {
        if (row == BOARD_SIZE) {
            return;
        }
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isValidPosition(row, col)) {
                queens[row] = col;
                placeQueens(row + 1);
                if (row == BOARD_SIZE - 1) {
                    return;
                }
            }
        }
    }

    private static boolean isValidPosition(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || queens[i] - i == col - row || queens[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(queens[row] == col ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
