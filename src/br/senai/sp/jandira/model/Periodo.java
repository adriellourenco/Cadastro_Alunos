package br.senai.sp.jandira.model;

public enum Periodo {
	
	MANHA("Manh�", "08h-12h"), 
	TARDE("Tarde", "13h-17h"), 
	NOITE("Noite", "19h-23h"),
	SABADO("S�bado", "08h-17h");

	private String descri��o;
	private String horario;
	
	private Periodo(String descricao, String horario) {
		this.descri��o = descricao;
		this.horario = horario;
	}
	
	public String getDescri��o() {
		return this.descri��o;
	}
	
	public String getHorario() {
		return horario;
	}
	
}
