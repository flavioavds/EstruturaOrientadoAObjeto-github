package application;

import java.util.Scanner;

import entities.ConversorMoedas;

public class Moeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConversorMoedas moedas = new ConversorMoedas();
		
		System.out.println("Qual moeda deseja comprar: ");
		System.out.println("1 = Dolar ");
		System.out.println("2 = Real ");
		moedas.n = sc.nextInt();
		System.out.println("Qual o valor que deseja comprar: ");
		moedas.compra = sc.nextDouble();
		
		System.out.println();
		System.out.println(moedas);
		
		sc.close();

	}

}
