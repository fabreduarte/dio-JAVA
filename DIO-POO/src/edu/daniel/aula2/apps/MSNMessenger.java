package edu.daniel.aula2.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico de mensagem");
	}

}
