package com.nttdata.ereditarieta;

// Per estendere una classe, si usa la seguente sintassi
public class Studente extends Persona {

	// Attributo che la classe Studente AGGIUNGE rispetto alla classe Persona
	private String matricola;

	// Il costruttore della classe derivata avra' logicamente in ingresso
	// tutti i parametri: sia quelli della superclasse sia i propri
	public Studente(String nome, String cognome, int eta, String matricola) {
		// l'invocazione al costruttore della superclasse DEVE essere la prima
		// istruzione all'interno del costruttore
		super(nome, cognome, eta);
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	// Metodo proprio di questa classe
	public void studia() {
		System.out.println("Sto studiando...");
	}

	// Ridefinizione del metodo ereditato dalla superclasse Persona
	@Override
	public void presentati() {
		System.out.println("Ciao, sono uno Studente e mi chiamo " + super.getNome() + " " + super.getCognome()
				+ " ed ho " + super.getEta() + " anni e la mia matricola e' " + matricola);
	}

	// Ridefinizione del metodo ereditato dalla superclasse Object
	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + "]";
	}

}
