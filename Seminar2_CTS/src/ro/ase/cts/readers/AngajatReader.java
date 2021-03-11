package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatReader extends AplicantReader {
	public AngajatReader(String nume) {
		super(nume);
	}
	public  List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.numeFisier));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat angajat= new Angajat();
			super.readAplicant(input2, angajat);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			angajat.setOcupatie(ocupatie);
			angajat.setSalariu(salariu);
			angajati.add(angajat);
		}
		input2.close();
		return angajati;
	}
}
