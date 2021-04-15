package ro.ase.cts.facade;

 class GestionarMese {
	public  boolean esteMasaLibera(int cod) {
		if(cod>=9) {
			return true;
		}
		else return false;
	}
}
