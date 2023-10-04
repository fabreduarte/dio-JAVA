package edu.daniel.aula;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("8123123");
		// jeep.ligar();

		Moto ninja = new Moto();
		ninja.setChassi("12312312");
		// ninja.ligar();

		Veiculo coringa = ninja;
		coringa.ligar();

	}

}
