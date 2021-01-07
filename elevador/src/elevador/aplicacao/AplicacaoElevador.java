package elevador.aplicacao;

import elevador.modelo.Elevador;

public class AplicacaoElevador {

	public static void main(String[] args) {

		Elevador objeto = new Elevador();
		objeto.preencherCapacidadeMaxima((short)8);
		objeto.preencherAndarMinimo((short)0);
		objeto.preencherAndarMaximo((short)15);
		
		/*
		System.out.println("Capacidade Maxima: " + objeto.retornarCapacidadeMaxima());
		System.out.println("Andar Minimo: " + objeto.retornarAndarMinimo());
		System.out.println("Andar Maximo: " + objeto.retornarAndarMaximo());
		System.out.println("Qtde Pessoas: " + objeto.retornarQtdePessoas());
		System.out.println("Andar atual: " + objeto.retornarAndarAtual());
		*/
		
		System.out.println(objeto.verificarStatus());
		objeto.subir();
		objeto.descer();
		objeto.entrar((short)4);
		objeto.sair();
		objeto.sair((short)1);
		System.out.println(objeto.verificarStatus());
		
		
		
	}

}
