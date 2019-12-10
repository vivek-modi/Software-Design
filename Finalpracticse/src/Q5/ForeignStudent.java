package Q5;

public class ForeignStudent extends Student {

	String Country_of_orign;

	public ForeignStudent(String name, int age, String coo) {
		super(name, age);
		Country_of_orign = coo;
	}

	public int readAge() {
		return age;
	}

	public boolean matureStudent() {
		return (age > 22) ? true : false;
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Country " + Country_of_orign);
	}

}
