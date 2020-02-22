package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class EstoqueVendas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("Entre com o Produto ");
		System.out.print("Nome do Produto: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em Estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println(produto);

		System.out.println();
		System.out.println("Entre com a Quantidade a ser Acrescido: ");
		int quantidade = sc.nextInt();
		produto.adicione(quantidade);
		System.out.println("Foi Adicionado d" + produto);

		System.out.println();
		System.out.println("Entre com a Quantidade a ser Removido: ");
		quantidade = sc.nextInt();
		produto.remove(quantidade);
		System.out.println("Foi Removido d" + produto);

		sc.close();
	}

}
