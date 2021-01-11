package br.com.ecommerceabc.modelo;

import pacoteUtil.PadraoPessoa;

public class ClientePF extends Pessoa implements PadraoPessoa{

	private String cpf;
	private String rg;
	
	public String getResumo() {
		return "Nome: " + super.getNome() + "\n" + "CPF: " + cpf;
	}
	
	public void setAll(int id, String nome, String email, Endereco endereco, String cpf, String rg) {
		super.setAll(id, nome, email, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", rg=" + rg + ", pessoa=" + super.toString() + "]";
	}

	public ClientePF() {
		super();
	}

	public ClientePF(int id, String nome, String email, Endereco endereco, String cpf, String rg) {
		super(id, nome, email, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public void setResumo(String param1, String param2) {
		cpf=param1;
		setNome(param2);
	}
	
	
}
