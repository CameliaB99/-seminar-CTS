package ro.ase.cts.builderv2;

public class RezervareBuilder implements AbstractBuilder {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacaritoare;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}
	public RezervareBuilder setAreBauturaRacaritoare(boolean areBauturaRacaritoare) {
		this.areBauturaRacaritoare = areBauturaRacaritoare;
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	@Override
	public Rezervare build() {
		return  new Rezervare(codRezervare,areMancareInclusa, areScaunErgonomic, areBauturaRacaritoare,areMuzicaAmbientalaPersonalizata,genMuzica);
		
	}
	
}
