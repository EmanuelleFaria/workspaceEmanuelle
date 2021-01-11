package br.com.ecommerce.aplicacao;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.ClientePF;
import br.com.ecommerceabc.modelo.ClientePJ;
import br.com.ecommerceabc.modelo.Colaborador;
import br.com.ecommerceabc.modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {

		// Veiculo veiculo; ==== Criando o objeto
		// Veiculo veiculo = new Veiculo(); ==== Instanciando o objeto
		
		Pessoa pessoa = new Pessoa();
		char resp = JOptionPane.showInputDialog("Digite:\n<F> Fisica \n<J> Juridica\n<C> Colaborador").toUpperCase().charAt(0);
		
		if (resp=='F') {
			pessoa = new ClientePF();
		}else if (resp=='J') {
			pessoa = new ClientePJ();
		}else if (resp=='C') {
			pessoa = new Colaborador();
		}else {
			System.out.println("Opção inválida!!!");
		}
		
		pessoa.setResumo("xpto", "abc");
		
		System.out.println(pessoa.getResumo());
		
		
	}

}
