package listas;

import javax.swing.JOptionPane;

public class ExercicioTres {

	public static void main(String[] args) {
		
	float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Número 1"));
	float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Número 2"));
	String operacao = JOptionPane.showInputDialog("Operacao");
	float resposta;
	
	if(operacao.equals("+")) {
		resposta = (numero1+numero2);
	}else if(operacao.equals("-")) {
		resposta = numero1-numero2;
	}else if(operacao.equals("*")) {
		resposta = numero1*numero2;
	}else {
		resposta = numero1/numero2;
	}
	
	System.out.println("Resposta: " + resposta);
	
	
	}

}
