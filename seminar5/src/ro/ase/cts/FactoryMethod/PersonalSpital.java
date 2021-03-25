package ro.ase.cts.FactoryMethod;

public abstract class PersonalSpital {
	public String nume;
	public int salariu;
	public PersonalSpital(String nume, int salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}
	public String getNume() {
		return nume;
	}
	
	public int getSalariu() {
		return salariu;
	}
	
	
}
