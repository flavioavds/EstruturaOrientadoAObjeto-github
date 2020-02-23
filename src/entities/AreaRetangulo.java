package entities;

public class AreaRetangulo {
	public int altura;
	public int largura;

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return 2 * (altura + largura);
	}

	public double diagonal() {
		return Math.sqrt((altura * altura) + (largura * largura));
	}

	public String toString() {
		return "A Area de um Retangulo é: " 
		+ String.format("%.2f", area())
		+ String.format("%n", 0)
		+ "O Perimetro de um Retangulo é: " 
		+ String.format("%.2f", perimetro())
		+ String.format("%n", 0)
		+ "A Diagonal de um Retangulo é: " 
		+ String.format("%.2f", diagonal());
	}
}
