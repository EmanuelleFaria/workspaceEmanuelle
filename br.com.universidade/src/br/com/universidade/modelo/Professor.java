package br.com.universidade.modelo;

public class Professor {

	private String nome;
	private float valorHora;
	private String formacao;
	private String area;
	private String email;
	
	public String calcularSalario(int qtdeHoras) {
		return "Salário bruto: " + (qtdeHoras*valorHora)*1.06 + "/n" +
				"FGTS(8%): " + ((qtdeHoras*valorHora)*1.06)*0.08 + "\n" +
				"Salário líquido: " + ((qtdeHoras*valorHora)*1.06)*0.92 + "\n";
	}
	
	public String getSaudacao() {
		if (formacao == "Doutor") {
			return "PhD" + nome.substring(0,nome.indexOf(" "));
		}else if (formacao == "Mestre") {
			return "Ms." + nome.substring(0,nome.indexOf(" "));
		}else {
			return "Especialista" + nome.substring(0,nome.indexOf(" "));
		}
	}
	
	public void setAll(String nome, float valorHora, String formacao, String area, String email) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", valorHora=" + valorHora + ", formacao=" + formacao + ", area=" + area
				+ ", email=" + email + "]";
	}

	public Professor() {
		super();
	}

	public Professor(String nome, float valorHora, String formacao, String area, String email) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
