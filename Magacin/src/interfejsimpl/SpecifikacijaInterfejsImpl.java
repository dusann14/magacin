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
		if(a == null)
			return;
		
		artikli.add(a);
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
