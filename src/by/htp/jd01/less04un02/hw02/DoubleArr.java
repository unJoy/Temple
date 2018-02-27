package by.htp.jd01.less04un02.hw02;

import java.util.Scanner;

public class DoubleArr {

    @SuppressWarnings("resource")
    private static Scanner sc = new Scanner(System.in);


    private static int[] arrNumber(int[] arrInt, int n){

        int[] arrNum = new int[n];
        int j = 0;

        for(int i = 0; i < n; i++){
            if(arrInt[i] == 0){
                arrNum[j] = i;
                j++;
            }
        }

        return arrNum;
    }



    private static int[] enterIntArray() {

        int n = 0;

        System.out.print("Enter array length: ");
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Array length cannot be <= 0");
                    System.out.print("Re-enter array length: ");
                }
            } else {
                sc.next();
                System.out.print("Not integer! Re-enter array length: ");
            }
        }

        int[] arrInt = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter arr[" + i + "]: ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Not integer! Re-enter arr[" + i + "]: ");
            }
            arrInt[i] = sc.nextInt();
        }

        return arrInt;
    }



    public static void main(String[] args){

        int[] arr;
        int[] arrNum;

        arr = enterIntArray();
        arrNum = arrNumber(arr, arr.length);

        showArrNum(arrNum);
    }



    private static void showArrNum(int[] arrNum){

        System.out.println("\nIndexes: ");

        for(int i = 0; arrNum[i] != 0; i++){
            System.out.println("arr[" + arrNum[i] + "]");
        }

    }
}