package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ClientAbonat client1 = new ClientAbonat("Gigel");
		ClientAbonat client2 = new ClientAbonat("Maricel");
		ClientAbonat client3 = new ClientAbonat("Maria");
		ClientAbonat client4 = new ClientAbonat("Ionel");
		ManagerSala manager = new ManagerSala();
		manager.adaugaAbonat(client1);
		manager.adaugaAbonat(client2);
		manager.adaugaAbonat(client3);
		manager.adaugaAbonat(client4);
		
		manager.anuntaMeci("Fotbal");
		manager.stergeAbonat(client1);
		manager.anuntaMeci("Handball");

	}

}
