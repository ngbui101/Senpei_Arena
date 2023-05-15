package daten_structures;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DoublyLinkedList {
	
	private DoublyLinkedListElement first;
	private DoublyLinkedListElement last;
	
	public DoublyLinkedListElement getFirst() {
		return first;
	}
	public DoublyLinkedListElement getLast() {
		return last;
	}
	public void addElementAtEnd(Serializable o) {
		if( this.first == null ) {
			this.last = new DoublyLinkedListElement(o,null, null);
			this.first = this.last;
		}
		else {
			DoublyLinkedListElement oldLast = this.last;
			this.last = new DoublyLinkedListElement(o, oldLast, null);
			oldLast.setSuccessor(last);
		}
	}
	public void addElementAtBeginning(Serializable o) {
		if(this.first == null) {
			this.first = new DoublyLinkedListElement(o, null, null);
			this.first = this.last;
		}
		else {
			DoublyLinkedListElement oldFirst = this.first;
			this.first = new DoublyLinkedListElement(o, null, oldFirst);
			oldFirst.setPredecessor(first);
		}
	}
	public void clear() {
		first = null;
		last = null;
	}
	public void saveList(String file) {
//		
//		fos = new FileOutputStream(file);
//		oos = new ObjectOutputStream(fos);
	}
	public void loadList(String file) {
		
	}
}
