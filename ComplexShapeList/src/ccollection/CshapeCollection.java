package ccollection;

import ccollection.Ccvor;

import cshape.Cshape;



public class CshapeCollection {
	private Ccvor first;
	private Ccvor last;
	public CshapeCollection() {
	}
	public void caddLast(Cshape s) {
		Ccvor cvor = new Ccvor();
		cvor.setInformation(s);
		cvor.setNext(null);
		if(first==null) {
			first = cvor;
			last = cvor;
		}
		else {
			last.setNext(cvor);
			last = cvor;
		}
	}
	public void cremoveFirst() {
		first=first.getNext();
	}
	public void print() {
		Ccvor tek = first;
		while(tek!=null) {
			Cshape shape = tek.getInformation();

			
			shape.cprint();
			tek = tek.getNext();
		}
		}
	public Ccvor getFirst() {
		return first;
	}
	public void setFirst(Ccvor first) {
		this.first = first;
	}
	public Ccvor getLast() {
		return last;
	}
	public void setLast(Ccvor last) {
		this.last = last;
	}
}

