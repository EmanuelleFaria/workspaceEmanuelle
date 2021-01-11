package br.com.bankofoz.aplicacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;
import pacoteUtil.At;

public class ImplementarConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		String resp = JOptionPane.showInputDialog("Para cadastrar Poupança, digite <POUPANCA>. \n Para cadastrar Corrente, digite <CORRENTE>");
		
		if (resp.toUpperCase().equals("POUPANCA")){
			conta = new Poupanca(
					(short) At.i("Numero"),
					(byte) At.i("Digito"),
					(short) At.f("Agencia"),
					0, 
					new Cliente(
							At.i("Código Cliente"),
							At.s("Nome Cliente"),
							At.s("CPF"),
							At.s("Telefone")
							),
					At.f("Rendimento")
					);
		}else if(resp.toUpperCase().equals("CORRENTE")) {
			conta = new Corrente(
					(short) At.i("Numero"),
					(byte) At.i("Digito"),
					(short) At.i("Agencia"),
					0,
					new Cliente(
							At.i("Código Cliente"),
							At.s("Nome Cliente"),
							At.s("CPF"),
							At.s("Telefone")
							),
					At.f("Limite"),
					At.f("Taxa")
					);
		}else {
			System.out.println("Resposta inválida");
		}
		
		System.out.println(conta.depositar(At.f("Valor depositado")));
		System.out.println(conta.toString());
		System.out.println(conta.sacar(At.f("Sacar")));
		System.out.println(conta.verificarSaldo());
		
		
		
	}

}
