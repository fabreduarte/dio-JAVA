package edu.daniel.enums;

public class SistemaIbge {

	public static void main(String[] args) {

		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
			System.out.println("--------------------------");
		}

		EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

		System.out.println(eb.getNome());
		System.out.println("--------------------------");
		System.out.println(eb.getSigla());
		System.out.println("--------------------------");
		System.out.println(eb.getNomeMaiusculo());
		System.out.println("--------------------------");
		System.out.println(eb.getIbge());
		System.out.println("--------------------------");

	}
}
