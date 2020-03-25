package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Charizard;

public class TestCharizard {
	@Test
	public void testCharacteristicsMethod() {
		Charizard p = new Charizard("AAA",4);
		String temp = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		assertEquals(temp,p.characteristics());		
		try {
			Charizard p1 = new Charizard(null,0);
			temp = null;
			p1.characteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Charizard p = new Charizard("AAA",4);
		String temp = "FIRE";
		assertEquals(temp,p.type());		
		try {
			Charizard p1 = new Charizard(null,0);
			temp = null;
			p1.type();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Charizard p = new Charizard("AAA",4);
		String temp = "CHARMELEON";
		assertEquals(temp,p.evolution());		
		try {
			Charizard p1 = new Charizard(null,0);
			temp = null;
			p1.evolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Charizard p = new Charizard("AAA",4);
		String temp = "240";
		assertEquals(temp,p.baseExp());		
		try {
			Charizard p1 = new Charizard(null,0);
			temp = null;
			p1.baseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
