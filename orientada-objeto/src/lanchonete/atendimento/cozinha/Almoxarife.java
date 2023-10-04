package lanchonete.atendimento.cozinha;

public class Almoxarife {

	private void controlarEntrada() {
		System.out.println("Controlando entrada dos itens");
	}

	private void controlarSaida() {
		System.out.println("controlando saida dos itens");
	}

	void entregarIngredientes() {
		System.out.println("Entregando Ingredientes");
		controlarSaida();
	}

	void trocarGas() {
		System.out.println("Almoxarife trocando o gas");
	}

}
