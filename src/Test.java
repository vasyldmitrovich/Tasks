import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
        int x = 0;
        int y = 5 / x;
    } catch (Exception e) {
        System.out.println("Exception");
    }
        System.out.println("finished");
        char[][] grid = new char[5][9];
        letterA(grid);

}

    // building letter A
    public static void letterA(char[][] grid) {

        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[row].length; col++)
                if (col == (grid.length - 1 - row) | col + 2 == (grid.length + 1 + row)) {
                    grid[row][col] = 'A';

                } else {
                    grid[row][col] = ' ';
                }
        for (int col = 1; col < 8; col++)
            grid[3][col] = 'A';
    }
}
