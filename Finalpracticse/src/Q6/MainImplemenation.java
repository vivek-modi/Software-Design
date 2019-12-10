package Q6;

public class MainImplemenation {

	public static void main(String args[]) {
		Shape[] s = new Shape[2];
		s[0] = new Square(5);
		s[1] = new Rectangle(2, 4);
		for (int i = 0; i < 2; i++) {
			System.out.println("Area of shape " + (i + 1) + " :  " + s[i].calculateArea());
		}
	}
}
