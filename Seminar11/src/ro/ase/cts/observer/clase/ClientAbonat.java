package ro.ase.cts.observer.clase;

public class ClientAbonat implements IObserver {
	//observer concret
	private String nume;
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println("Clientul "+nume+ " a primit mesajul: "+ mesaj);
		
	}
	
}
