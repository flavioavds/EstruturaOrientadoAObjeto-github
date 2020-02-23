package entities;

public class Circulo {
	public double numero;
	public double pi = 3.14159;
	
	public double circunferencia() {
		return (numero * pi)*2;
	}
	public double volume() {
		return ((4 * pi) * Math.pow(numero, 3))/3;
	}
	public String toString() {
		return String.format("A Circunferencia �: %.2f%n", circunferencia())
			  +String.format("Pi: %.2f%n", pi)
			  +String.format("O Volume �: %.2f%n" , volume());
	}
}
