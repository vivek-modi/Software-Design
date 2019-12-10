package Q4;

public class PairDice {

	private Die d1;
	private Die d2;

	public PairDice(int v1, int v2) {
		d1 = new Die(v1);
		d2 = new Die(v2);
	}

	public void rollDice() {
		d1.roll();
		d2.roll();
	}

	public int sumDiceValues() {
		return d1.getValue() + d2.getValue();
	}

	public boolean valuesEqual() {
		return (d1.getValue() == d2.getValue()) ? true : false;
	}

}
