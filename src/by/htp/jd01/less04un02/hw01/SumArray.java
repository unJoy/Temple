package by.htp.jd01.less04un02.hw01;

import java.util.Scanner;

public class SumArray {

    @SuppressWarnings("resource")
    private static Scanner sc = new Scanner(System.in);

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

            while(sc.hasNext()) {
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n > 0) {
                        break;
                    } else {
                        System.out.println("It is not a natural number");
                        System.out.print("Re-enter arr[" + i + "]: ");
                    }
                } else {
                    sc.next();
                    System.out.print("Not integer! Re-enter arr[" + i + "]: ");
                }
            }
        }

        return arrInt;
    }



    private static int enterK(){

        int k = 0;

        System.out.print("Enter the value of 'k': ");
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                k = sc.nextInt();
                if (k != 0) {
                    break;
                } else {
                    System.out.println("'k' mustn't equal 0");
                    System.out.print("Re-enter the value of 'k': ");
                }
            } else {
                sc.next();
                System.out.print("Not integer! Re-enter the value of 'k': ");
            }
        }

        return k;
    }



    public static void main(String[] args){

        int[] arr;
        int k = 0;
        int sum = 0;

        arr = enterIntArray();
        k = enterK();

        sum = sumArr(arr, k);

        showSum(k, sum);
    }



    private static void showSum(int k, int s){

        System.out.printf("\nSum of multiple of %d: %d", k, s);

    }



    private static int sumArr(int[] arr, int k){

        int sum = 0;

        for(int i = 0; i < arr.length; i++ ){
            if((arr[i] % k) == 0){
                sum += arr[i];
            }
        }

        return sum;
    }
}
