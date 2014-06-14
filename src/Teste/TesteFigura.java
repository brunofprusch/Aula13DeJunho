package Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import figura.Triangulo;

public class TesteFigura {

	
	
	
	@Test
	public void tipoTriangulo() {
		Triangulo t = new Triangulo(2D, 2D, 6D);
		
		assertEquals(Triangulo.Tipo.ISOSCELES, t.classificarTriangulo());
	}
}
