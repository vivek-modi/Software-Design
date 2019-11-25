package EQ3;

class LLinkedListA {
	private LLNodeA head;

	public LLinkedListA() {
		head = null;
	}

	public void insert(String s1, int a) {
		LLNodeA temp = new LLNodeA(s1, a);
		temp.next = head;
		head = temp;
	}

	public String youngest() {
		int res = 900;
		String name = "BLANK";
		LLNodeA temp = head;
		while (temp != null) {
			if (temp.readage() < res) {
				name = temp.readname();
				res = temp.readage();
			}
			temp = temp.next;
		}
		return name;
	}

	public boolean search(String s1) {
		boolean res = false;
		LLNodeA temp = head;
		while (temp != null) {
			if (temp.readname().equals(s1)) {
				res = true;
			}
			temp = temp.next;
		}
		return res;
	}

	public int oldest() {
		int res = 0;
		LLNodeA temp = head;
		while (temp != null) {
			if (temp.readage() > res) {
				res = temp.readage();
			}
			temp = temp.next;
		}
		return res;
	}

	public int sumAges(String s1) {
		int sum = 0;
		LLNodeA temp = head;
		while (temp != null) {
			if (temp.readname().equals(s1)) {
				sum += temp.readage();
			}
			temp = temp.next;
		}
		return sum;
	}

	public boolean allAdults() {
		boolean res = true;

		LLNodeA temp = head;
		while (temp != null) {
			if (temp.readage() >= 18) {
				res = true;
			} else {
				res = false;
				break;
			}
			temp = temp.next;
		}

		return res;
	}

	public void insert_last(String s1, int a) {
	}

	public String delete_first() {
		if (head == null)
			return null;
		String res = head.readname();
		head = head.next;
		return res;
	}

	public String printlist() {
		LLNodeA temp = head;
		String list = "HEAD->";
		while (temp != null) {
			list += temp.print();
			temp = temp.next;
		}

		list += "NULL";
		return list;

	}

}
