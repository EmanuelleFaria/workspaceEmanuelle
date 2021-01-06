package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		/*
		 * 1� Fase:
		 * Jogador1 => vai digitar um n�mero
		 * Jogador2=> vai tentar adivinhar o n�mero digitado pelo Jogador1
		 * Quando ele acertar, mostra a mensagem de Parab�ns
		 * 
		 * 2� Fase:
		 * Implemente dicas para o Jogador2
		 * "N�mero � menor" ou "N�mero � maior"
		 * 
		 * 3� Fase:
		 * Contar quantas tentativas o Jogador2 utilizou para acertar
		 * No final exibir essa quantidade junto com a mensagem de Parab�ns
		 */
		
		
		double jogador1 = Double.parseDouble(JOptionPane.showInputDialog("Jogador1 digite um n�mero:"));
		double jogador2 = Double.parseDouble(JOptionPane.showInputDialog("Jogador2 digite tente acertar o n�mero do Jogador1:"));
		int contador = 1;
		
		while(jogador1!= jogador2){
			if(jogador2>jogador1) {
				jogador2 = Double.parseDouble(JOptionPane.showInputDialog("O n�mero � menor! Tente novamente:"));
			}else {
				jogador2 = Double.parseDouble(JOptionPane.showInputDialog("O n�mero � maior! Tente novamente:"));
			}
			contador = contador + 1;
		}
		
		JOptionPane.showMessageDialog(null,"Parab�ns! Voc� acertou o n�mero " + jogador1 + " com " + contador + " tentativas.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}