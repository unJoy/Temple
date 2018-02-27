package by.htp.jd01.less03un01.cw02;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Listing_02_Formula {
	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double result;

		System.out.println("(b + sqrt(b^2 + 4 * a * c)) / (2 * a) - a^3 * c + b \n");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of variable 'a': ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				if (a != 0) {
					break;
				} else { 
					System.out.println("Error! Denominator equals 0");
					System.out.print("Re-enter the value of variable 'a': ");
				}
			} else {
				System.out.println("The value you have entered is not a real number!");
				System.out.print("Re-enter the value of variable 'a': ");
				sc.next();
			}
		}

		System.out.print("Enter the value of variable 'b': ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
				break;
			} else {
				System.out.println("The value you have entered is not a real number!");
				System.out.print("Re-enter the value of variable 'b': ");
				sc.next();
			}
		}

		System.out.print("Enter the value of variable 'c': ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				break;
			} else {
				System.out.println("The value you have entered is not a real number!");
				System.out.print("Re-enter the value of variable 'c': ");
				sc.next();
			}
		}

		result = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + b;

		System.out.println("\nResult: " + result);

	}

}
