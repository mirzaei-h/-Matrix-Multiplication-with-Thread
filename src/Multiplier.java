package MatrixMultiplication;
//
import java.util.List;

public abstract class Multiplier {

    public abstract void multiply(int[][] matrix1, int[][] matrix2, int[][] result);
    protected abstract void waitForThreads(List<Thread> threads);
}
