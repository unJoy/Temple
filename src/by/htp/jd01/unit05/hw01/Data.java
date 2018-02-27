package by.htp.jd01.unit05.hw01;

public class Data implements Cloneable{

	private int year;
	private int month;
	private int day;


	public Data(int year,int month,int day) {
		this.year  = year;
		this.month = month;
		this.day   = day;
	}


	public int  getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int  getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int  getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass()) {
			return false;
		}

		Data other = (Data) obj;

		if (day != other.day) {
			return false;
		}

		if (month != other.month) {
			return false;
		}
		if (year != other.year) {
			return false;
		}

		return true;
	}


	public Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;				
	}
	

	
}
