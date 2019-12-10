package Q3;

import java.util.*;

public class recursiv {

	public static int countDigits(int value) {

		if (value == 0)
			return 0;
		else {
			
			// Count Digit
			return 1 + countDigits(value / 10);

			/*
			 * Count of Odd Digit
			 * 
			 * int last = value % 10; if (last % 2 == 1) { return 1 + countDigits(value /
			 * 10); } else { return 0 + countDigits(value / 10); }
			 */
			
			/*
			 * Add of Odd Digit
			 * 
			 * int last = value % 10; if (last % 2 == 1) { return last + countDigits(value /
			 * 10); } else { return 0 + countDigits(value / 10); }
			 */

			/*
			 * Sum all all Digit return (value % 10 + countDigits(value / 10));
			 */
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Res= " + countDigits(number));
	}

}
