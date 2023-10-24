package com.nttdata.main;

import com.nttdata.ereditarieta.Persona;
import com.nttdata.ereditarieta.Studente;

public class Main {

	/*
	 * PRINCIPIO OOP - EREDITARIETA'
	 * 
	 * Una classe che estende un'altra classe ne eredita i membri (attributi +
	 * metodi). La relazione tra la classe che estende e la classe estesa e' detta
	 * "is a", per indicare che la classe che estende e' un tipo piu' specializzato
	 * della classe estesa.
	 * 
	 * Tutte le classi estendono implicitamente la classe Object.
	 * 
	 * Se una classe derivata (una sottoclasse) vuole ridefinire il comportamento di
	 * un metodo della sua superclasse (classe estesa), lo fa tramite l'annotazione
	 * 
	 * @Override in testa al metodo da riscrivere.
	 * 
	 * Questa caratteristica conferisce alla sottoclasse la possibilita' di
	 * comportarsi sia come la superclasse, sia come una versione piu' specializzata
	 * della superclasse (ovvero come se stessa). Pertanto si parla di polimorfismo.
	 */

	public static void main(String[] args) {
		// Creo un'istanza della superclasse Persona
		Persona myself = new Persona("Giulio", "Grimani", 21);

		// Invoco sull'oggetto di tipo Persona, un metodo che non verra' ridefinito
		myself.strilla();

		// Invoco sull'oggetto di tipo Persona, un metodo che verra' ridefinito.
		// La versione invocata ora di questo metodo e' quella di Persona
		myself.presentati();

		// Creo un'istanza della sottoclasse Studente
		Studente studente = new Studente("Pinco", "Pallo", 18, "abc123");

		// Invoco un metodo ereditato da Persona che lo Studente NON ridefinisce.
		// Pertanto il metodo invocato e' quello della classe Persona (il compilatore
		// lo cerca dentro Studente, non lo trova e inizia a risalire l'albero
		// genealogico fino a quando trova la prima implementazione del metodo invocato
		studente.strilla();

		// Invoco un metodo ereditato da Persona che lo Studente HA ridefinito:
		// viene usata l'implementazione del metodo presente in Studente
		studente.presentati();

		// Invoco un metodo che esiste solo dentro Studente
		studente.studia();

		// E che quindi non posso invocare da una reference di tipo Persona
		// poiche' semplicemente non esiste
//		myself.studia();
	}

}
