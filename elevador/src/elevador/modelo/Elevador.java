package elevador.modelo;

public class Elevador {

	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdePessoas;
	private short andarAtual;

	public void sair() {
		if((qtdePessoas-1)<=qtdePessoas) {
			qtdePessoas-=1;
		}
	}
	public void sair(short param) {
		if((qtdePessoas-param)<=qtdePessoas) {
			qtdePessoas-=param;
		}
	}
	
	public String verificarStatus() {
		return "Qtde Pessoas: " + qtdePessoas + "\n" + "Andar Atual: " + andarAtual + "\n" + "Capacidade Maxima: " + capacidadeMaxima;
	}
	
	public void descer() {
		if(andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	
	public void subir() {
		if(andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	
	public short retornarAndarAtual() {
		return andarAtual;
	}
	
	public void entrar(short param) {
		if((qtdePessoas+param)<=capacidadeMaxima) {
			qtdePessoas+=param;
		}
	}
	
	public short retornarQtdePessoas() {
		return qtdePessoas;
	}
	
	public short retornarAndarMinimo() {
		return andarMinimo;
	}
	
	public void preencherAndarMinimo(short param) {
		andarMinimo = param;
	}
	
	public short retornarAndarMaximo() {
		return andarMaximo;
	}
	
	public void preencherAndarMaximo(short param) {
		andarMaximo = param;
	}
	
	public short retornarCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	public void preencherCapacidadeMaxima(short param) {
		capacidadeMaxima = param;
	}
	
}
