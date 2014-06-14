package figura;

public class Circulo extends Figura {
	
	protected double raio;
	public static final double PI = 3.1415;
	
	@Override
	public double calcularArea(){ 
		return PI * raio * raio; 
	}
	
	@Override
	public double calcularPerimetro(){
		return 2 * PI * raio;
	}
}