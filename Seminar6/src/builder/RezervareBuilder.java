package builder;

public class RezervareBuilder implements AbstractBuilder {
	
	private Rezervare rezervare;
	public RezervareBuilder() {
		rezervare= new Rezervare(0,false, false, false, false,"rock");
	}
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(scaunErgonomic);
        return this;
    }
    public RezervareBuilder setAreBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.rezervare.setAreBauturaRacaritoare(bauturaRacoritoare);
        return this;
    }
    public RezervareBuilder setAreMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setAreMuzicaAmbientalaPersonalizata(muzicaAmbientala);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
    public RezervareBuilder setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }
	
}
