package ar.edu.unlam.basica2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisorTest {
	
	@Test
	public void testQueelVolumenArranqueEn10(){
		//Instanciamos la clase televisor
		Televisor televisorSony = new Televisor();
		assertEquals(10, televisorSony.getVolumen());
	}
	
	
	@Test
	public void incrementarElVolumenUnaVez(){
		//Instanciamos la clase televisor
		Televisor televisorSony = new Televisor(0,0);
		televisorSony.cambiarVolumen("subir");
		assertEquals(1, televisorSony.getVolumen());
	}
	
	@Test
	public void asiganarElVolumenDirectamente(){
		Televisor televisorSony = new Televisor();
		televisorSony.setVolumen(-10);
		assertNotEquals(-10, televisorSony.getVolumen());
	}

}
