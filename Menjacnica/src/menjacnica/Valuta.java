package menjacnica;

import java.util.LinkedList;

public class Valuta {


	private String naziv;
	private String skraceniNaziv;
	LinkedList<Kurs> kurs= new LinkedList<Kurs>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKurs() {
		return kurs;
	}
	public void setKurs(LinkedList<Kurs> kurs) {
		this.kurs = kurs;
	}
	
	
}
