package pacoteUtil;

import javax.swing.JOptionPane;

public class At {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static boolean b(String msg) {
		int resp = JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION);
		if (resp==0) {
			return true;
		}
		return false;
	}
	
}
