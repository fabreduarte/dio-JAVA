package edu.daniel.aula;

public class Carro extends Veiculo {

	@Override
	public void ligar() {
		confereCambio();
		confereCombustível();
		System.out.println("Carro ligado");
	}

	private void confereCombustível() {
		System.out.println("Conferindo combustível");
	}

	private void confereCambio() {
		System.out.println("Conferindo camnbio em P!");
	}
}
