package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {

		/*
		 * Sintaxe do For
		 * 1º Parte: definimos o contador e o valor inicial
		 * 2º Parte: condição (enquanto for verdadeiro o laço irá continuar)
		 * 3º Parte: como ocorrerá a contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada?"));
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador +  " = " + (tabuada*contador));
		}
		
		
		
		
		
		
		
		
		
	}

}
