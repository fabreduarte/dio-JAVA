package lanchonete.areaCliente;

public class Cliente {

	public void escolherLanche() {
		System.out.println("Escolhendo Lanche");
	}

	public void fazerPedido() {
		System.out.println("Fazendo pedido");
	}

	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("Pagando conta");
	}

	private void consultarSaldoAplicativo() {
		System.out.println("consultand saldo no app");
	}

}
