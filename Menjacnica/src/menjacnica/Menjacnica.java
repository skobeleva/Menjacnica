package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements interfejsmenjacnica.Menjacnica {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodatiNoviKurs(String valuta, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		
		Kurs noviKurs= new Kurs();
		noviKurs.setDatum(datum);
		noviKurs.setKupovniKurs(kupovni);
		noviKurs.setProdajniKurs(prodajni);
		noviKurs.setSrednjiKurs(srednji);
	
		if (valuta== null)
			throw new RuntimeException("Valuta ne sme biti null");
		
		for(int i=0; i<valute.size();i++) {
			
			if (valute.get(i).kurs.contains(noviKurs))
				throw new RuntimeException("Uneti kurs vec postoji u listi.");
			
			if(valute.get(i).getNaziv().equals(valuta)) 
				valute.get(i).kurs.add(noviKurs);
			
				return;
		}
		
	}

	@Override
	public void brisanjeKursa(String valuta, GregorianCalendar datum) {
		
		if (valuta== null || datum==null)
			throw new RuntimeException("Valuta ni datum ne sme biti null");
		
		for (int i= 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(valuta))
				for (int j = 0; j < valute.get(i).kurs.size(); j++)
					if (valute.get(i).kurs.get(j).getDatum().compareTo(datum) == 0)
						valute.get(i).kurs.remove(j);
			return;}
		System.out.println("Dati kurs ne postoji");

	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {

		if (valuta== null || datum==null)
			throw new RuntimeException("Valuta ni datum ne sme biti null");
		
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(valuta))
				for (int j = 0; j < valute.get(i).kurs.size(); j++)
					if (valute.get(i).kurs.get(j).getDatum().compareTo(datum) == 0)
						return valute.get(i).kurs.get(j);
			}
		System.out.println("Dati kurs ne postoji");

		return null;
	}

}
