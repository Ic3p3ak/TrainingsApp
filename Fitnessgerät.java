package Klassen;

public class Fitnessger�t {
	
	private String ger�tename = new String ();
	private String ger�tetyp = new String();
	private Muskelgruppe muskelgruppe;
	private int empfohleneTrainingsdauer;
	private int kalorienPH;
	private boolean strom;

public Fitnessger�t (String ger�tename, String ger�tetyp, Muskelgruppe muskelgruppe, int empfohleneTrainingsdauer, int kalorienverbrauch, boolean strom) {
	this.ger�tename = ger�tename;
	this.ger�tetyp = ger�tetyp;
	this.muskelgruppe = muskelgruppe;
	this.empfohleneTrainingsdauer = empfohleneTrainingsdauer;
	this.kalorienPH = kalorienverbrauch;
	this.strom = strom;
}

public int kalorienverbrauch (int minuten) {
	int verbrauch;
	verbrauch = getKalorienPH() / 60 * minuten;
	return verbrauch;
}

public int kalorienverbrauch (int minuten, int stunden) {
	int verbrauch;
	verbrauch = getKalorienPH() / 60 * ((stunden * 60)+ minuten);
	return verbrauch;
}

public boolean unterstuetzt (String muskel) {
	Muskelgruppe muskelgruppe;
	muskelgruppe = this.muskelgruppe;
	for (int i = 0; i < muskelgruppe.getMuskelListe().length; i++) {
		if (muskel.equals(muskelgruppe.getMuskelListe()[1])) {
		return true ;
		}
	}
	return false;
}

public boolean benoetigtStromversorgung() {
	return strom == true;
}

public boolean unterstuetzt (Muskelgruppe muskelgruppe) {
	return muskelgruppe == this.muskelgruppe;
}

public String getGer�tename() {
	return ger�tename;
}
public void setGer�tename(String ger�tename) {
	this.ger�tename = ger�tename;
}
public String getGer�tetyp() {
	return ger�tetyp;
}
public void setGer�tetyp(String ger�tetyp) {
	this.ger�tetyp = ger�tetyp;
}
public int getEmpfohleneTrainingsdauer() {
	return empfohleneTrainingsdauer;
}
public void setEmpfohleneTrainingsdauer(int empfohleneTrainingsdauer) {
	this.empfohleneTrainingsdauer = empfohleneTrainingsdauer;
}
public int getKalorienPH () {
	return kalorienPH;
}
public void setKalorienPH(int kalorienPH) {
	this.kalorienPH = kalorienPH;
}
public boolean getStrom() {
	return strom;
}
public void setStrom(boolean strom) {
	this.strom = strom;
}
}