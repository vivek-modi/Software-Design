package EBQ1;

public class Village {

	private String name, county;
	private int population;

	public Village(String name, String county, int population) {
		super();
		this.name = name;
		this.county = county;
		this.population = population;
	}

	public boolean resetPopulation(int newPop) {

		if (newPop >= 0) {
			population = newPop;
			return true;
		} else
			return false;
	}

	public String readCounty() {
		return county;
	}

	public int readPopulation() {
		return population;
	}

	public void changeCounty(String newName) {
		county = newName;
	}

}
