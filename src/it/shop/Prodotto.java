package it.shop;

import java.util.Random;

public class Prodotto {
	Random random = new Random ();
	
	
	//attributi
	private int codiceNumero;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva = 0.22f;	    
	

	//costruttore
	public Prodotto(String nome, String descrizione, float prezzo) {
		this.codiceNumero = setCodice();
		this.nome = nome;
		this.descrizione = descrizione ;
		this.prezzo = prezzo;
	}
	
	
	//metodi
	
	//prezzo con iva
		public double prezzoIva () {
			return this.prezzo + (this.iva * this.prezzo);
		}
		
		//nome esteso
		public String nomeEsteso () {
			return nome + codiceNumero;
		}
	
	
	
	
	
	//nome
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return this.nome;
	}
	
	//descrizione
	public void setDescrizione (String descrizione) {
		this.descrizione = descrizione;
	}
	public String getDescrizione () {
		return this.descrizione;
	}
	
	//prezzo
	public void setPrezzo (float prezzo) {
		this.prezzo = prezzo;
	}
	public float getPrezzo () {
		return this.prezzo;
	}
	
	//iva
	public void setIva (float iva) {
		this.iva = iva;
	}
	public float getIva () {
		return this.iva;
	}
	
	//codice
	public int getCodice () {           
		return this.codiceNumero;
	}
	
	private int setCodice () {
		return random.nextInt(99999);
	}
	
	
	
	

}
