import Klassen.Fitnessgerät;
import Klassen.Muskelgruppe;
import Klassen.Trainingseinheit;

public class App {
	public static void main(String[] args) {
		final String[] armListe = {"Bizeps", "Trizeps"};
		final String[] beinListe = {"Oberschenkelmuskel", "Wadenmuskel"};
		Muskelgruppe armMuskeln = new Muskelgruppe("Armmuskeln", armListe);
		Muskelgruppe beinMuskeln = new Muskelgruppe("Beinmuskeln", beinListe);
		Fitnessgerät hantel = new Fitnessgerät("Hantel", "Krafttraining", armMuskeln, 20, 50 , false);
		Fitnessgerät beinPresse = new Fitnessgerät("Beinpresse", "Krafttraining", beinMuskeln, 30, 80, false);
		Trainingseinheit trainingseinheit1 = new Trainingseinheit(30, 15, 1, 2019, 15, 17, hantel);
		Trainingseinheit trainingseinheit2 = new Trainingseinheit(40, 15, 01, 2019, 15, 45, beinPresse);
		hantel.kalorienverbrauch(30);
		hantel.kalorienverbrauch(30, 4);
		hantel.unterstuetzt("Bizeps");
		hantel.unterstuetzt(armMuskeln);
		hantel.benoetigtStromversorgung();
		armMuskeln.enthaelt("Bizeps");
		trainingseinheit1.erforderlicheTrainingszeit(300);
		trainingseinheit1.zielErreicht(30);
		trainingseinheit1.trainieren();
		trainingseinheit1.trainieren(5);
		while (trainingseinheit2.getFitnessgerät().kalorienverbrauch(trainingseinheit2.getDauer()) < 800) {
			trainingseinheit2.trainieren(5);
			System.out.println(trainingseinheit2.getDauer());
		}
		
	}
}
