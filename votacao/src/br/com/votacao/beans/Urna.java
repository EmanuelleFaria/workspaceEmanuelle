package br.com.votacao.beans;

import java.util.List;

public class Urna {
	
	private int zona;
	private int secao;
	private String cidade;
	private List<Voto> voto;
	
	public int totalVotos() {
		return voto.size();
	}
	
	public void setAll(int zona, int secao, String cidade, List<Voto> voto) {
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.voto = voto;
	}

	@Override
	public String toString() {
		return "Urna [zona=" + zona + ", secao=" + secao + ", cidade=" + cidade + ", voto=" + voto + "]";
	}

	public Urna() {
		super();
	}

	public Urna(int zona, int secao, String cidade, List<Voto> voto) {
		super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.voto = voto;
	}
	
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Voto> getVoto() {
		return voto;
	}
	public void setVoto(List<Voto> voto) {
		this.voto = voto;
	}
	
	
	
	
	
	

}
