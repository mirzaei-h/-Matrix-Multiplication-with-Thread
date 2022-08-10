package MatrixMultiplication;


public abstract class MultiplierTask implements Runnable {

    protected final int[][] result;
    protected final int[][] matrix1;
    protected final int[][] matrix2;

    public MultiplierTask(
            int[][] result,
            int[][] matrix1,
            int[][] matrix2
    ) {

        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

}
