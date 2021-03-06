package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * VARI�VEIS - WRAPPERS
		 * boolean => dado l�gico (true/false) - Boolean
		 * char => 1 caracter - Character
		 * 
		 * ----- para n�meros inteiros:
		 * byte => -127 a +128 (ex: gols numa partida de futebol) - Byte
		 * short => -32000 a +32000 - Short
		 * int => -2bilhoes a +2bilhoes - Integer
		 * long => ???lhoes (bem grande) - Long
		 * 
		 * ----- para n�meros reais:
		 * float => menos exatid�o
		 * double => dobro de precis�o nas casas decimais quando comparado ao float
		 */
		
		/*
		 * criem vari�veis para:
		 * nota (semestral1)
		 * nota (semestral2)
		 * falta (m�ximo 200)
		 * disciplina (nome da mat�ria)
		 * m�dia (calculem)
		 */

		
		String materia = JOptionPane.showInputDialog("Digite o nome da mat�ria");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		short falta = Short.parseShort(JOptionPane.showInputDialog("Digite a qtde de faltas"));
		float media = (nota1+nota2)/2;
		
		System.out.println("Mat�ria: " + materia);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Faltas: " + falta);
		System.out.println("M�dia: " + media);
		
	}

}
