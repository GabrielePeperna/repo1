package org.generationitaly.app.entity;

public class Studente {
	private int id;
	private String matricola;
	private String codiceFiscale;
	private String nome;
	private String cognome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	@Override
	public String toString() {
		return "Studente [id=" + id + ", matricola=" + matricola + ", codiceFiscale=" + codiceFiscale + ", nome=" + nome
				+ ", cognome=" + cognome + "]";
	}
	
}
