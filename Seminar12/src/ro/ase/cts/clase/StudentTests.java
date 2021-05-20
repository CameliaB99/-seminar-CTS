package ro.ase.cts.clase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTests {
	Student student = null;
	@Before
	public void setUp() {
	 student = new Student();
	}
	@Test
	public void testApelCorectConstructorCuParametru() {
		String nume ="Ion";
		Student student = new Student(nume);
//		if(nume != student.getNume()) {
//			fail("Numele nu este corect!");
//		} 
		//similiar cu functia de mai jos
		assertEquals(nume, student.getNume());
	}
	@Test
	public void testApelConstructorFaraParametru() {
		String nume = "Student";
		Student student =  new Student();
		assertEquals(nume, student.getNume());
	}
	@Test
	public void testInitializareListaConstructorFaraParametru() {
		Student student =  new Student();
		assertNotNull(student.getNote());
	}
	@Test
	public void adaugareNotaInLista() {
		//Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	@Test
	public void testMarimeListaCorecta() {
		//Student student = new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	@Test
	public void testSetareNume() {
		//Student student =  new Student();
		String nume="Popescu";
		student.setNume("Popescu");
		assertEquals(nume, student.getNume());
		
	}
	@Test
	public void testareCalculMedie() {
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(7.5, student.calculeazaMedie(), 0.01);
	}
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	@Test
	public void testCalculeazaMediePentruONota() {
		int nota =9;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
		
	}
	@Test
	public void testVerificareRestante() {
		int nota = 4;
		int nota2 =10;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertTrue(student.areRestante());
	}
	@Test
	public void testVerificareNuAreRestante() {
		int nota = 5;
		int nota2 =10;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertFalse(student.areRestante());
	}
	@Test
	public void testVerificareStudentFaraNote() {
		assertFalse(student.areRestante());
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptieIndex() {
		int index =-1;
		student.getNota(index);
		
	}
	@Test
	public void testGetNotaShouldThrowException() {
		Student s= new Student();
		//1
		try {
			//2
			s.getNota(-1);
			fail("Nu trebuia sa ajunga aici");
			//3
		}
		catch(IndexOutOfBoundsException err){
			//4
		}
		//5
		
	}
}

