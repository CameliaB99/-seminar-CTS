package ro.ase.cts.FactoryMethod;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Brancardier [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + "]";
	}

}
