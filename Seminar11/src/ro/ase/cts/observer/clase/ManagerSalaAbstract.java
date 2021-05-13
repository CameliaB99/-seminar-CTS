package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;


public abstract class ManagerSalaAbstract {
	//clasa abstracta
	public List<IObserver> clientiAbonati;
	
	public ManagerSalaAbstract() {
		super();
		this.clientiAbonati = new ArrayList<IObserver>();
	}

	public void adaugaAbonat(IObserver abonat) {
		clientiAbonati.add(abonat);
	}
	public void stergeAbonat(IObserver abonat) {
		clientiAbonati.remove(abonat);
	}
	public void trimiteNotificare(String mesaj) {
		for(IObserver client : clientiAbonati) {
			client.primesteMesaj(mesaj);
		}
	}
}
