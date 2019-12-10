package Q4;

public class PairDiceTest {

	public static void main(String args[]) {
		PairDice pp = new PairDice(3, 2);
		pp.rollDice();
		System.out.println("Sum=" + pp.sumDiceValues());
		System.out.println("Values Equal =" + pp.valuesEqual());
	}
}
