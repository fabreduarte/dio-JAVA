package edu.daniel.aula2;

import edu.daniel.aula2.apps.FacebookMessenger;
import edu.daniel.aula2.apps.MSNMessenger;
import edu.daniel.aula2.apps.ServicoMensagemInstantanea;
import edu.daniel.aula2.apps.Telegram;

public class Computador {

	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;

		String appEscolhido = "facebook";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("facebook"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("telegram"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();

	}
}
