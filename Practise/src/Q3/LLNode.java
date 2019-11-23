package Q3;

class LLNode {
	private String name;
	private int age;
	public LLNode next;

	public String readname() {
		return name;
	}

	public int readage() {
		return age;
	}

	public LLNode(String nm, int a) {
		name = nm;
		age = a;
	}

	public String print() {
		return "[" + name + ":" + age + "]-->";

	}
}
