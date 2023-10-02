package edu.daniel.quintaaula;

public class Usuario {
	public static void main(String[] args) {


		SmartTV smartTv = new SmartTV();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);
		System.out.println("---------------------------");

		smartTv.ligar();
		System.out.println("Novo Status: Tv Ligada " + smartTv.ligada);
		System.out.println("---------------------------");

		System.out.println("Canal antes de alterado " + smartTv.canal);
		smartTv.mudarCanal(25);
		System.out.println("Canal depois de alterado " + smartTv.canal);
		System.out.println("---------------------------");
	}
}
