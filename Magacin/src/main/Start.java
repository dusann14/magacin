package main;

import domen.Artikal;
import interfejsimpl.SpecifikacijaInterfejsImpl;

public class Start {

	public static void main(String[] args) {
		
		SpecifikacijaInterfejsImpl servis = new SpecifikacijaInterfejsImpl();
		
		Artikal a = new Artikal();
		a.setKolicina(100);
		try {
			a.setNaziv("Laptop");
			a.setOpis("Neki opis");
			a.setSifra(123);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		servis.ubaciArtikal(a);
		System.out.println(servis.pronadjiArtikal(123));
		servis.izbaciArtikal(a);
		System.out.println(servis.pronadjiArtikal(123));
	}

}
