package ro.ase.cts.clase;

public class Banca {
 private int nrAngajati;
 private String locatie;
 private float salariuBaza;
 
 private static Banca banca = null;
 
 	private Banca(int nrAnagajati, String locatie, float salariuBaza) {
 		this.nrAngajati=nrAnagajati;
 		this.locatie=locatie;
 		this.salariuBaza=salariuBaza;
 	}
 	public static synchronized Banca getInstance(int nrAngajati, String locatie, float salariuBaza){
		if(banca == null) {
			banca = new Banca(nrAngajati, locatie, salariuBaza);
		}
		return banca;
	}
	@Override
	public String toString() {
		return "Banca [nrAngajati=" + nrAngajati + ", locatie=" + locatie + ", salariu=" + salariuBaza + "]";
	}
	
	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}
	
	public void setSalariu(float salariuBaza) {
		this.salariuBaza = salariuBaza;
	}
 	
}
