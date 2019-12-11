package Q9;

public class Money {
	
	int euro,cent;
	
	public Money(int m1,int m2){
		euro = m1;
		cent = m2;
	}
	
	public String toString() {
		return "E" + euro + "." + cent;
	}
	
	public void reset(int m1,int m2) {
		euro = m1;
		cent = m2;
	}

	public String  convert_to_cent() {
		return   euro +""+ cent;
	}
	
}
