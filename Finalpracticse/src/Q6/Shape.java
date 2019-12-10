package Q6;

abstract class Shape {
	protected int width;

	public Shape(int w) {
		width = w;
	}

	public abstract int calculateArea();
}
