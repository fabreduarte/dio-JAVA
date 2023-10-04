package edu.daniel.escola;

public class Escola {

	public static void main(String[] args) {

		Aluno felipe = new Aluno();
		felipe.setNome("João Maria");
		felipe.setIdade(88);
		felipe.setSexo("Masculino");

		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos" + " e é do sexo "
				+ felipe.getSexo());
	}
}
