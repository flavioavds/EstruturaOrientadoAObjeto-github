package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AreaRetangulo;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AreaRetangulo area = new AreaRetangulo();
		
		System.out.print("Digite a Altura: ");
		area.altura = sc.nextInt();
		System.out.print("Digtie a Largura: ");
		area.largura = sc.nextInt();
		
		System.out.println();
		System.out.println(area);
		
		sc.close();
	}

}
