package br.com.universidade.modelo;

public class Unidade {

	private String nome;
	private String bairro;
	private String telefone;
	
	
	
	public void setAll(String nome, String bairro, String telefone) {
		this.nome = nome;
		this.bairro = bairro;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Unidade [nome=" + nome + ", bairro=" + bairro + ", telefone=" + telefone + "]";
	}

	public Unidade() {
		super();
	}

	public Unidade(String nome, String bairro, String telefone) {
		super();
		this.nome = nome;
		this.bairro = bairro;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
