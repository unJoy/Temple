package by.htp.jd01.less04un02.hw00;

import java.util.Scanner;

public class MaxMinSelectionSort {

    @SuppressWarnings("resource")
    private static Scanner sc = new Scanner(System.in);

    private static double[] bubbleSort(double[] arrDouble) {

        int min = 0;
        double tmp = 0;

        for (int i = 0; i < arrDouble.length; i++) {
            for (int j = 1; j < (arrDouble.length - i); j++) {
                if (arrDouble[j-1] > arrDouble[j]) {
                    tmp = arrDouble[j-1];
                    arrDouble[j-1] = arrDouble[j];
                    arrDouble[j] = tmp;
                }
            }
        }

        return arrDouble;
    }



    private static double[] enterDoubleArray() {

        int n = 0;

        System.out.print("Enter array length: ");
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 2) {
                    break;
                } else {
                    System.out.println("Array length cannot be < 2");
                    System.out.print("Re-enter array length: ");
                }
            } else {
                sc.next();
                System.out.print("Not integer! Re-enter array length: ");
            }
        }

        double[] arrDouble = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter arr[" + i + "]: ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print("Not double! Re-enter arr[" + i + "]: ");
            }
            arrDouble[i] = sc.nextDouble();
        }

        return arrDouble;
    }



    public static void main(String[] args){

        double[] arr = enterDoubleArray();
        show(arr, "\nArray before sort: ");

        double[] arrSorted = selectionSort(arr);
        show(arrSorted,"\nArray after sort: ");

        double[] arrIndexMin = minValue(arrSorted);
        double max = maxValue(arrSorted);

        double min = arrIndexMin[0];
        double iMin = arrIndexMin[1];

        System.out.printf("\nIndex min: %.0f\n", iMin);
        showValue(min, "Min: ");
        showValue(max, "Max: ");
    }



    private static double maxValue(double[] arr){

        double max = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }



    private static double[] minValue(double[] arr){

        double min = arr[0];
        double[] arrMinIndex = new double[2];
        double tmp = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                tmp = i;
            }
        }

        arrMinIndex[0] = min;
        arrMinIndex[1] = tmp;

        return arrMinIndex;
    }



    private static double[] selectionSort(double[] arrDouble) {

        int min = 0;
        double tmp = 0;

        for (int i = 0; i < arrDouble.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arrDouble.length; j++) {
                if (arrDouble[j] < arrDouble[min]) {
                    min = j;
                }
            }

            tmp = arrDouble[min];
            arrDouble[min] = arrDouble[i];
            arrDouble[i] = tmp;
        }

        return arrDouble;
    }



    private static void show(double[] arr, String msg){

        System.out.println(msg);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }



    private static void showValue(double val, String msg){

        System.out.println(msg + val);

    }
}
