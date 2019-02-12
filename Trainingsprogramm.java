package Klassen;
import java.util.*;
import java.util.ArrayList;
public class Trainingsprogramm implements Trainingsziel
{
	//private ArrayList<Trainingseinheit> arrayList;
	private int kalorienZiel;
	private DoublyLinkedList list;
	
	public Trainingsprogramm (DoublyLinkedList list, int kalorienZiel) {
		//this.arrayList = arrayList;
		this.list = list;
		this.kalorienZiel = kalorienZiel;
	}
	public Trainingsprogramm () {
		
	}
	
	public void addTrainingseinheit (Trainingseinheit trainingseinheit) {
		list.add(trainingseinheit);
	}
	
	
	public DoublyLinkedList getList() {
		return list;
	}
	public void setList(DoublyLinkedList list) {
		this.list = list;
	}
	
	public int getKalorienZiel() {
		return kalorienZiel;
	}
	public void setKalorienZiel(int kalorienZiel) {
		this.kalorienZiel = kalorienZiel;
	}
	
	public Trainingsziel testIf(String typ) {
		Trainingsziel t;
		if (typ == "Trainingsprogramm") {
			 t = new Trainingsprogramm(); 
		} else if (typ == "TrainingseinheitMitZiel") {
			t = new TrainingseinheitMitZiel();
		} else {
			t = new Trainingsprogramm();
		}
		return t;
		
	}
	
	@Override
	public double getZielerreichunggrad() {
	int ergebnis = 0;
	for (int i = 0; i < list.size(); i++) {
		ergebnis += kalorienZiel / list.get(i).getFitnessgerät().kalorienverbrauch(list.get(i).getDauer());
	}
		return ergebnis;
	}
}
