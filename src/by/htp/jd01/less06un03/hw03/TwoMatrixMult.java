package by.htp.jd01.less06un03.hw03;

import java.util.Random;
import java.util.Scanner;

public class TwoMatrixMult {

    public static Scanner scan = new Scanner(System.in);
    public static Random randGen = new Random();


    public static void main(String[] args) {

        int[][] matrixA = initMatrix("Enter A lines num: ", "Enter A columns num: ");
        show(matrixA, "\nGenerated matrix A:");

        int[][] matrixB = initMatrix2(matrixA, "\nEnter B columns num: ");
        show(matrixB, "\nGenerated matrix B:");

        int[][] matrixMult = multMatrix(matrixA, matrixB);
        show(matrixMult, "\nResult matrix C == A * B:");

    }


    public static int[][] initMatrix(String msg, String msg2) {

        int[][] matrix;
        int line = 0;
        int column = 0;

        System.out.println("Set matrix A & B size:");

        System.out.print(msg);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                line = scan.nextInt();
                if (line >= 1) {
                    break;
                } else {
                    System.out.println("The number of matrix lines can't be < 1");
                    System.out.print(msg);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msg);
                scan.next();
            }
        }

        System.out.print(msg2);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                column = scan.nextInt();
                if (column >= 1) {
                    break;
                } else {
                    System.out.println("The number of matrix columns can't be < 1");
                    System.out.print(msg2);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msg2);
                scan.next();
            }
        }

        matrix = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = randGen.nextInt(10) + 1;
            }
        }

        return matrix;
    }


    public static int[][] initMatrix2(int[][] matrix, String msg) {

        int column = 0;

        System.out.print(msg);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                column = scan.nextInt();
                if (column >= 1) {
                    break;
                } else {
                    System.out.println("The number of matrix columns can't be < 1");
                    System.out.print(msg);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msg);
                scan.next();
            }
        }

        int[][] matrix2 = new int[matrix[0].length][column];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = randGen.nextInt(10)+1;
            }
        }

        return matrix2;
    }


    public static void show(int[][] matrix, String msg) {

        System.out.println(msg);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%4d] ", matrix[i][j]);
                if (j == (matrix[i].length - 1)) {
                    System.out.println();
                }
            }
        }

    }


    public static int[][] multMatrix(int[][] matrix, int[][] matrix2) {

        int[][] matrixMult;
        matrixMult = new int[matrix.length][matrix2[0].length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for(int k = 0; k < matrix2.length; k++) {
                    matrixMult[i][j] += (matrix[i][k] * matrix2[k][j]);
                }
            }
        }

        return matrixMult;
    }

}
