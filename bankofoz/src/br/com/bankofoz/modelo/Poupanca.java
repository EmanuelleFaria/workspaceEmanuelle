package br.com.bankofoz.modelo;

import pacoteUtil.PadraoConta;

public class Poupanca extends Conta implements PadraoConta{

	private float rendimento;

	public float verificarSaldo() {
		return (getSaldo());
	}
	
	public void creditarRendimentos() {
		setSaldo(getSaldo() + getSaldo()*(rendimento/100));
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", conta=" + super.toString() +"]";
	}

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public boolean depositar(float valor) {
		if(valor>=0) {
			super.setSaldo(valor+super.getSaldo());
			return true;
		}
		return false;
	}

	@Override
	public boolean sacar(float valor) {
		if (super.getSaldo()>=valor) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	
}
