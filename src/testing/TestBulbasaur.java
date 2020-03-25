package testing;
// /*
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestBulbasaur {
	@Test
	public void testCharacteristicsMethod() {
	//	Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.";
		assertEquals(temp,p.characteristics());		
		try {
	//		Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.characteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "POISON";
		assertEquals(temp,p.type());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.type();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "IVYSAUR";
		assertEquals(temp,p.evolution());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.evolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "64";
		assertEquals(temp,p.baseExp());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.baseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
// */