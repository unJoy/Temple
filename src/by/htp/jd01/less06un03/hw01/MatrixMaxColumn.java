package by.htp.jd01.less06un03.hw01;

import java.util.Scanner;
import java.util.Random;

public class MatrixMaxColumn {

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
                matrix[i][j] = randGen.nextInt(999);
            }
        }

        return matrix;
    }

    public static void main(String[] args){
        int[][] matrix = initMatrix();
        int[] max = maxValueColumn(matrix);
        show(matrix, max, "\nInitialized random array:", "\nMax values in each matrix column:");
    }

    public static int[] maxValueColumn(int[][] matrix){

        int[] max = new int[matrix[0].length];
        int k = 0;

        for(int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if (max[k] < matrix[j][i]) {
                    max[k] = matrix[j][i];
                }
            }
            k++;
        }

        return max;
    }

    public static void show(int[][] matrix, int[] max, String msg1, String msg2){

        System.out.println(msg1);

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.printf("[%3d] ", matrix[i][j]);
                if(j == (matrix[i].length - 1)){
                    System.out.println();
                }
            }
        }

        System.out.println(msg2);

        for(int i = 0; i< max.length; i++){
            System.out.printf("[%3d] ", max[i]);
        }
    }
}
