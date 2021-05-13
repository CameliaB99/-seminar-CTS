package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	 private String nume;
	 
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spctatorul " +nume+ " s-a asazat la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spctatorul " +nume+ " va  prezenta biletul");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spctatorul " +nume+ " va realiza controlul corporal");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println("Spctatorul " +nume+ " intra pe stadion");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spctatorul " +nume+ " ocupa loc");
		
	}
	
}
