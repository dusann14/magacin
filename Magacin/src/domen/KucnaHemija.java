package domen;

import java.sql.Date;

public class KucnaHemija extends Artikal{
	
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	
	public String toString() {
		return super.toString() + "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
