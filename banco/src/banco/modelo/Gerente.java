package banco.modelo;

public class Gerente {

	private String nome;
	private String telefone;
	private String email;
	private int funcional;
	
	public void setAll(String nome, String telefone, String email, int funcional) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.funcional = funcional;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", funcional=" + funcional
				+ "]";
	}

	public Gerente() {
		super();
	}

	public Gerente(String nome, String telefone, String email, int funcional) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.funcional = funcional;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	
	
	
}
