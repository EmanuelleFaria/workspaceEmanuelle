package br.com.concessionariaxyz.aplicacao;

import javax.swing.JOptionPane;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
	
		// Criar um objeto => ele não possui qualquer repartição
		// Exemplo: Veiculo objeto;
		// Instanciar um objeto => ele possui todas as repartições
		// Exemplo: Veiculo objeto = new Veiculo();
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("fIAt");
		objeto.preencherModelo("UNO");
		objeto.preencherValor(30000);
		objeto.preencherVelocidadeMaxima(180);
				
		System.out.println("Montadora........: " + objeto.retornarMontadora());
		System.out.println("Modelo...........: " + objeto.retornarModelo());
		System.out.println("Valor............: " + objeto.retornarValor());
		System.out.println("Velocidade Maxima: " + objeto.retornarVelocidadeMaxima());
		
		System.out.println(objeto.ligar());
		
		objeto.acelerar(20);
		objeto.acelerar();
		objeto.acelerar(280);
		System.out.println(objeto.verificarStatus());
		
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.verificarStatus());
		
		System.out.println(objeto.desligar());
		System.out.println(objeto.verificarStatus());
		
		
		
		
		
		
		
		
	}

}
