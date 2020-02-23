package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosDeFuncionario;

public class AumentoDeSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosDeFuncionario dados = new DadosDeFuncionario();

		System.out.print("Nome do Funcionario: ");
		dados.nome = sc.nextLine();
		System.out.print("Salario: ");
		dados.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		dados.imposto = sc.nextInt();

		System.out.println();
		System.out.println(dados);
		System.out.println();
		System.out.print("Qual a porcentagem do aumento: ");
		double porcentagem = sc.nextInt();
		dados.aumentoSalario(porcentagem);
		System.out.println();
		System.out.println("Salario Atualizado: " + dados);

		sc.close();
	}

}
