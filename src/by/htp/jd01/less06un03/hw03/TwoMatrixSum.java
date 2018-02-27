package by.htp.jd01.less06un03.hw03;

import java.util.Random;
import java.util.Scanner;

public class TwoMatrixSum {

    public static int[][] initMatrix(){

        int[][] matrix;
        int line = 0;
        int column = 0;

        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        Random randGen = new Random();

        System.out.println("Generate matrix size [N][N]");

        System.out.print("Enter the number of lines: ");
        while (scan.hasNext()) {
            if(scan.hasNextInt()){
                line = scan.nextInt();
                if(line >= 1){
                    break;
                } else {
                    System.out.println("The number of matrix lines can't be < 1");
                    System.out.print("Enter the number of lines: ");
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print("Enter the number of lines: ");
                scan.next();
            }
        }

        System.out.print("Enter the number of columns: ");
        while (scan.hasNext()) {
            if(scan.hasNextInt()){
                column = scan.nextInt();
                if(column >= 1){
                    break;
                } else {
                    System.out.println("The number of matrix columns can't be < 1");
                    System.out.print("Enter the number of columns: ");
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print("Enter the number of columns: ");
                scan.next();
            }
        }

        matrix = new int[line][column];

        for(int i = 0; i<line; i++){
            for(int j = 0; j<column; j++){
                matrix[i][j] = randGen.nextInt(50)+1;
            }
        }

        return matrix;
    }



    public static int[][] initMatrix2(int[][] matrix){

        int[][] matrix2 = new int[matrix.length][matrix[0].length];

        Random randGen = new Random();

        for(int i = 0; i<matrix2.length; i++){
            for(int j = 0; j<matrix2[i].length; j++){
                matrix2[i][j] = randGen.nextInt(99);
            }
        }

        return matrix2;
    }


    public static void main(String[] args){

        int[][] matrixA = initMatrix();
        int[][] matrixB = initMatrix2(matrixA);
        int[][] matrixSum = sumMatrix(matrixA, matrixB);

        show(matrixA, "\nGenerated matrix A:");
        show(matrixB, "\nGenerated matrix B:");
        show(matrixSum, "\nResult matrix C == A + B:");
    }


    public static void show(int[][] matrix, String msg){

        System.out.println(msg);

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.printf("[%3d] ", matrix[i][j]);
                if(j == (matrix[i].length - 1)){
                    System.out.println();
                }
            }
        }

    }


    public static int[][] sumMatrix(int[][] matrix, int[][] matrix2){

        int[][] matrixSum = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSum[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }

        return matrixSum;
    }
}
