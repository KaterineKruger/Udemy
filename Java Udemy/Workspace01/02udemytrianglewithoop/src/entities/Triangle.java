package entities;

public class Triangle {
	
	// Atributos
	public double a;
	public double b;
	public double c;
	
	// Função
	public double area() {
		double p = (a + b + c) / 2.00;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
}