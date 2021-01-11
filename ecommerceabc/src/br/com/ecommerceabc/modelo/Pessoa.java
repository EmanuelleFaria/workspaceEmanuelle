package br.com.ecommerceabc.modelo;

import pacoteUtil.PadraoPessoa;

public class Pessoa implements PadraoPessoa{

		private int id;
		private String nome;
		private String email;
		private Endereco endereco;
		
		public String getResumo() {
			return null;
		}
		
		
		public String getServidor() {
			if(email.contains("@")) {
				return email.substring(email.indexOf("@")+1);
			}
			return email;
		}

		public void setAll(int id, String nome, String email, Endereco endereco) {
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.endereco = endereco;
		}

		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + "]";
		}

		public Pessoa() {
			super();
		}

		public Pessoa(int id, String nome, String email, Endereco endereco) {
			super();
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.endereco = endereco;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}


		@Override
		public void setResumo(String param1, String param2) {
			
		}
		
		
		
		
		
		
}
