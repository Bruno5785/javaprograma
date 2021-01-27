package aula08;

public class Triangulo {
	double a;
	double b;
	double c;
	
	public double getPerimetro() {
		double perimetro = a + b + c;
		return perimetro;
		
	}
	
	public double getArea() {
		double p = (a+b+c) / 2;
		double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return area;
	}

}
