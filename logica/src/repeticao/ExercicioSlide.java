package repeticao;

import javax.swing.JOptionPane;

public class ExercicioSlide {

	public static void main(String[] args) {
		/*
(Slide 77 - PPT 1-2-3 - Github)

Monte um programa que solicite a idade e o nome das pessoas. 
A aplica��o continuar� perguntando nome e idade enquanto o usu�rio afirmar que deseja continuar.
Ao terminar, a aplica��o dever� exibir:
- a quantidade de pessoas maiores de idade e 
- a m�dia entre todas as idades que foram digitadas. 
- a pessoa mais experiente (nome e idade)
- a pessoa mais jovem (nome e idade)
		 */
		
		String nome = "";
		int idade = 0;
		
		int contador = 1;
		
		int maioresIdade = 0;
		double somaIdades = 0;
		
		String maisVelho = "";
		int idadeMaisVelho = 0;
		
		String maisJovem = "";
		int idadeMaisJovem = 0;
		
		do {
		nome = JOptionPane.showInputDialog("Nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		
		somaIdades = somaIdades+idade;
		// somaIdades+=idade;
		
		if (idade>=18) {
			maioresIdade = maioresIdade + 1;
			// maioresIdade+=1;
		}
		
		if (contador==1) {
			maisVelho = nome;
			idadeMaisVelho = idade;
			
			maisJovem = nome;
			idadeMaisJovem = idade;
		}else {
			if (idade>idadeMaisVelho) {
				maisVelho = nome;
				idadeMaisVelho = idade;
			}
			if(idade<idadeMaisJovem) {
				maisJovem = nome;
				idadeMaisJovem = idade;
			}
		}
				
		contador = contador + 1;

		} while(JOptionPane.showConfirmDialog(null,  "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

		System.out.println("Maiores de idade: " + maioresIdade);
		System.out.println("M�dia entre as idades: " + somaIdades/(contador-1));
		System.out.println("Mais velho: " + maisVelho);
		System.out.println("Idade mais velho: " + idadeMaisVelho);
		System.out.println("Mais jovem: " + maisJovem);
		System.out.println("Idade mais jovem: " + idadeMaisJovem);

	}

}

