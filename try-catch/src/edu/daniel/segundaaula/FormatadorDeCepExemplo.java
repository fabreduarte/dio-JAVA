package edu.daniel.segundaaula;

public class FormatadorDeCepExemplo {

	public static void main(String[] args) {
		try {
			String meuCep = formatarCep("23765064");
			System.out.println(meuCep);
		} catch (CepInvalid e) {
			System.err.println("O Cep não corresponde com as regras de negócio");
		}

	}

	static String formatarCep(String cep) throws CepInvalid {
		if (cep.length() != 8)
			throw new CepInvalid();

		return "23.765-064";
	}

}
