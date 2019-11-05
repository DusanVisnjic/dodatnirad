package ccollection;

import cshape.Cshape;

public class Ccvor {
	private Cshape information;
	private Ccvor next;
	public Ccvor() {
		this.information=null;
		this.next=null;
	}
	public Cshape getInformation() {
		return information;
	}
	public void setInformation(Cshape information) {
		this.information = information;
	}
	public Ccvor getNext() {
		return next;
	}
	public void setNext(Ccvor next) {
		this.next = next;
	}

}
