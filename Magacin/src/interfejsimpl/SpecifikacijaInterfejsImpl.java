package interfejsimpl;

import domen.Artikal;
import intefejs.SpecifikacijaInterfejs;

import java.util.LinkedList;
import java.util.List;

public class SpecifikacijaInterfejsImpl implements SpecifikacijaInterfejs{

	private List<Artikal> artikli = new LinkedList<Artikal>();
	
	@Override
	public void ubaciArtikal(Artikal a) {
		// TODO Auto-generated method stub
		artikli.add(a);
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		// TODO Auto-generated method stub
		artikli.remove(a);
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		for(Artikal a : artikli) {
			if(a != null && a.getSifra() == sifra) 
				return a;
		}
		return null;
	}

}
