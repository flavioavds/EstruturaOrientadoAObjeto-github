package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double totalValorEmEstoque() {
		return preco * quantidade;
	}

	public void adicione(int quantidade) {
		this.quantidade += quantidade;
	}

	public void remove(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "o nosso produto " + nome + " , com preço de R$ " + String.format("%.2f", preco)
				+ " reais tem em estoque " + quantidade + " quantidade, Totalizando o valor de: R$ "
				+ String.format("%.2f", totalValorEmEstoque()) + " reais";

	}

}
