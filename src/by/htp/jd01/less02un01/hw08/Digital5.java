package by.htp.jd01.less02un01.hw08;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Digital5 {

	public static void main(String[] args) {

		double d1 = 0;
		double d2 = 0;
		double d3 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double[] arrDouble = new double[3];


		for(int i = 0; i < 3; i++){

			System.out.printf("Enter real number %d: ", i+1);

			while (!sc.hasNextDouble()) {
				System.out.println("The value you have entered is not a real number!");
				System.out.printf("Re-enter real number %d: ", i+1);
				sc.next();
			}

			switch(i){
				case 0:
					d1 = sc.nextDouble();
					arrDouble[i] = d1;
					break;
				case 1:
					d2 = sc.nextDouble();
					arrDouble[i] = d2;
					break;
				case 2:
					d3 = sc.nextDouble();
					arrDouble[i] = d3;
					break;
			}

			System.out.print("Modified real numbers:  ");

			if (arrDouble[i] > 0) {
				arrDouble[i] = pow(arrDouble[i], 2);
			}

			if (arrDouble[i] < 0) {
				arrDouble[i] = pow(arrDouble[i], 4);
			}

			System.out.print(arrDouble[i] + " ");
		}
	}
}
