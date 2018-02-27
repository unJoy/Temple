package by.htp.jd01.less03un01.cw03;

import static java.lang.Math.cos;
import static java.lang.Math.log;
import java.util.Scanner;

public class Listing_3_Formula {
    public static void main(String[] args){

        double x = 0;
        double y = 0;
        double result;

        System.out.println("\nx * lnx + y / (cos(x) - x / 3)\n");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the value of variable 'x': ");

        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                x = sc.nextDouble();
                break;
            } else {
                System.out.println("The value you have entered is not a real number!");
                System.out.print("Re-enter the value of variable 'x': ");
                sc.next();
            }
        }


        System.out.print("Enter the value of variable 'y': ");

        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                y = sc.nextDouble();
                break;
            } else {
                System.out.println("The value you have entered is not a real number!");
                System.out.print("Re-enter the value of variable 'y': ");
                sc.next();
            }
        }

        if(cos(x) - x/3 != 0) {
            result = x * log(x) + y / (cos(x) - x / 3);
            System.out.printf("Result: %.3f", result);
        } else {
            System.out.println("Error! Denominator equals 0");
        }
    }
}
