package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStudentStub {

	@Test
	public void testGetPromovabilitateGrupa() {
		Grupa grupa1 = new Grupa(1077);
		IStudent studentStub = new StudentStub();
		grupa1.adaugaStudent(studentStub);
		IStudent studentStub2 = new StudentStub();
		grupa1.adaugaStudent(studentStub2);
		assertEquals(1f,grupa1.getPromovabilitate(),0.01);
	}

}
