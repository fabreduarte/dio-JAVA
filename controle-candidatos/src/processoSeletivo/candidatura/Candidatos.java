package processoSeletivo.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class Candidatos {

	static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "AUGUSTO", "PAULO", "MONICA", "FABRICIO", "MIRELA",
				"DANIELA", "JORGE" };

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salarioPretendido);

			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				System.out.println("------------------------------------------------");
				candidatosSelecionados++;

				Ligacao.entrandoEmContato(candidato);
			}
			candidatoAtual++;
		}
		ImprimirSelecionados.ImprimirSelecionados();
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2000);
	}
}
