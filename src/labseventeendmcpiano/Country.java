package labseventeendmcpiano;

public class Country {
	
	String name;
	int population;
	
	public Country() {
	}
	
	public Country(String name, int population) {
		this.name = name;
		this.population = population;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return ("The country " + getName() + " has a population of " + getPopulation() + " people. Interesting, don't you think? ");
		
	}
	
}

	
