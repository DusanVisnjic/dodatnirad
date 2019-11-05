package ccollection2;

import ccollection.CshapeCollection;

public class Ccvor2 {
	private CshapeCollection information;
	private Ccvor2 next;
	public Ccvor2() {
		this.information=null;
		this.next=null;
	}
	public CshapeCollection getInformation() {
		return information;
	}
	public void setInformation(CshapeCollection information) {
		this.information = information;
	}
	public Ccvor2 getNext() {
		return next;
	}
	public void setNext(Ccvor2 next) {
		this.next = next;
	}
	
}
