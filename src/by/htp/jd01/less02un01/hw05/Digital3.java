package by.htp.jd01.less02un01.hw05;

import static java.lang.Math.random;
import static java.lang.Math.abs;
import java.util.Scanner;

public class Digital3 {

	public static void main(String[] args) {

		int n = 0; 
		int counterEven = 0; 
		int counterMultOf3 = 0; 
		int counterAbsLess3 = 0; 

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter numbers' quantity: ");
		while (!sc.hasNextInt()) {
			System.out.println("The value you have entered is not integer!");
			System.out.print("Re-enter numbers' quantity: ");
			sc.next();
		}
		n = sc.nextInt();


		int[] arr = new int[n];


		System.out.println("Numbers:");

		for (int i = 0; i < n; i++) {

			arr[i] = (int) (random() * 200);

			if ((i % 10) == 0) {
				System.out.println();
			}
			
			System.out.print(arr[i] + "\t");
			
			if (arr[i] % 2 == 0) {
				counterEven++;
			}
			
			if (arr[i] % 3 == 0) {
				counterMultOf3++;
			}
			
			if (abs(arr[i]) < 3) {
				counterAbsLess3++;
			}
		}

		System.out.println("\n\nQuantity of even numbers: " + counterEven);
		
		System.out.println("Quantity of multiple of 3 numbers: " + counterMultOf3);
		
		System.out.println("Quantity of numbers whose abs value is less than 3: " + counterAbsLess3);
	}

}
