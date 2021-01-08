package banco.modelo;

public class Conta {

	private int numero;
	private float saldo;
	private Cliente cliente;
	private Agencia agencia;
	private Gerente gerente;
	
	public void depositar(float valor) {
		if (valor>0) {
			saldo+=valor;
		}
	}
	
	public void setAll(int numero, float saldo, Cliente cliente, Agencia agencia, Gerente gerente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia
				+ ", gerente=" + gerente + "]";
	}

	public Conta() {
		super();
	}

	public Conta(int numero, float saldo, Cliente cliente, Agencia agencia, Gerente gerente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
	
	
}
