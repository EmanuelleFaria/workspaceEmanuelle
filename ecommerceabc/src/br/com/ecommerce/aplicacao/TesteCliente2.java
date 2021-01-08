package br.com.ecommerce.aplicacao;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.Cliente;
import br.com.ecommerceabc.modelo.Endereco;

public class TesteCliente2 {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(
				Integer.parseInt(JOptionPane.showInputDialog("C�digo")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("Email"),
				new Endereco(
						JOptionPane.showInputDialog("Logradouro"),
						JOptionPane.showInputDialog("Bairro"),
						JOptionPane.showInputDialog("Cidade"),
						JOptionPane.showInputDialog("UF"),
						JOptionPane.showInputDialog("CEP"),
						JOptionPane.showInputDialog("N�mero"),
						JOptionPane.showInputDialog("Complemento")
						)
				);
		
		System.out.println(cliente.getEndereco().getBairro());
		
	}

}
