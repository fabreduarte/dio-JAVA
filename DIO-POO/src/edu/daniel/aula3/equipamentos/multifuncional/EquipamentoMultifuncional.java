package edu.daniel.aula3.equipamentos.multifuncional;

import edu.daniel.aula3.equipamentos.copiadora.Copiadora;
import edu.daniel.aula3.equipamentos.digitalizadora.Digitalizadora;
import edu.daniel.aula3.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("Copiadno via equipamento multifuncional");
	}

	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
	}

	public void digitalizar() {
		System.out.println("Scanneando via equipamento multifuncional");
	}

}
