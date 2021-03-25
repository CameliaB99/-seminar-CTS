package ro.ase.cts.FactoryMethod;

public class Anestezist extends PersonalSpital{

	public Anestezist(String nume, int salariu) {
		super(nume, salariu);
		
	}

	@Override
	public String toString() {
		return "Anestezist [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + "]";
	}
	
}
