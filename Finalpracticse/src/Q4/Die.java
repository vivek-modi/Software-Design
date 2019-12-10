package Q4;

public class Die {

	private int value;

	public Die(int die) {
		value = die;
	}

	public void roll() {
		double res = Math.random();
		value = 1 + (int) (res * 1000) % 6;
	}

	public int getValue() {
		return value;
	}

}
