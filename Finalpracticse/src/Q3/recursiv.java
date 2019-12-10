package Q3;

import java.util.*;

public class recursiv {

	public static int countDigits(int value) {
		if (value == 0)
			return 0;
		else {
			return 1 + countDigits(value / 10);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Res= " + countDigits(number));
	}

}
