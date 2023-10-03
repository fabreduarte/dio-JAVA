package processoSeletivo.candidatura;

import processoSeletivo.candidatura.Candidatos;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		Candidatos selecao = new Candidatos();
		selecao.selecaoCandidatos();

	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra proposta");
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}

	}
}
