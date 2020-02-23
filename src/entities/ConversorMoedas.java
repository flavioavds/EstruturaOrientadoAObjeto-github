package entities;

public class ConversorMoedas {
	public int n;
	public double dolar = 4.3898;
	public double real = 0.2278;
	public double compra;

	public double conversorDolar() {
		return dolar * compra;
	}

	public double conversorReal() {
		return real * compra;
	}

	public double iof() {
		return (dolar * compra) * 0.06;
	}

	public double imposto() {
		return conversorDolar() + iof();
	}

	public String toString() {
		if (n == 1) {
			return String.format("O valor do Dolar hoje é: $ %.2f%n", dolar)
					+ String.format("O valor convertido da compra é: R$ %.2f Reais %n", conversorDolar())
					+ String.format("O valor do imposto é: R$ %.2f Reais %n", iof())
					+ String.format("Total da compra: R$ %.2f Reais %n", imposto());
		} else if (n == 2) {
			return String.format("O valor do Dolar hoje é: R$ %.2f Dolar %n", real)
					+ String.format("O valor total da compra é: $ %.2f Dolar %n", conversorReal());
		} else {
			return " O valor é invalido";
		}
	}
}
