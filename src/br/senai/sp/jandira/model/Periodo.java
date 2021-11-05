package br.senai.sp.jandira.model;

public enum Periodo {
	
	MANHA("Manhã"), 
	TARDE("Tarde"), 
	NOITE("Noite");

	private String descrição;
	
	private Periodo(String descricao) {
		this.descrição = descricao;
	}
	
	public String getDescrição() {
		return this.descrição;
	}
	
}
