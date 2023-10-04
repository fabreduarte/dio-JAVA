package edu.daniel.construtores;

public class SistemaDeCadastro {

	public static void main(String[] args) {

		Pessoa marcos = new Pessoa("123", "Daniel");

		marcos.setEndereço("Rua das Palmeiras");

		System.out.println(marcos.getNome() + "-" + marcos.getCpf());

	}
}
