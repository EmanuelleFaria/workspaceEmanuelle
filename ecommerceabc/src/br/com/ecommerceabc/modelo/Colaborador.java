package br.com.ecommerceabc.modelo;

import pacoteUtil.PadraoPessoa;

public class Colaborador extends Pessoa implements PadraoPessoa{
	
	private String cargo;
	private String dtAdmissao;
	
	
	public void setAll(int id, String nome, String email, Endereco endereco, String cargo, String dtAdmissao) {
		super.setAll(id, nome, email, endereco);
		this.cargo = cargo;
		this.dtAdmissao = dtAdmissao;
	}

	@Override
	public String toString() {
		return "Colaborador [cargo=" + cargo + ", dtAdmissao=" + dtAdmissao + ", pessoa=" + super.toString() +"]";
	}

	public Colaborador() {
		super();
	}

	public Colaborador(int id, String nome, String email, Endereco endereco, String cargo, String dtAdmissao) {
		super(id, nome, email, endereco);
		this.cargo = cargo;
		this.dtAdmissao = dtAdmissao;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	@Override
	public void setResumo(String param1, String param2) {
		cargo=param1;
		setNome(param2);
		
	}
	
	

}
