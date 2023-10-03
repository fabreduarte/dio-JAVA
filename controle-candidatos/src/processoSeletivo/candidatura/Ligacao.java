package processoSeletivo.candidatura;

import java.util.Random;

public class Ligacao {

	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("Contato realizado com sucesso");
			}

		} while (continuarTentando && tentativasRealizadas < 3);
		if (atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
		else {
			System.out.println("Não conseguimos contato com " + candidato + ", Número máximo de tentativas "
					+ tentativasRealizadas + " realizadas");
		}
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

}
