package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{
	private String numeVIP;
	
	public SpectatorVIP(String nume) {
		super();
		this.numeVIP = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVIP+ "  se prezinta direct la usa");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVIP+ " prezinta biletul VIP");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(numeVIP+ " realizeaza control VIP");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(numeVIP+ " intra in tribuna VIP");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVIP+ "ocupa loc in loja");
		
	}
	
}
