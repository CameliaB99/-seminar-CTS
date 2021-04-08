package ro.ase.cts.facade;

public class Program {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Maricica", "2990506395969");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCredite(persoana)) {
					System.out.println("I se ofera creditul lui "+ persoana.getNume());
				}
			}
		}
	Persoana persoana2= new Persoana("Ionela","2990506395969");
	if(Facade.esteAptaPersoana(persoana2)) {
		
	}
	}
	

}
