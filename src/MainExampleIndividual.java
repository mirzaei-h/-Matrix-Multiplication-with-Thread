package MatrixMultiplication;


import threads.MatrixGeneratorUtil;

import java.util.Date;
import java.util.Scanner;


public class MainExampleIndividual {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        System.out.print("Row of Matrix A: ");
        int rowA = In.nextInt();
        System.out.print("Column of Matrix A: ");
        int columnA = In.nextInt();
        System.out.print("Row of Matrix B: ");
        int rowB = In.nextInt();
        System.out.print("Column of Matrix B: ");
        int columnB = In.nextInt();
        System.out.println();


        int matrix1[][] = MatrixGenerator .generateMatrixRandom(rowA, columnA);
        int matrix2[][]= MatrixGenerator.generateMatrixRandom(rowB, columnB);
//        int matrix1[][] = {{1, 2}, {3, 4},{1, 2}};
//        int matrix2[][] = {{5, 6,3}, {8, 10,4}};

        int result[][] = new int[matrix1.length][matrix2[0].length];


        ParallelIndividualMultiplier.multiply(result, matrix1, matrix2);


    }
}

