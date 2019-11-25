package EQ2;

public class Counter2 extends CounterB {

	private int lowerLimit;

	public Counter2(int v, int ll) {
		super(v);
		lowerLimit = ll;
	}

	public boolean decrement() {

		if (value > 5) {
			value--;
			return true;
		} else {
			return false;
		}
	}
	
	
	public int readLimit() {
		return lowerLimit;
	}
	

}
