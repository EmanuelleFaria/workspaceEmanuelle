package br.com.ecommerceabc.modelo;

/*
 * Design Patter (Padrões para projetos)
 * DTO (Um pattern - Data Transfer Object)
 * que é a melhor forma de representar o diagrama de classe dentro da programação
 *Diz que:
 * - TODOS os atributos devem ser privados
 * - CADA atributo deve possuir INDIVIDUALMENTE métodos getters e setters.
 * - 
 */

public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;

	public void getPromocao(float porcentagem) {
		valorVenda = valorVenda*porcentagem;
	}
	
	public String verificarEstoque() {
		if (qtde>20) {
			return "Estoque Alto";
		}else if (qtde<5) {
			return "Estoque Baixo";
		}else {
			return "Estoque Normal";
		}
	}
	
	public void atualizarValores(float porcentagem) {
		valorVenda = valorVenda*porcentagem;
		valorCompra = valorCompra*porcentagem;
	}
	
	public float getTotalCompras() {
		return valorCompra*qtde;
	}
	
	public float getTotalVendas() {
		return valorVenda*qtde;
	}
	
	public float getPromocao() {
		return valorVenda*(float)0.9;
	}
	
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}
	
	public String getAll() {
		return "Id: " + id + "\n" +
				"Descrição: " + descricao + "\n" +
				"Valor Venda: " + valorVenda + "\n" +
				"Valor Compra: " + valorCompra + "\n" +
				"Qtde: " + qtde;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
	
	
	
}
