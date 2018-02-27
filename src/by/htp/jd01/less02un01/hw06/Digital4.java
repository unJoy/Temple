package by.htp.jd01.less02un01.hw06;

import static java.lang.Math.random;
import java.util.Scanner;

public class Digital4 {

	public static void main(String[] args) {

		int n = 0;
		int countEven = 0; 
		int countMore15 = 0; 

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the quantity of real numbers: ");
		while (!sc.hasNextInt()) {
			System.out.println("The value you have entered is not integer!");
			System.out.print("Re-enter the quantity of real numbers: ");
			sc.next();
		}
		n = sc.nextInt();


		int[] arrInt = new int[n];

		
		System.out.println("\nReal numbers before being cut");

		for (int i = 0; i < n; i++) {

			arrInt[i] = (int) (32768 + random() * 500);

			if ((i % 10) == 0) {
				System.out.println();
			}
			
			System.out.print(arrInt[i] + "\t");
		}

		
		short[] arrShort = new short[n];

		
		System.out.println("\n\n\nReal numbers after being cut:");

		for (int i = 0; i < n; i++) {

			arrShort[i] = (short) arrInt[i];

			if ((i % 10) == 0)
				System.out.println();

			System.out.print(arrShort[i] + "\t");

			if (arrShort[i] % 2 == 0) {
				countEven++;
			}

			if (arrShort[i] > 15) {
				countMore15++;
			}

		}

		System.out.println("\n\nQuantity of even numbers: " + countEven);
		
		System.out.println("Quantity of numbers which are more than 15: " + countMore15);
	}

}
