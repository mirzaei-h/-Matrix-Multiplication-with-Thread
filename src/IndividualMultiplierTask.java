package MatrixMultiplication;

public class IndividualMultiplierTask  extends MultiplierTask
{

    private int row;
    private int column;

    public IndividualMultiplierTask(int[][] result,int[][] matrix1,int[][] matrix2,int row,int column)
    {
        super(result, matrix1,matrix2);
        this.row=row;
        this.column=column;
    }

    @Override
    public void run()
    {
        //matrix multiplication
        for(int i=0;i<this.matrix1[0].length;i++)
        {
            this.result[row][column]+=(this.matrix1[row][i]*this.matrix2[i][column]);
        }
        System.out.printf(Thread.currentThread().getName()+ " index ["+row+" "+column+"] "+this.result[row][column]+" \n");
    }
}
