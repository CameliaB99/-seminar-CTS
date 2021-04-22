package ro.ase.cts.strategy;

public class Cash implements ModalitatePlata {

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("A fost afisata plata cu cash pentru suma de " +sumaPlatita);
		
	}
	
}
