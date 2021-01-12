package br.com.excecao;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt("7");
			System.out.println("Vari�vel: " + numero);
			
			String palavra=null;
			if (palavra.length()==0) {
				throw new RuntimeException("eu derrubei a aplica��o");
			}
			System.out.println("Qtde letras: " + palavra.length());
			
		}catch(NumberFormatException e) {
			System.out.println("N�mero inv�lido");
		}catch(NullPointerException e) {
			System.out.println("Objeto nulo encontrado");
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}finally {
			System.out.println("At� logo");
			// costumamos colocar o encerramento da conex�o com o BD
		}






	}

}
