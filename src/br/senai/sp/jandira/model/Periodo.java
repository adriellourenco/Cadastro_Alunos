package br.senai.sp.jandira.model;

public enum Periodo {
	
	MANHA("Manhã", "08h-12h"), 
	TARDE("Tarde", "13h-17h"), 
	NOITE("Noite", "19h-23h"),
	SABADO("Sábado", "08h-17h");

	private String descrição;
	private String horario;
	
	private Periodo(String descricao, String horario) {
		this.descrição = descricao;
		this.horario = horario;
	}
	
	public String getDescrição() {
		return this.descrição;
	}
	
	public String getHorario() {
		return horario;
	}
	
}
