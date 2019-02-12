package Klassen;
import java.util.*;

public class DoublyLinkedList {
	
	int size = 0;
	
	class Node {
		Node next = new Node();
		Node prev = new Node();
		Node current = null;
		Trainingseinheit data;
	}
	
	public void add (Trainingseinheit e) {
		
		Node n = new Node();
		n.data = e;
		if (n.next == null) {
			n.next = n;
			n.prev = n;
			n.current = n;
			size++;
		}else {
			
			n.prev = n.current;
			n.next = n.current.next;
			n.current.next = n;
			n.current.next.prev = n;
			n.current = n;
			size++;
			}
	}
		
	public Trainingseinheit getCurrent() {
		Node n = new Node();
		if (n.current == null) {
			throw new NoSuchElementException();
		}else {
		return n.current.data;
		}
	}
	
	public Trainingseinheit next () {
		Node n = new Node();
		if (n.current == null) {
			throw new NoSuchElementException();
		}else {
		n.next = n.current;
		return getCurrent();
		}
	}
	
	public Trainingseinheit prev () {
		Node n = new Node();
		if (n.current == null) {
			throw new NoSuchElementException();
		}else {
		n.prev = n.current;
		return getCurrent();
		}
	}
	
	public Trainingseinheit get (int offset) {
		Node n = new Node();
		if (n.current == null) {
			throw new NoSuchElementException();
		}else {
	    System.out.println("Bitte geben Sie die Anzahl der Stellen an um die weiter gehen möchten: ");
		Scanner scanner = new Scanner(System.in);
		offset = scanner.nextInt();
		scanner.close();
		for (int i = 0; i<offset; i++) {
			n.current = n.next;
		}
		return n.current.data;
		}
		
	}
	
	public int size () {
		return size;
	}
	
}
