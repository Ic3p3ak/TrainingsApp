package Klassen;

public class TrainingseinheitMitZiel extends Trainingseinheit implements Trainingsziel {

	private int kalorienZiel;
	
	public TrainingseinheitMitZiel(int dauer, int tag, int monat, int jahr, int mm, int hh, Fitnessgerät fitnessgerät, int kalorienziel) {
		super(dauer,tag,monat,jahr,mm,hh,fitnessgerät);
		this.kalorienZiel = kalorienziel;
	}
	
	public TrainingseinheitMitZiel () {
		super();
	}
	
	public void trainieren(int minuten) {
		setDauer(getDauer()+minuten);
		if(super.zielErreicht(kalorienZiel))
			System.out.println("Hurra");
	}
	
	public void setKalorienZiel (int kalorienziel) {
		this.kalorienZiel = kalorienZiel;
	}
	@Override
	public int getKalorienZiel() {
		return kalorienZiel;
	}
	@Override
	public double getZielerreichunggrad() {
		double ergebnis;
		ergebnis = kalorienZiel / super.getFitnessgerät().kalorienverbrauch(getDauer());
		return ergebnis;
	}
}
