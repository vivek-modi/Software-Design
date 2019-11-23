package Q2;

public class MyCounter extends Counter {

	int upperlimit;

	public MyCounter(int v, int ul) {
		super(v);
		upperlimit = ul;
	}

	public boolean increment() {
		if (upperlimit == value) {
			return false;
		} else {
			value++;
			return true;
		}
	}

	public int readLimit() {
		return upperlimit;
	}

}
