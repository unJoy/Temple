package by.htp.jd01.less02un01.hw09;

import static java.lang.Math.tan;
import java.util.Scanner;

public class Function {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double h = 0;
		double y; // F(x)

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the lower border(a): ");
		while (!sc.hasNextDouble()) {
			System.out.println("The value you have entered is not a real number!");
			System.out.print("Re-enter the lower border(a): ");
			sc.next();
		}
		a = sc.nextDouble();


		System.out.print("Enter the upper border(b) : ");
		while (!sc.hasNextDouble()) {
			System.out.println("The value you have entered is not a real number!");
			System.out.print("Re-enter the upper border(b): ");
			sc.next();
		}
		b = sc.nextDouble();
		
		System.out.print("Enter the step(h): ");
		while (!sc.hasNextDouble()) {
			System.out.println("The value you have entered is not a real number!");
			System.out.print("Re-enter the step(h): ");
			sc.next();
		}
		h = sc.nextDouble();

		
		System.out.println("\n  x\t  F(x)\n");

		for (double x = a; x < b; x += h) {
			
			y = 2 * tan(x / 2) + 1;
			
			System.out.printf("%.2f\t%.2f \n", x, y);
		}

	}

}
