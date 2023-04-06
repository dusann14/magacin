package domen;

import java.util.Objects;

public class Artikal {
	
	private String naziv,opis;
	private int sifra, kolicina;
	
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Exception {
		if(naziv.isEmpty())
			throw new Exception("Prazan string");
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) throws Exception {
		if(opis.isEmpty())
			throw new Exception("Prazan string");
		this.opis = opis;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) throws Exception {
		if(sifra <= 0)
			throw new Exception("Negativna vrednost");
		this.sifra = sifra;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", opis=" + opis + ", sifra=" + sifra + ", kolicina=" + kolicina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	
	
	
}
