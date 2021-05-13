package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		Spectator spectator1 =  new Spectator("Maricel");
		SpectatorAbstract spectator2 = new Spectator("Gigel");
		
		spectator1.intrareSpectatorStadion();
		System.out.println("-----");
		spectator2.intrareSpectatorStadion();
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Maria");
		spectatorVIP.intrareSpectatorStadion();
	}

}
