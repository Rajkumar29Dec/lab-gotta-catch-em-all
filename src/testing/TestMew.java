package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Mew;

public class TestMew {
	@Test
	public void testCharacteristicsMethod() {
		Mew p = new Mew("AAA",4);
		String temp = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		assertEquals(temp,p.characteristics());		
		try {
			Mew p1 = new Mew(null,0);
			temp = null;
			p1.characteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Mew p = new Mew("AAA",4);
		String temp = "PSYCHIC";
		assertEquals(temp,p.type());		
		try {
			Mew p1 = new Mew(null,0);
			temp = null;
			p1.type();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Mew p = new Mew("AAA",4);
		String temp = "   NONE  ";
		assertEquals(temp,p.evolution());		
		try {
			Mew p1 = new Mew(null,0);
			temp = null;
			p1.evolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Mew p = new Mew("AAA",4);
		String temp = "64";
		assertEquals(temp,p.baseExp());		
		try {
			Mew p1 = new Mew(null,0);
			temp = null;
			p1.baseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
