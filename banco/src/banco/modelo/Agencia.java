package banco.modelo;

public class Agencia {

	private String nome;
	private int numero;
	private Endereco endereco;
	private String telefone;
	private int id;
	
	public void setAll(String nome, int numero, Endereco endereco, String telefone, int id) {
		this.nome = nome;
		this.numero = numero;
		this.endereco = endereco;
		this.telefone = telefone;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", numero=" + numero + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", id=" + id + "]";
	}

	public Agencia() {
		super();
	}
	
	public Agencia(String nome, int numero, Endereco endereco, String telefone, int id) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.endereco = endereco;
		this.telefone = telefone;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
