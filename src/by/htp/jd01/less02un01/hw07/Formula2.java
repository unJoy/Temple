package by.htp.jd01.less02un01.hw07;

import java.util.Scanner;

public class Formula2 {

	public static void main(String[] args) {

		double a = 0;   // these variables are not used to solve this formula,
		double b = 0;   // but may be used if the formula is changed
		double c = 0;
		double d = 0;
		double result;
		
		System.out.println("(a / c) * (b / d) - (a * b - c) / (c * d) \n");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

		for(char i = 'a'; i < 'e'; i++){

			System.out.printf("Enter the value of variable %s: ", i);

			while (!sc.hasNextDouble()) {
				System.out.println("The value you have entered is not a real number!");
				System.out.printf("Re-enter the value of variable %s: ", i);
				sc.next();
			}

			switch(i){
				case 'a':
					a = sc.nextDouble();
					break;
				case 'b':
					b = sc.nextDouble();
					break;
				case 'c':
					c = sc.nextDouble();
					break;
				case 'd':
					d = sc.nextDouble();
					break;
			}
		}

		
		if (c * d != 0) {
			result =  (a / c) * (b / d) - (a * b - c) / (c * d);
		} else {
			System.out.println("\nDenominator equals 0");
			result = Double.NaN;
		}

		System.out.println("\nResult: " + result);

	}

}
