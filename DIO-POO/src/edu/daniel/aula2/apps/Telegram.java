package edu.daniel.aula2.apps;

public class Telegram extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico de mensagem");
	}

}
