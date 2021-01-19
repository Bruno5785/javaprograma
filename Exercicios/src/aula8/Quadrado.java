package aula8;

public class Quadrado {
	
	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
		
	}
	public double getPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	public double getArea() {
		return (lado*lado);
		
	}

}
