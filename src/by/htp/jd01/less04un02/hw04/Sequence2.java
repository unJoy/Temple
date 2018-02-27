package by.htp.jd01.less04un02.hw04;

import java.util.Scanner;

public class Sequence2 {

    @SuppressWarnings("resource")
    private static Scanner sc = new Scanner(System.in);

    private static int[] enterIntArray() {

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

        int[] arrInt = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter arr[" + i + "]: ");
            while (sc.hasNext()) {
                if(sc.hasNextInt()){
                    arrInt[i] = sc.nextInt();
                    if(arrInt[i] > 0){
                        break;
                    } else {
                        System.out.println("It is not a natural number!");
                        System.out.print("Re-enter arr[" + i + "]: ");
                    }
                } else {
                    sc.next();
                    System.out.print("Not double! Re-enter arr[" + i + "]: ");
                }
            }
        }

        return arrInt;
    }



    private static int[] ifEven(int[] arr){

        int[] arrEven = new int[arr.length];
        int j = 0;

        for(int i = 0; i< arr.length; i++){
            if((arr[i] % 2) == 0){
                arrEven[j] = arr[i];
                j++;
            }
        }

        return arrEven;
    }



    public static void main(String[] args){

        int[] arr;
        int[] arrEven;

        arr = enterIntArray();
        arrEven = ifEven(arr);

        show(arr, arrEven);
    }



    private static void show(int[] arr, int[] arrEven){

        System.out.print("\nFull sequence: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEven numbers of the sequence: ");
        for(int i = 0; i < arrEven.length; i++){
            System.out.print(arrEven[i] + " ");
        }
    }
}
