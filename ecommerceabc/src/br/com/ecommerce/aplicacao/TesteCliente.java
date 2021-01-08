package br.com.ecommerce.aplicacao;

import br.com.ecommerceabc.modelo.Cliente;
import br.com.ecommerceabc.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("XPTO");
		cliente.setEmail("xpto@gama.com.br");
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLogradouro("Avenida Itaquera");
		endereco.setBairro("Itaquera");
		endereco.setCidade("São Paulo");
		endereco.setCep("12345-123");
		endereco.setComplemento("Viela 456");
		endereco.setNumero("77");
		endereco.setUf("SP");
		
		System.out.println(cliente.toString());
		
		
	}

}
