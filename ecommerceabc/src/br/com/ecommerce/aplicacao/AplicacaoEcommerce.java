package br.com.ecommerce.aplicacao;

import br.com.ecommerceabc.modelo.Produto;

public class AplicacaoEcommerce {

	public static void main(String[] args) {

		Produto objeto = new Produto();
		
		System.out.println(objeto.getAll());
		objeto.setAll(1, "blusa", 100, 50, 2);
		System.out.println(objeto.getAll());
		
		System.out.println(objeto.getPromocao());
		System.out.println(objeto.getTotalVendas());
		System.out.println(objeto.getTotalCompras());
		objeto.atualizarValores((float)1.2);
		System.out.println(objeto.getAll());
		System.out.println(objeto.verificarEstoque());
		objeto.getPromocao((float) 0.85);
		System.out.println(objeto.getAll());
		
		
	}

}
