package by.htp.jd01.less04un02.hw03;

import java.util.Scanner;

public class Sequence {

    @SuppressWarnings("resource")
    private static Scanner sc = new Scanner(System.in);

    private static double[] enterDoubleArray() {

        int n = 0;

        System.out.print("Enter sequence length: ");
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 2) {
                    break;
                } else {
                    System.out.println("Sequence length cannot be <= 2");
                    System.out.print("Re-enter sequence length: ");
                }
            } else {
                sc.next();
                System.out.print("Not integer! Re-enter sequence length: ");
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



    private static boolean ifGrowth(double[] arr){

        int i = 0;
        int j = 1;

        while(j<arr.length) {
            if (arr[i] >= arr[j]) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }



    public static void main(String[] args){

        double[] arr;
        boolean grow;

        arr = enterDoubleArray();
        grow = ifGrowth(arr);

        showArr(arr, grow);
    }



    private static void showArr(double[] arr, boolean growth){

        System.out.print("\nSequence: ");

        for(int i = 0; i < arr.length; i++){
            System.out.printf("%.2f ", arr[i]);
        }

        if(growth){
            System.out.println(" -- This sequence is ascending");
        } else {
            System.out.println(" -- This sequence is NOT ascending");
        }
    }
}
