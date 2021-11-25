package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prod = new Prodotto("iphone", "bellissimo iphone", 300);
		
		System.out.println(prod.nomeEsteso());
		System.out.println(prod.getPrezzo() + "€");
		System.out.println("con iva :" + prod.prezzoIva() +"€");
		
		prod.setNome("ipad");
		prod.setPrezzo(400);
		prod.setDescrizione("ipad niente male");
		System.out.println(prod.nomeEsteso());
		System.out.println("Questo " + prod.getNome() + " costa " + prod.getPrezzo() + "€" + " iva esclusa, " + prod.prezzoIva() + "€ totali. \nDicono di lui:" + prod.getDescrizione());
		
		
		
	}

}
