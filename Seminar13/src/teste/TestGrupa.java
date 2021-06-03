package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;


public class TestGrupa {
	private Grupa grupa;
	@Before
	public void setUp() {
		grupa = new Grupa(1077);
		for(int i=0;i<10;i++) {
			Student student1 = new Student("Marcel");
			student1.adaugaNota(5);
			student1.adaugaNota(10);
			student1.adaugaNota(4);
			grupa.adaugaStudent(student1);
		}
	}
	@Category({TesteGetPromovabilitate.class})
	@Test
	public void testGetPromovabilitateRight() {
		Student studentMarcel = new Student("Marcel");
		studentMarcel.adaugaNota(10);
		studentMarcel.adaugaNota(10);
		Student studentMaria = new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMaria.adaugaNota(10);
		grupa.adaugaStudent(studentMarcel);
		grupa.adaugaStudent(studentMaria);
		assertEquals(0.16,grupa.getPromovabilitate(),0.05);
	}
	
	@Category({TesteGetPromovabilitate.class})
	@Test
	public void testGetPromovabilitateLoweerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Category({TesteGetPromovabilitate.class})
	@Test
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupaNoua = new Grupa(1076);
		Student student1= new Student("Ion");
		student1.adaugaNota(10);
		student1.adaugaNota(10);
		
		Student student2 =  new Student("Ana");
		student2.adaugaNota(10);
		student2.adaugaNota(10);
		grupaNoua.adaugaStudent(student1);
		grupaNoua.adaugaStudent(student2);
		assertEquals(1,grupaNoua.getPromovabilitate(), 0.01);
	}
	@Category({TesteGetPromovabilitate.class})
	@Test(expected = IllegalArgumentException.class)	
	public void testGetPromovabilitateError() {
		Grupa grupaNoua =  new Grupa(1080);
		grupaNoua.getPromovabilitate();
	}
	
	@Category({TesteGetPromovabilitate.class})
	@Test(timeout=500)
	public void testGetPromovabilitatePerformance()
	{
		grupa.getPromovabilitate();	
	}
	
	//Principiul right-BICEP
	@Category({TesteNormale.class})
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	//Boundary
	@Category({TesteNormale.class})
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	@Category({TesteNormale.class})
	@Test 
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	@Category({TesteNormale.class})
	//error conditions
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError() {
		int nrGrupa=100;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	@Category({TesteUrgente.class})
	@Test(timeout =550)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	//principiul CORRECT 
	@Category({TesteNormale.class})
	@Test
	public void testContructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
