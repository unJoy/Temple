package by.htp.jd01.less07un03.cw01;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {// constructor
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction add(Fraction obj) {
		int newNumerator;
		int newDenominator;

		newDenominator = this.denominator * obj.denominator;
		newNumerator = this.numerator * obj.denominator + obj.numerator
				* this.denominator;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}

	public Fraction add(int number){
		int newNumerator;
		int newDenominator;
		
		newDenominator = denominator;
		newNumerator = numerator * 1 + number * denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public int getNumerator() {
		return this.numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	
	public void sokr(){
		
		int nod;
		if(this.numerator > this.denominator){
			nod = this.numerator;
		}else {
			nod = this.denominator;
		}
		
		
		while ( !((this.numerator % nod == 0) && (this.denominator % nod == 0))  ){
			nod--;
		}
		
		this.numerator = this.numerator / nod;
		this.denominator = this.denominator / nod;
		
	}

}
