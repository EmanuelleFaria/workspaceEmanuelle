package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Terá que imputar: nome de uma pessoa e a idade
		 * Deverá exibir uma das mensagens:
		 * mais que 70 anos, ou igual a 16 ou 17 -> "Voto facultativo"
		 * menor que 16 anos => "Não vota"
		 * se estiver entre 18 e 70 => "Obrigado a votar"
		 * 
		 */

		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		if(idade>70 || idade==17 || idade==16) {
			System.out.println("Voto facultativo");
		}
		
		if(idade<16) {
			System.out.println("Não vota");
		}
		
		if(idade>18 && idade<70) {
			System.out.println("Obrigado a voltar");
		}
		
	}

}
