package edu.daniel.aula3.estabelecimento;

import edu.daniel.aula3.equipamentos.copiadora.Copiadora;
import edu.daniel.aula3.equipamentos.copiadora.Xerox;
import edu.daniel.aula3.equipamentos.digitalizadora.Digitalizadora;
import edu.daniel.aula3.equipamentos.digitalizadora.Scanner;
import edu.daniel.aula3.equipamentos.impressora.DeskJet;
import edu.daniel.aula3.equipamentos.impressora.Impressora;
import edu.daniel.aula3.equipamentos.impressora.LaserJet;
import edu.daniel.aula3.equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {

	public static void main(String[] args) {
		Impressora deskjet = new DeskJet();
		Impressora laserjet = new LaserJet();
		Digitalizadora scanner = new Scanner();
		EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();
		Copiadora xerox = new Xerox();
		Impressora multifuncao = new EquipamentoMultifuncional();

		Impressora impressora = multifuncional;
		Copiadora copiadora = multifuncional;
		Digitalizadora digitalizadora = multifuncional;

		deskjet.imprimir();
		System.out.println("------------------");
		laserjet.imprimir();
		System.out.println("------------------");
		scanner.digitalizar();
		System.out.println("------------------");
		xerox.copiar();
		System.out.println("------------------");
		multifuncional.copiar();
		multifuncional.digitalizar();
		multifuncional.digitalizar();
		System.out.println("------------------");
		multifuncao.imprimir();
		System.out.println("------------------");
		digitalizadora.digitalizar();
		copiadora.copiar();
		impressora.imprimir();

	}
}
