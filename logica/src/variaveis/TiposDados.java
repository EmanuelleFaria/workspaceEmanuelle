package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		
		/*
		 * Existem dois Tipos de Dados
		 * - alfanum�rico: � o dado que n�o vai ser utilizado em uma express�o matem�tica.
		 * CEP=> 00010-009 (de um colaborador do Itau
		 * CPF (de um aluno de uma universidade)
		 * Em Java => String
		 * 
		 * - num�rico: � o dado que PODE ser utilizado em uma express�o matem�tica.
		 * CEP=> 00010-009 => 1 (diante de um contexto do site dos Correios = 00010009)
		 * CPF (contexto do site da Receita Federal)
		 * Em Java => int (n�meros inteiros) e double (para n�meros reais)
		 */
		
		/*
		 * Nome da vari�vel = identificador
		 * Regras
		 * - 1� n�o come�ar�s com n�meros (1berto n�o pode, h1berto pode)
		 * - 2� n�o far�s uso de palavras reservadas (int int n�o pode)
		 * - 3� n�o usar�s caracteres especiais (d@t@ n�o pode, nome cliente n�o pode)
		 * 
		 * Padroes
		 * - nomes significativos. Evitem: x, n1, xpto...
		 * - come�a com letra minuscula
		 * padr�o CamelCase
		 * dataNascimento (correto)
		 * datanascimento (errado)
		 * data_nascimento (correto)
		 * data_Nascimento (errado)
		 */
		
		/*
		 * Tipos num�ricos s�o primitivos, para apoi�-los usamos as classes Wrappers;
		 * int => Integer
		 * double => Double
		 * short => Short
		 * 
		 */
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso/(altura*altura);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);
		
		
		
		
		

	}

}
