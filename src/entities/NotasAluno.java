package entities;

public class NotasAluno {
	public String nome;
	public int Nota1;
	public int Nota2;
	public int Nota3;

	public int somaNota() {
		return Nota1 + Nota2 + Nota3;
	}

	public int somaNota2() {
		return (int) 60 - somaNota();
	}

	public String toString() {
		if (somaNota() >= 60) {
			return "A Soma das notas s�o: " + somaNota() + "Parabens voc� passou";
		} else {
			return "A Soma das notas s�o: "
					+ somaNota()
					+ String.format("%n", 0)
					+ "O Aluno n�o passou e Precisa de: "
					+ somaNota2()
					+ " Pontos";
		}
	}

}
