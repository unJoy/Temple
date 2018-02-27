package by.htp.jd01.less02un01.hw04;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Digital2 {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the value of 'a': ");
		while (!sc.hasNextDouble()) {
			System.out.println("The value you have entered is not a real number!");
			System.out.print("Re-enter the value of 'a': ");
			sc.next();
		}
		a = sc.nextDouble();

		
		System.out.print("Enter the value of 'b': ");
		while (!sc.hasNextDouble()) {
			System.out.println("The value you have entered is not a real number!");
			System.out.print("Re-enter the value of 'b': ");
			sc.next();
		}
		b = sc.nextDouble();

		
		if (a == b) {
			System.out.print("it's New Year's Eve soon!");
		} else {
			double c = 0;

			System.out.print("Enter the value of 'c': ");
			while (!sc.hasNextDouble()) {
				System.out.println("The value you have entered is not a real number!");
				System.out.print("Re-enter the value of 'c': ");
				sc.next();
			}
			c = sc.nextDouble();

			System.out.println();

			System.out.println(a + b + c);
			System.out.println(pow(a, 2) + pow(b, 2));
			System.out.println("my favourite football team");
		}

	}

}
