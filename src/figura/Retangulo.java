package figura;

public class Retangulo extends Figura {
	
	protected double base, altura;
	
	@Override
	public double calcularArea() { 
		return base * altura; 
	}
	
	@Override
	public double calcularPerimetro() { 
		return 2 * ( base + altura ); 
	}
}