package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {

		/*
		 * Sintaxe do For
		 * 1� Parte: definimos o contador e o valor inicial
		 * 2� Parte: condi��o (enquanto for verdadeiro o la�o ir� continuar)
		 * 3� Parte: como ocorrer� a contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada?"));
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador +  " = " + (tabuada*contador));
		}
		
		
		
		
		
		
		
		
		
	}

}
