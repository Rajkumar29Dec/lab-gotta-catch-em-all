package testing;

import org.junit.Test;

import model.Pikachu;

import static org.junit.Assert.*;

public class TestPikachu {
	
	@Test
	public void testCharacteristicsMethod() {
		Pikachu p = new Pikachu("AAA",4);
		String temp = "Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.";
		assertEquals(temp,p.characteristics());		
		try {
			Pikachu p1 = new Pikachu(null,0);
			temp = null;
			p1.characteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Pikachu p = new Pikachu("AAA",4);
		String temp = "ELECTRIC";
		assertEquals(temp,p.type());		
		try {
			Pikachu p1 = new Pikachu(null,0);
			temp = null;
			p1.type();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Pikachu p = new Pikachu("AAA",4);
		String temp = "  RAICHU";
		assertEquals(temp,p.evolution());		
		try {
			Pikachu p1 = new Pikachu(null,0);
			temp = null;
			p1.evolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Pikachu p = new Pikachu("AAA",4);
		String temp = "112";
		assertEquals(temp,p.baseExp());		
		try {
			Pikachu p1 = new Pikachu(null,0);
			temp = null;
			p1.baseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
