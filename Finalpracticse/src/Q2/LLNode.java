package Q2;

public class LLNode {

	public static class Node {
		public char letter;
		public Node next;

		public Node(char l) {
			letter = l;
		}
	}

	public static class LLNODE {
		private Node HEAD;

		public LLNODE() {
			HEAD = null;
		}

		public void insert_front(char l) {
			Node newNode = new Node(l);
			newNode.next = HEAD;
			HEAD = newNode;
		}

		public int countOccurs(char c) {
			Node temp = HEAD;
			int cnt = 0;
			while (temp != null) {
				if (temp.letter == c) {
					cnt++;
				}
				temp = temp.next;
			}
			return cnt;
		}

		public char readFirst() {
			return HEAD.letter;
		}

		public char readLast() {
			char c = 0;
			Node temp = HEAD;

			if (HEAD == null)
				return c;
			if (HEAD.next == null)
				return HEAD.letter;
			while (temp != null) {
				c = temp.letter;
				temp = temp.next;
			}
			return c;
		}

		public boolean search(char c) {
			Node temp = HEAD;
			while (temp != null) {
				if (temp.letter == c) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}
	}

	public static void main(String args[]) {
		LLNODE l = new LLNODE();
		l.insert_front('r');
		l.insert_front('a');
		l.insert_front('b');
		l.insert_front('c');
		System.out.println("Last Nodes in List:" + l.readFirst());
		l.insert_front('b');
		System.out.println("Item found in list:" + l.countOccurs('r'));

	}
}
