package MatrixMultiplication;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParallelIndividualMultiplier {

    public static void multiply(int[][] result,int[][] matrix1,int[][] matrix2)
    {
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix2[0].length;j++)
            {
                IndividualMultiplierTask IMT = new IndividualMultiplierTask(result,matrix1,matrix2,i,j);
                Thread T = new Thread(IMT);
                T.start();
                threads.add(T);

                if(threads.size()==10)
                {
                    waitForThreads(threads);
                    threads.clear();
                }
            }
        }

    };
    //stop making new threads if current threads runnig is 10 must wait for threads to finish
    protected static void waitForThreads(List<Thread> threads)
    {
        for(int i = 0; i < threads.size(); i++)
        {
            try {
                threads.get(i).join();
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }

    }
}
