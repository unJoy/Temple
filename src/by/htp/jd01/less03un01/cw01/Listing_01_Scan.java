package by.htp.jd01.less03un01.cw01;

import java.util.Scanner;

public class Listing_01_Scan {
	
	public static void main(String[] args) {

		int i = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of 'i': ");
		
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				break;
			} else {
				System.out.println("The value you have entered is not integer!");
				System.out.print("Re-enter the value of 'i': ");
				sc.next();
			}
		}
		
		System.out.println("i = " + i);
		
	}
	
}
