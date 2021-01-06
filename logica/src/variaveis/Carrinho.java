package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		/*
		 * Criem as variáveis para:
		 * - nome do produto
		 * - categoria do produto (alimentício, eletrodoméstico...)
		 * - valor do produto
		 * - qtde do produto
		 * - imposto do produto
		 */
		
		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
		String categoriaProduto = JOptionPane.showInputDialog("Digite a categoria do produto");
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));;
		int qtdeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde do produto"));
		double impostoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto do produto"));
		
		/*
		 * Exibam no final:
		 * - total sem imposto
		 * - total com imposto
		 * - só o valor do imposto
		 * - total com imposto e 10% de desconto (para os pagamentos a vista)
		 */
		System.out.println("Nome Produto: " + nomeProduto);
		System.out.println("Categoria Produto: " + categoriaProduto);
		System.out.println("Valor Produto: " + valorProduto);
		System.out.println("Qtde Produto: " + qtdeProduto);
		System.out.println("Imposto Produto: " + impostoProduto);
		System.out.println("Total sem imposto: " + (valorProduto*qtdeProduto));
		System.out.println("Total com imposto: " + ((valorProduto + valorProduto*(impostoProduto/100))*qtdeProduto));
		System.out.println("Total com imposto e desconto: " + (((valorProduto + valorProduto*(impostoProduto/100))*0.9))*qtdeProduto);
		
				
		
		
		
		
	}

}
