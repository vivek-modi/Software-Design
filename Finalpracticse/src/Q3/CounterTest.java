package Q3;

public class CounterTest {

	static int value1 = 4;

	static void stepDown(int v) throws TooLow {
		if (v > value1)
			throw new TooLow("Value Too low");
		else {
			value1 -= v;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			try {
				stepDown(2);
			} catch (TooLow e) {
				System.out.print(e.getMessage());
			}

		}
	}

	public static class TooLow extends Exception {

		public TooLow(String s) {
			super(s);
		}
	}
}
