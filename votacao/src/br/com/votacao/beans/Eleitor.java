package br.com.votacao.beans;

public class Eleitor extends Pessoa{

	private int titulo;
	private boolean ativo;
	
	
	
	public void setAll(int id, String nome, String email, int titulo, boolean ativo) {
		super.setAll(id, nome, email);
		this.titulo = titulo;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Eleitor [titulo=" + titulo + ", ativo=" + ativo + ", pessoa=" + super.toString() + "]";
	}

	public Eleitor() {
		super();
	}

	public Eleitor(int id, String nome, String email, int titulo, boolean ativo) {
		super(id, nome, email);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
