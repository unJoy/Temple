package by.htp.jd01.less06un03.hw05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Fraction[] frArr = initialize("Enter the number of fractions: ");
		show(frArr);

	}


	public static Fraction[] initialize(String msg){

		int number = 0;
		int numerator = 0;
		int denominator = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print(msg);

		while(scan.hasNext()) {
			if (scan.hasNextInt()) {
				number = scan.nextInt();
				if (number >= 1) {
					break;
				} else {
					System.out.println("Number of fractions cannot be < 1");
					System.out.print(msg);
				}
			} else {
				System.out.println("The value you have entered is not an integer!");
				System.out.print(msg);
				scan.next();
			}
		}

		Fraction[] frArr = new Fraction[number];


		for(int i = 0; i < number; i++){

			System.out.print("\nfr" + (i+1) + " num: ");

			while (!scan.hasNextInt()) {
				System.out.println("The value you have entered is not an integer!");
				System.out.print("fr" + (i+1) + " num: ");
				scan.next();
			}
			numerator = scan.nextInt();


			System.out.print("fr" + (i+1) + " den: ");

			while(scan.hasNext()) {
				if (scan.hasNextInt()) {
					denominator = scan.nextInt();
					if (denominator != 0) {
						break;
					} else {
						System.out.println("Denominator cannot equal null!");
						System.out.print("fr" + (i+1) + " den: ");
					}
				} else {
					System.out.println("The value you have entered is not an integer!");
					System.out.print("fr" + (i+1) + " den: ");
					scan.next();
				}
			}

			frArr[i] = new Fraction(numerator, denominator);
			frArr[i].reduction();
		}

		return frArr;
	}


	public static void show(Fraction[] frArr){

		System.out.println("\nFractions: ");

		for(int i = 0; i < frArr.length; i++){
			System.out.println((i+1) + ": " + frArr[i].getNumerator() + "/" + frArr[i].getDenominator());
		}
	}

}
