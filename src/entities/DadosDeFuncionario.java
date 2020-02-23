package entities;

public class DadosDeFuncionario {
	public String nome;
	public double salario;
	public double imposto;
	public int porcentagem;

	public double salarioLiquido() {
		return (salario - imposto);
	}

	public void aumentoSalario(double porcentagem) {
		this.salario += salario * (porcentagem / 100);
	}

	public String toString() {
		return "Funcionario " + nome + " tem o salario liquido de: R$ " + String.format("%.2f", salarioLiquido());
	}

}
