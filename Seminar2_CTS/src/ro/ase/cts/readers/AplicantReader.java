package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	//este metoda
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException; 
}
