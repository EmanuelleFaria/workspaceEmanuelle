package br.com.votacao.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Pessoa;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;
import pacoteUtil.At;

public class ImplementarVoto {

	public static void main(String[] args) {

		Candidato candidato1 = new Candidato(1, "Xpto", "xpto@xpto.com.br", 1234, "vereador", "pjava");
		Candidato candidato2 = new Candidato(2, "Abc", "abc@abc.com.br", 4321, "vereador", "pdev");	
		Eleitor eleitor1 = new Eleitor(1, "CARLA", "carla@carla.com.br", 78945, true);
		Eleitor eleitor2 = new Eleitor(2, "BRUNO", "bruno@bruno.com.br", 45677, true);
		Eleitor eleitor3 = new Eleitor(3, "HUMBERTO", "humberto@humberto.com.br", 78966, true);
		List<Voto> lista = new ArrayList<Voto>();
		
		do {
			int resp = JOptionPane.showConfirmDialog(null,  "candidato1?", "?", JOptionPane.YES_NO_OPTION);
			if(resp==1) {
				lista.add(new Voto(
						new Eleitor(
								At.i("Código"),
								At.s("Nome"),
								At.s("Email"),
								At.i("Título"),
								At.b("Ativo?")
								),
						candidato1,
						true
						));
			}else {
				lista.add(new Voto(
						new Eleitor(
								At.i("Código"),
								At.s("Nome"),
								At.s("Email"),
								At.i("Título"),
								At.b("Ativo?")
								),
						candidato2,
						true
						));
			}
		}while(JOptionPane.showConfirmDialog(null,  "continua?", "?", JOptionPane.YES_NO_OPTION)==0);
		
		Urna urna = new Urna(
				321,
				123,
				"São Paulo",
				lista
				);
		
		System.out.println(urna.toString());
		System.out.println("Total de votos: " + urna.totalVotos());
		
		for (Voto v: urna.getVoto()) {
			System.out.println("Candidato: " + v.getCandidato().getNome());
			System.out.println("Eleitor: " + v.getEleitor().getNome());
		}


	}

}
