package br.com.universidade.aplicacao;

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
		return Boolean.parseBoolean(s(msg));
	}
	
}
