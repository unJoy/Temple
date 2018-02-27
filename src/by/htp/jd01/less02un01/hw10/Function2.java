package by.htp.jd01.less02un01.hw10;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Function2 {
	
	public static void main(String[] args) {

		double x = 0;
		double y = 0; // F(x)

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the value of variable 'x': ");
		while (!sc.hasNextDouble()) {
			System.out.println("The value you have entered is not a real number!");
			System.out.print("Re-enter the value of variable 'x': ");
			sc.next();
		}
		x = sc.nextDouble();


		if (x <= -3) {
			y = 9;
		} else if (x > 3) {
			y = 1 / ((pow(x, 2) + 1));
		}

		System.out.printf("F(x) = %.4f", y);
		
	}
	
}
