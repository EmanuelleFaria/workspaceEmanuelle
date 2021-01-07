package br.com.ecommerce.aplicacao;

import br.com.ecommerceabc.modelo.Produto;

public class AplicacaoEcommerce {

	public static void main(String[] args) {

		Produto objeto = new Produto();
		
		objeto.getAll();
		objeto.setAll(1, "blusa", 100, 50, 2);
		objeto.getAll();
		
		objeto.getPromocao();
		objeto.getTotalVendas();
		objeto.getTotalCompras();
		objeto.atualizarValores((float)1.2);
		objeto.verificarEstoque();
		
		
		
		
	}

}
