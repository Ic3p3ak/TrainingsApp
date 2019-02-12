package Klassen;

public class Muskelgruppe {
	private String muskelname;
	private String [] muskelListe;
	
	public Muskelgruppe (String muskelname, String[] muskelListe) {
		this.muskelname = muskelname;
		this.muskelListe = muskelListe;
	}
	
	public boolean enthaelt (String muskel) {
		return muskel == muskelname;
	}
	
	public String getMuskelname (){
		return muskelname;
	}
	public void setMuskelname (String muskelname) {
		this.muskelname = muskelname;
	}
	public String[] getMuskelListe() {
		return muskelListe;
	}
	public void setMuskelListe(String[] muskelListe) {
		this.muskelListe = muskelListe;
	}
	
}
