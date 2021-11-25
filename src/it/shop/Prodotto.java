package it.shop;

import java.util.Random;

public class Prodotto {
	private int codiceNumero;
	private String nome;
	private String descrizione;
	private double prezzo;
	private boolean iva ;
	
	public Prodotto() {
		this.codiceNumero = setCodice();
	}
	
	Random random = new Random ();
	
	private int setCodice () {
		return random.nextInt(99999);
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return this.nome;
	}
	public void setDescrizione (String descrizione) {
		this.descrizione = descrizione;
	}
	public String getDescrizione () {
		return this.descrizione;
	}
	public void setPrezzo (double prezzo) {
		this.prezzo = prezzo;
	}
	public double getPrezzo () {
		return this.prezzo;
	}
	public void setIva (boolean iva) {
		this.iva = iva;
	}
	public boolean getIva () {
		return this.iva;
	}
	public int getCodiceNumero () {            //il nome deve combaciare?
		return this.codiceNumero;
	}
	
	
	
	

}
