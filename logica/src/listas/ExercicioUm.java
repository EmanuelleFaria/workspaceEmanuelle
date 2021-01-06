package listas;

import javax.swing.JOptionPane;

public class ExercicioUm {

	public static void main(String[] args) {
		
		String cliente = JOptionPane.showInputDialog("Cliente").toUpperCase();
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		double valor = 80;
				
		if (diarias>15){
			valor = diarias*(80+5.5);
		}else if (diarias==15) {
			valor = diarias*(80+6);
		}else {
			valor = diarias*(80+8);
		}
		
		System.out.println("Valor final do cliente " + cliente + ": " + valor);
		
	}

}
