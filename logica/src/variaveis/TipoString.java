package variaveis;

public class TipoString {

	public static void main(String[] args) {
		// String => � um tipo de Refer�ncia
		// Date => � um tipo de Refer�ncia
		
		String email = "emanuellePMF@hotmail.com";
		
		System.out.println("Original: " + email);
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do arroba: " + email.indexOf("@"));
		System.out.println("Do 2� at� o 5�: " + email.substring(1,4)); // coordenada final n�o entra no range
		System.out.println("A partir do 3�: " + email.substring(2,email.length()));
		System.out.println("Antes do @: " + email.substring(0, email.indexOf("@")));
		System.out.println("Antes do @: " + email.substring(email.indexOf("@")+1, email.length()));
		// e m a n u e l l e 
		// 0 1 2 3 4 5 6 7 8 
		
		
		
		
		

	}

}
