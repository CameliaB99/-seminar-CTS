package builder;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacaritoare;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzica;
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic,
			boolean areBauturaRacaritoare, boolean areMuzicaAmbientalaPersonalizata,String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaRacaritoare = areBauturaRacaritoare;
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		this.genMuzica=genMuzica;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public void setAreBauturaRacaritoare(boolean areBauturaRacaritoare) {
		this.areBauturaRacaritoare = areBauturaRacaritoare;
	}
	public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	}
	
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areScaunErgonomic=" + areScaunErgonomic + ", areBauturaRacaritoare=" + areBauturaRacaritoare
				+ ", areMuzicaAmbientalaPersonalizata=" + areMuzicaAmbientalaPersonalizata + ", genMuzica=" + genMuzica
				+ "]";
	}
	

}
