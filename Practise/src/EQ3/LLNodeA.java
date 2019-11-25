package EQ3;

class LLNodeA {
	private String name;
	private int age;
	public LLNodeA next;

	public String readname() {
		return name;
	}

	public int readage() {
		return age;
	}

	public LLNodeA(String nm, int a) {
		name = new String(nm);
		age = a;
	}

	public String print() {
		return "[" + name + ":" + age + "]-->";

	}
}
