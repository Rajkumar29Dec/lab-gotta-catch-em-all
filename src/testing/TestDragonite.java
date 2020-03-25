package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Dragonite;

public class TestDragonite {
	@Test
	public void testCharacteristicsMethod() {
		Dragonite p = new Dragonite("AAA",4);
		String temp = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism.";
		assertEquals(temp,p.characteristics());		
		try {
			Dragonite p1 = new Dragonite(null,0);
			temp = null;
			p1.characteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Dragonite p = new Dragonite("AAA",4);
		String temp = "DRAGON";
		assertEquals(temp,p.type());		
		try {
			Dragonite p1 = new Dragonite(null,0);
			temp = null;
			p1.type();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Dragonite p = new Dragonite("AAA",4);
		String temp = "DRATINI";
		assertEquals(temp,p.evolution());		
		try {
			Dragonite p1 = new Dragonite(null,0);
			temp = null;
			p1.evolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Dragonite p = new Dragonite("AAA",4);
		String temp = "270";
		assertEquals(temp,p.baseExp());		
		try {
			Dragonite p1 = new Dragonite(null,0);
			temp = null;
			p1.baseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
