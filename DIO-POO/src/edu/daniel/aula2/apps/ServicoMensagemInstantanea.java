package edu.daniel.aula2.apps;

public abstract class ServicoMensagemInstantanea {

	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado à internet");
	}

}
