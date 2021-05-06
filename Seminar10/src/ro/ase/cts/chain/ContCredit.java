package ro.ase.cts.chain;

public class ContCredit extends Handler {

	public ContCredit(float sold) {
		super(sold);
		
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >=suma) {
			System.out.println("S-a realizat plata in suma de "+suma+ "din contul de credit");
			super.setSold(super.getSold() -suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
