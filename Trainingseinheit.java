package Klassen;

public class Trainingseinheit {
	private int dauer;
	private int tag;
	private int monat;
	private int jahr;
	private int mm;
	private int hh;
	private Fitnessger�t fitnessger�t;
	
	public Trainingseinheit (int dauer, int tag, int monat, int jahr, int mm, int hh, Fitnessger�t fitnessger�t) {
		this.dauer = dauer;
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
		this.mm = mm;
		this.hh = hh;
		this.fitnessger�t = fitnessger�t;
	}
	public Trainingseinheit (int tag, int monat, int jahr, int mm, int hh, Fitnessger�t fitnessger�t) {
		this.tag = tag;
		this.monat = monat;
		this.jahr = monat;
		this.mm = mm;
		this.hh = hh;
		this.fitnessger�t = fitnessger�t;
	}
	public Trainingseinheit (Fitnessger�t fitnessger�t) {
		this.fitnessger�t = fitnessger�t;
	}
	
	public Trainingseinheit() {
		
	}
	
	public boolean zielErreicht (int kalorienZiel) {
		return kalorienZiel >= fitnessger�t.kalorienverbrauch(dauer);
	}
	
	public int erforderlicheTrainingszeit (int kalorienZiel) {
		int minuten;
		minuten = (kalorienZiel / fitnessger�t.getKalorienPH())*60;
		return minuten;
	}
	
	public void trainieren() {
		dauer++;
	}
	
	public void trainieren (int minuten) {
		dauer += minuten;
	}
	
	
	public int getDauer() {
		return dauer;
	}
	public void setDauer(int dauer) {
		this.dauer = dauer;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getMonat() {
		return monat;
	}
	public void setMonat(int monat) {
		this.monat = monat;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	public int getMm() {
		return mm;
	}
	public void setMM(int mm) {
		this.mm = mm;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		this.hh = hh;
	}
	public Fitnessger�t getFitnessger�t () {
		return fitnessger�t;
	}
	public void setFitnessger�t(Fitnessger�t fitnessger�t) {
		this.fitnessger�t = fitnessger�t;
	}
}
