package application;

import java.util.Scanner;

import entities.Circulo;

public class RaioCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo circulo = new Circulo();
		
		System.out.print("Digite um numero: ");
		circulo.numero = sc.nextDouble();
		
		System.out.println(circulo);
		
		sc.close();
	}

}
