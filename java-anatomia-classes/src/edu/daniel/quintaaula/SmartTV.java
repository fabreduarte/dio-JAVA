package edu.daniel.quintaaula;

public class SmartTV {
	boolean ligada = false;
	int canal = 1;
	int volume = 10;

	public void ligar(){
		ligada = true;
	}

	public void desligar(){
		ligada = false;
	}

	public void aumentarVolume() {
		System.out.println("Volume aumentado em 1");

		volume++;
	}

	public void diminuirVolume() {
		System.out.println("Volume diminuído em 1");
		volume--;
	}

	public void mudarCanal(int novoCanal){
		canal = novoCanal;
	}

	public void aumentarCanal() {
		canal++;
	}

	public void diminuirCanal() {
		canal--;
	}
}
