package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;


public class TestGrupa {
	//Principiul right-BICEP
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	//Boundary
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test 
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	//error conditions
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError() {
		int nrGrupa=100;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	@Test(timeout =550)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	//principiul CORRECT 
	@Test
	public void testContructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
