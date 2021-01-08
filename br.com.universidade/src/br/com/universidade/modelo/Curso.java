package br.com.universidade.modelo;

public class Curso {

	private String descricao;
	private int cargaHoraria;
	private float valor;
	private Unidade unidade;
	
	public float getMensalidade() {
		return valor/(cargaHoraria/100);
	}
	
	
	public void setAll(String descricao, int cargaHoraria, float valor, Unidade unidade) {
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		return "Curso [descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + ", valor=" + valor + ", unidade="
				+ unidade + "]";
	}

	public Curso() {
		super();
	}

	public Curso(String descricao, int cargaHoraria, float valor, Unidade unidade) {
		super();
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
		this.unidade = unidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	
	
}
