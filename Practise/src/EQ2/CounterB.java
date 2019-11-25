package EQ2;

class CounterB {
	protected int value;

	public CounterB(int v) {
		value = v;
	}

	public boolean increment() {
		if (value < 20) {
			this.value++;
			return true;
		} else
			return false;
	}

	public int readValue() {
		return value;
	}

	public void print_details() {
		System.out.println("Counter Details:");
		System.out.println("Value: " + value);
	}
}