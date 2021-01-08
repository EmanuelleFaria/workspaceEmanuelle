package br.com.ecommerceabc.modelo;

/*
 * Design Patter (Padrões para projetos)
 * DTO (Um pattern - Data Transfer Object)
 * que é a melhor forma de representar o diagrama de classe dentro da programação
 *Diz que:
 * - TODOS os atributos devem ser privados
 * - CADA atributo deve possuir INDIVIDUALMENTE métodos getters e setters.
 * - Toda classe BEANS deve possuir no MiNIMO 2 construtores, um vazio e outro com todos os parâmetros para os atributos
 */

public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;

	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", qtde=" + qtde + "]";
	}

	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

	public Produto() {
		super();
	}

	public float getPromocao(float porcentagem) {
		return valorVenda - valorVenda*(porcentagem/100);
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
		valorVenda = valorVenda + valorVenda*(porcentagem/100);
		valorCompra = valorCompra + valorCompra*(porcentagem/100);
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
