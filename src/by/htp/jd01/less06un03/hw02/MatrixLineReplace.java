package by.htp.jd01.less06un03.hw02;

import java.util.Random;
import java.util.Scanner;

public class MatrixLineReplace {

    public static Scanner sc = new Scanner(System.in);

    public static int[][] initMatrix(String msgLine, String msgColumn){

        int[][] matrix;
        int line = 0;
        int column = 0;

        Random randomGenerator = new Random();

        System.out.println("Create matrix size [N][N]");

        System.out.print(msgLine);
        while (sc.hasNext()) {
            if(sc.hasNextInt()){
                line = sc.nextInt();
                if(line >= 1){
                    break;
                } else {
                    System.out.println("The number of matrix lines can't be < 1");
                    System.out.print(msgLine);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msgLine);
                sc.next();
            }
        }

        System.out.print(msgColumn);
        while (sc.hasNext()) {
            if(sc.hasNextInt()){
                column = sc.nextInt();
                if(column >= 1){
                    break;
                } else {
                    System.out.println("The number of matrix columns can't be < 1");
                    System.out.print(msgColumn);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msgColumn);
                sc.next();
            }
        }

        matrix = new int[line][column];

        for(int i = 0; i<line; i++){
            for(int j = 0; j<column; j++){
                matrix[i][j] = randomGenerator.nextInt(999);
            }
        }

        return matrix;
    }



    public static void main(String[] args){
        int[][] matrix = initMatrix("Enter the number of lines: ", "Enter the number of columns: ");
        show(matrix, "\nRandom matrix: ");
        replaceLine(matrix, "Enter 1st line number: ", "Enter 2nd line number: ");
        show(matrix, "\nRandom matrix after change: ");
    }



    public static void replaceLine(int[][] matrix, String msgLine1, String msgLine2){

        int line1 = 0;
        int line2 = 0;
        int temp = 0;
        int i = 0;

        System.out.println("\nWhich lines would you like to replace?");

        System.out.print(msgLine1);
        while (sc.hasNext()) {
            if(sc.hasNextInt()){
                line1 = sc.nextInt() - 1;
                if(line1 >= 0){
                    break;
                } else {
                    System.out.println("The number of matrix lines can't be < 1");
                    System.out.print(msgLine1);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msgLine1);
                sc.next();
            }
        }

        System.out.print(msgLine2);
        while (sc.hasNext()) {
            if(sc.hasNextInt()){
                line2 = sc.nextInt() - 1;
                if(line2 >= 0){
                    break;
                } else {
                    System.out.println("The number of matrix lines can't be < 1");
                    System.out.print(msgLine2);
                }
            } else {
                System.out.println("The value you have entered is not integer.");
                System.out.print(msgLine2);
                sc.next();
            }
        }

        while((i < matrix[line1].length) && (i < matrix[line2].length)){
            temp = matrix[line1][i];
            matrix[line1][i] = matrix[line2][i];
            matrix[line2][i] = temp;
            i++;
        }
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


}
