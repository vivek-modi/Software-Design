package Q1;

import java.io.*;

public class Country implements Serializable {

	private int population;
	private String name;

	public Country() {
	}

	public int getPopulation() {
		return population;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public void setPopulation(int n) {
		population = n;
	}
}
