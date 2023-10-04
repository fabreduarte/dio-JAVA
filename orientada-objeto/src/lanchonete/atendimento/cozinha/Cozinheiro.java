package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche natural Hamburguer no balcão");
	}

	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcão");
	}

	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	private void prepararLanche() {
		System.out.println("Preparando lanche tipo Hamburguer");
	}

	private void prepararVitamina() {
		System.out.println("Preparando Suco");
	}

	private void prepararCombo() {
		prepararVitamina();
		prepararLanche();
	}

	private void selecionarIngredientesLanche() {
		System.out.println("Selecionando o pão, salada, ovo e carne");
	}

	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando Furta, leite e suco");
	}

	private void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}

	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo Vitamina no Liquidificador");
	}

	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e o ovo para hamburguer");
	}

	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
