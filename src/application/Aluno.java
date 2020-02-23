package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NotasAluno;

public class Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		NotasAluno notas = new NotasAluno();
		
		System.out.println("Digite o Nome do Aluno: ");
		notas.nome = sc.nextLine();
		System.out.println("Digite a Primeira Nota: ");
		notas.Nota1 = sc.nextInt();
		System.out.println("Digite a Primeira Nota: ");
		notas.Nota2 = sc.nextInt();
		System.out.println("Digite a Primeira Nota: ");
		notas.Nota3 = sc.nextInt();
		
		System.out.println(notas);
		
		sc.close();
	}

}
