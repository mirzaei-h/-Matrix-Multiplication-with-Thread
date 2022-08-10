package MatrixMultiplication;

import java.util.Random;

public class MatrixGenerator {

    public static int[][] generateMatrixRandom(int rows, int columns) {

        // output array to store the matrix values
        int[][] result = new int[rows][columns];

        // TO generate a random integer.
        Random random = new Random();

        // adding values at each index.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = random.nextInt(20);
            }
        }
        // returning output.
        return result;
    }
}
