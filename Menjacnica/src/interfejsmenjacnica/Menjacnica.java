package interfejsmenjacnica;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Menjacnica {

	public void dodatiNoviKurs(String valuta, double prodajni, double kupovni, double srednji, GregorianCalendar datum);
	public void brisanjeKursa(String valuta, GregorianCalendar datum);
	public Kurs vratiKurs(String valuta, GregorianCalendar datum);
	
}
