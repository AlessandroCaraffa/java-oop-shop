package it.shop;

import java.util.Random;

public class Prodotto {
	
	
	
	//attributi
	private int codiceNumero;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;                          // posso inizializzrla qui?
	
	
	//costruttore
	public Prodotto() {
		this.codiceNumero = setCodice();
//		this.iva = 0.22;
	}
	
	
	//metodi
	
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
	public void setIva (double iva) {
		this.iva = iva;
	}
	public double getIva () {
		return this.iva;
	}
	public int getCodiceNumero () {            //il nome deve combaciare?
		return this.codiceNumero;
	}
	public double prezzoIva () {
		double sconto =this.iva * this.prezzo;
		return this.prezzo - sconto;
	}
	
	public String nomeEsteso () {
		return nome + codiceNumero;
	}
	
	
	

}
