package by.htp.jd01.less02un01.hw01;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle {
	
	public static void main(String[] args) {

		double a = 0; // 1st cathetus
		double b = 0; // 2nd cathetus
		double c; // hypotenuse
		double sq; // square

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		
		System.out.print("Enter the length of the 1-st cathetus(cm): ");

		while(scan.hasNext()) {
			if (scan.hasNextDouble()) {
				a = scan.nextDouble();
				if (a > 0) {	
					break;
				} else {
				    System.out.println("Length cannot be <= 0");
				    System.out.print("Re-enter the length of the 1-st cathetus(cm): ");   
				}
			} else {
				System.out.println("The value you have entered is not a number!");
				System.out.print("Re-enter the length of the 1-st cathetus(cm): ");
				scan.next();
			}

		}

		
		System.out.print("Enter the length of the 2-nd cathetus(cm): ");

		while(scan.hasNext()) {
			if (scan.hasNextDouble()) {
				b = scan.nextDouble();	
				if (b > 0) {	
					break;	
				} else {
				    System.out.println("Length cannot be <= 0");
				    System.out.print("Re-enter the length of the 2-nd cathetus(cm): ");
				}
			} else {
				System.out.println("The value you have entered is not a number!");
				System.out.print("Re-enter the length of the 2-nd cathetus(cm): ");
				scan.next();
			}
		}


		c = sqrt(pow(a, 2) + pow(b, 2));
		System.out.printf("\nHypotenuse length: %.2f cm\n", c);

		
		sq = (a * b) / 2;
		System.out.printf("Triangle square: %.2f cm^2", sq);
	}

}
