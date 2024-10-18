import java.util.Arrays;

public class Board {
    private final int rows;
    private final int columns;
    private final String[][] grid;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(this.grid[i], " ");
        }
    }

    public boolean dropDisc(int column, String color) {
        for (int i = rows - 1; i >= 0; i--) {
            if (grid[i][column].equals(" ")) {
                grid[i][column] = color;
                return true;
            }
        }
        return false;
    }

    public boolean checkWin(String color) {

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(Arrays.toString(grid[i])).append("\n");
        }
        return sb.toString();
    }
}
