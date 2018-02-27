package by.htp.jd01.less02un01.hw02;

import static java.lang.Math.pow;
import static java.lang.Math.log;
import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double rez;

		System.out.println("a^2 - (b - c)^2 + ln(b^2 + 1) \n");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);


		for(char i = 'a'; i < 'd'; i++){

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
			}
		}


		rez = pow(a, 2) - pow((b - c), 2) + log(pow(b, 2) + 1);
		
		System.out.printf("\nResult: %.3f", rez);
	}
	
}
