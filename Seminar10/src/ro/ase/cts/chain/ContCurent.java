package ro.ase.cts.chain;

public class ContCurent extends Handler {

	public ContCurent(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >=suma) {
			System.out.println("S-a realizat plata in suma de "+suma+ "din contul curent");
			 float soldActual = super.getSold();
			 soldActual = super.getSold() -suma;
			 super.setSold(soldActual);
			 //super.setSold(super.getSold() -suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}
	
}
