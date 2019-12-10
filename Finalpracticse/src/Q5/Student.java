package Q5;

public class Student {
	
	private String name;
	protected int age;

	public Student(String n, int a) {
		name = n;
		age = a;
	}

	public void printDetails() {
		System.out.println("\nStudent  Details:");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}

}
