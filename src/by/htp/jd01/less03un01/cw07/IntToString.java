package by.htp.jd01.less03un01.cw07;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args){

        int n;
        String str;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the integer number: ");
        while(!sc.hasNextInt()){
            System.out.println("The value you have entered is not integer!");
            System.out.print("Re-enter the value of 'n': ");
            sc.next();
        }
        n = sc.nextInt();


        int[] intArr = new int[n];
        char[] chStr = new char[n];

        str = Integer.toString(n);
        chStr = str.toCharArray();

        for(int i = 0; i < chStr.length; i++){
            System.out.println("chStr[" + i + "] == " + chStr[i]);
            intArr[i] = Integer.parseInt(chStr[i] + "");
        }

    }
}
