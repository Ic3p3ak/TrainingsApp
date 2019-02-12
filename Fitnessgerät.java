package Klassen;

public class Fitnessgerät {
	
	private String gerätename = new String ();
	private String gerätetyp = new String();
	private Muskelgruppe muskelgruppe;
	private int empfohleneTrainingsdauer;
	private int kalorienPH;
	private boolean strom;

public Fitnessgerät (String gerätename, String gerätetyp, Muskelgruppe muskelgruppe, int empfohleneTrainingsdauer, int kalorienverbrauch, boolean strom) {
	this.gerätename = gerätename;
	this.gerätetyp = gerätetyp;
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

public String getGerätename() {
	return gerätename;
}
public void setGerätename(String gerätename) {
	this.gerätename = gerätename;
}
public String getGerätetyp() {
	return gerätetyp;
}
public void setGerätetyp(String gerätetyp) {
	this.gerätetyp = gerätetyp;
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