package com.nttdata.ereditarieta;

// estensione implicita della classe Object (...Persona extends Object)
public class Persona extends Object {

	private String nome;
	private String cognome;
	private int eta;

	/*
	 * Definisco tutti i possibili costruttori in modo tale che la classe che mi
	 * estende potra' usare il costruttore che preferisce
	 */

	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public Persona(String nome) {
		this.nome = nome;
	}

	public Persona() {

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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// Metodo proprio di questa classe (la sottoclasse non lo ridefinira')
	public void strilla() {
		System.out.println("AAAAAAAAAAAAAAAAARHWAJRFHAJK");
	}

	// Metodo che la sottoclasse ridefinira'
	public void presentati() {
		String messaggio = "Ciao, sono una Persona, mi chiamo " + nome + " " + cognome + " ed ho " + eta + " anni.";
		System.out.println(messaggio);
	}

	// Ridefinizione del metodo toString() della classe Object
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta'=" + eta + "]";
	}

}
