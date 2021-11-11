package br.senai.sp.jandira.model;

public enum Periodo {
	
	MANHA("Manh�"), 
	TARDE("Tarde"), 
	NOITE("Noite"),
	SABADO("S�bado");

	private String descri��o;
	
	private Periodo(String descricao) {
		this.descri��o = descricao;
	}
	
	public String getDescri��o() {
		return this.descri��o;
	}
	
}
