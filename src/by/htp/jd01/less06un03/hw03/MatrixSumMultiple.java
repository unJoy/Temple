package by.htp.jd01.less06un03.hw03;

import java.util.Random;
import java.util.Scanner;

public class MatrixSumMultiple {


    public static long getMult(int[][] matrix){

        long mult = matrix[0][0];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length; j++) {
                mult *= matrix[i][j];
            }
        }

        return mult;
    }



    public static int getSum(int[][] matrix){

        int sum = matrix[0][0];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static int[][] initMatrix(){

        int[][] matrix;
        int line = 0;
        int column = 0;

        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        Random randGen = new Random();

        System.out.println("Create matrix size [N][N]");

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
                matrix[i][j] = randGen.nextInt(2)+1;
            }
        }

        return matrix;
    }

    public static void main(String[] args){

        int[][] matrix = initMatrix();
        int sum = getSum(matrix);
        long mult = getMult(matrix);

        show(matrix, sum, mult);
    }


    public static void show(int[][] matrix, int sum, long mult){

        System.out.println("Initialized matrix [N][N]:");

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.printf("[%d] ", matrix[i][j]);
                if(j == (matrix[i].length - 1)){
                    System.out.println();
                }
            }
        }

        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Mult of all elements: " + mult);
    }
}
