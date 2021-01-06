package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		short falta = Short.parseShort(JOptionPane.showInputDialog("Falta"));
				
		/*
		 * Acrescenta o input das faltas
		 * Aprovação => media e falta (menor que 20)
		 * Exame => media e falta (menor que 20)
		 * Falta maior ou igual a 20 está reprovado
		 */
		
		if(media>=6 && falta<20) {
			System.out.println("Parabéns você foi aprovado na disciplina: " + disciplina);
		}else if(media<4 || falta>20) {
			System.out.println("Infelizmente você foi reprovado na disciplina: " + disciplina);
		}else {
			System.out.println("Você tem chance no exame da disciplina " + disciplina);
		}
		
		
		// && => and
		// || => or
		
		
		
		System.out.println("Média: " + media);
		
		
		
		

	}

 }
