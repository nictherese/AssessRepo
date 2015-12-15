public class Student {
	private String idNum;
	private String lastName;
	private String firstName;
	private char initial;
	private String course;
	private int year;
	private double balance;
	private double prelims;
	private double midterms;
	private double finals;
	
	public Student() {
		idNum = "";
		lastName = "";
		firstName = "";
		initial = '\0';
		course = "";
		year = 0;
		balance = 0.0;
		prelims = 0.0;
		midterms = 0.0;
		finals = 0.0;
	}
	
	public Student(String idNum, String lastName, String firstName, char initial, String course, int year, double balance, double prelims, double midterms, double finals) {
		this.idNum = idNum;
		this.lastName = lastName;
		this.firstName = firstName;
		this.initial = initial;
		this.course = course;
		this.year = year;
		this.balance = balance;
		this.prelims = prelims;
		this.midterms = midterms;
		this.finals = finals;
	}
	
	public String getIDnum () {
		return idNum;
	}
	
	public String toString() {
		return(lastName + ", " + firstName + " " + initial + 
				"\nID No. " + idNum + "   " + course + " " + year + 
				"\n\nBalance:                                      PHP" + balance +
				"\nAmount due for PRELIMS:      " + "PHP " + prelims +
				"\nAmount due for MIDTERMS:   " + "PHP " + midterms +
				"\nAmount due for FINALS:          " + "PHP " + finals);
	}
}