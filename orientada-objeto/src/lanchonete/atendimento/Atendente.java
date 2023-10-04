package lanchonete.atendimento;

public class Atendente {

	public void servindoMesa() {
		System.out.println("Servindo mesa");
		pegarLancheCozinha();
	}

	private void pegarLancheCozinha() {
		System.out.println("Pegando lanche na cozinha");
	}

	public void receberPagamento() {
		System.out.println("Recebendo pagamento");
	}

	void trocarGas() {
		System.out.println("Atendente trocando o gas");
	}

	private void pegarPedidoBalcao() {
		System.out.println("pegando pedido no balcão");
	}
}
