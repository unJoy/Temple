package by.htp.jd01.less06un03.hw05;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
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


	public void reduction(){

		int nod;
		if(this.numerator > this.denominator){
			nod = this.numerator;
		}else {
			nod = this.denominator;
		}

		while ( !((this.numerator % nod == 0) && (this.denominator % nod == 0)) ){
			nod--;
		}

		this.numerator /= nod;
		this.denominator /= nod;

	}

}
