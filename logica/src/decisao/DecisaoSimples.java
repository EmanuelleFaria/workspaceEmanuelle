package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		if(media>=6) {
			System.out.println("Parab�ns voc� foi aprovado na disciplina: " + disciplina);
		}
		
		if(media<4) {
			System.out.println("Infelizmente voc� foi reprovado na disciplina: " + disciplina);
		}
		
		// && => and
		// || => or
		
		if(media>=4 && media<6) {
			System.out.println("Voc� tem chance no exame da disciplina " + disciplina);
		}
		
		
		System.out.println("M�dia: " + media);
		
		
		
		

	}

 }
