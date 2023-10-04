package edu.daniel.aula2.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico de mensagem");
	}

}
