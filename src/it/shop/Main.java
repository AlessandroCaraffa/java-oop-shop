package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prod = new Prodotto();
		
		System.out.println(prod.getCodiceNumero());
		prod.setNome("Tostapane");
		prod.setIva(0.22);
		prod.setPrezzo(25);
		System.out.println(prod.getPrezzo());
		System.out.println(prod.prezzoIva());
		
		System.out.println(prod.nomeEsteso());
		
	}

}
