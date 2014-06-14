package figura;

public class Triangulo extends Figura {

	private Double lado1, lado2, lado3;
	public enum Tipo {EQUILATERO, ESCALENO, ISOSCELES}
	
	
	public Triangulo(Double lado1, Double lado2, Double lado3){
		this.setLado1(lado1);
		this.setLado2(lado2);
		this.setLado3(lado3);
	}
	
	@Override
	public double calcularArea() {
		
		double semiperimetro = calcularPerimetro() / 2;
		double delta = semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3);
		
		
		return Math.sqrt(delta);
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

	public Tipo classificarTriangulo(){
		
		if((lado1.compareTo(lado2) == 0) && (lado1.compareTo(lado3) == 0)){
			return Tipo.EQUILATERO;
		
		}else if((lado1.compareTo(lado2) == 0) || (lado1.compareTo(lado3) == 0) || (lado2.compareTo(lado3) == 0)){
			return Tipo.ISOSCELES;
		
		}else{
			return Tipo.ESCALENO;
		}
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	public Double getLado3() {
		return lado3;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}
}
