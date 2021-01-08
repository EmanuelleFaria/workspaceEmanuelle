package banco.aplicacao;

import javax.swing.JOptionPane;

import banco.modelo.Agencia;
import banco.modelo.Cliente;
import banco.modelo.Conta;
import banco.modelo.Endereco;
import banco.modelo.Gerente;
import br.com.banco.util.Magica;

public class AplicacaoConta {
	
	// Métodos estáticos não exigem a instância objeto.
	
	public static void main(String[] args) {

		Conta Conta = new Conta(
				Magica.i("Numero Conta:"),
				Magica.f("Saldo Conta:"),
				new Cliente(
						Integer.parseInt(JOptionPane.showInputDialog("Id Cliente:")),
						JOptionPane.showInputDialog("Nome Cliente:"),
						JOptionPane.showInputDialog("Email Cliente:"),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro Cliente:"),
								JOptionPane.showInputDialog("Bairro Cliente:"),
								JOptionPane.showInputDialog("Cidade Cliente:"),
								JOptionPane.showInputDialog("UF Cliente:"),
								JOptionPane.showInputDialog("CEP Cliente:"),
								JOptionPane.showInputDialog("Numero Cliente:"),
								JOptionPane.showInputDialog("Complemento Cliente:")
								)
						),
				new Agencia(
						JOptionPane.showInputDialog("Nome Agencia:"),
						Integer.parseInt(JOptionPane.showInputDialog("Numero Agencia:")),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro Agencia:"),
								JOptionPane.showInputDialog("Bairro Agencia:"),
								JOptionPane.showInputDialog("Cidade Agencia:"),
								JOptionPane.showInputDialog("UF Agencia:"),
								JOptionPane.showInputDialog("CEP Agencia:"),
								JOptionPane.showInputDialog("Numero Agencia:"),
								JOptionPane.showInputDialog("Complemento Agencia:")
								),
						JOptionPane.showInputDialog("Telefone Agencia:"),
						Integer.parseInt(JOptionPane.showInputDialog("Id Agencia:"))
						),
				new Gerente(
						JOptionPane.showInputDialog("Nome Gerente:"),
						JOptionPane.showInputDialog("Telefone Gerente:"),
						JOptionPane.showInputDialog("Email Gerente:"),
						Integer.parseInt(JOptionPane.showInputDialog("Id Gerente:"))
						)
				);
		
		Conta.depositar(100);
		
		System.out.println(Conta.getCliente().getNome());
		System.out.println(Conta.getSaldo());
		System.out.println(Conta.getCliente().getEndereco().getCidade());
		System.out.println(Conta.getGerente().getNome());
		System.out.println(Conta.getAgencia().getNome());
		
		
		
	}

}
