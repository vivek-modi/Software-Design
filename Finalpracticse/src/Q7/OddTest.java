package Q7;

import java.util.*;

public class OddTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		System.out.println("Res " + addodd(a));
	}

	private static int addodd(int value) {
		if (value == 0)
			return 0;
		else {
			int last = value % 10;
			int rest = value / 10;
			
			System.out.println("Last " + last + " Value " + rest);
			if (last % 2 == 1)
				return last + addodd(rest);
			else
				return 0 + addodd(rest);

		}

	}
}
