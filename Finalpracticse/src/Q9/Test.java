package Q9;

public class Test {

	public static void main(String[] args) {
		Money m = new Money(2, 55);
		System.out.println("Original Amount: " + m.toString());
		m.reset(22, 25);
		System.out.println("New Amount: " + m.toString());
		System.out.println("Total Amount in Cents: " + m.convert_to_cent());

	}

}
