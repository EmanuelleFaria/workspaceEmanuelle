package br.com.ecommerce.aplicacao;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.Produto;

public class Produto3 {

	public static void main(String[] args) {
		
		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descricao"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
				);

		
		
		
		
	}

}
