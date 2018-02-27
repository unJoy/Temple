package by.htp.jd01.less02un01.hw03;

import java.util.Scanner;

public class Digital {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double sum;

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


		if (a > b) {

			System.out.print("Enter the value of 'c': ");
			while (!sc.hasNextDouble()) {
				System.out.println("The value you have entered is not a real number!");
				System.out.print("Re-enter the value of 'c': ");
				sc.next();
			}
			c = sc.nextDouble();

			sum = b + c;

			System.out.println("sum: " + sum);
		}

		
		else if (a == b) {
			System.out.println("The end");
		}

		
		else if (a < b) {

			System.out.print("Enter the value of 'c': ");
			while (!sc.hasNextDouble()) {
				System.out.println("The value you have entered is not a real number!");
				System.out.print("Re-enter the value of 'c': ");
				sc.next();
			}
			c = sc.nextDouble();

			sum = a + b + c;

			System.out.println(sum + " New Year!");
		}

	}

}
