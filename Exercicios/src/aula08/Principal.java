package aula08;

public class Principal {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		t1.a =5;
		t1.b =3;
		t1.c =4;
		System.out.println("Perimetro do t1 = " + t1.getPerimetro());
		System.out.println("Area do t1 = " + t1.getArea());
		
		Triangulo t2 = new Triangulo();
		t2.a =7;
		t2.b =10;
		t2.c =15;
		System.out.println("Perimetro do t2 = " + t2.getPerimetro());
		
		Quadrado q1 = new Quadrado(5);
		System.out.println("Perimetro do q1 = " + q1.getPerimetro());
		System.out.println("Area do q1 =" + q1.getArea());
		
		
		Retangulo r1 = new Retangulo (3,4);
		System.out.println("Perimetro do r1 = " + r1.getPerimetro());
		System.out.println("Area do r1 = " + r1.getArea());
		
	}

}
