package ccollection2;


import ccollection.CshapeCollection;


public class CcollectionCollection {
 private Ccvor2 first;
 private Ccvor2 last;
 public CcollectionCollection() {
	}
 public void caddLast2(CshapeCollection s) {
		Ccvor2 cvor = new Ccvor2();
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
 public void cremoveFirst2() {
		first=first.getNext();
	}
 public void print2(int i) {
	 Ccvor2 tek=first;
		for (int j = 1; j <i; j++) {
			tek=tek.getNext();
			if(tek==null) {
				break;
			}
		}	
		if(tek==null) {
			System.out.println("Nepostoji trazena lista");
	
		}else {
			tek.getInformation().print();
		}
}
 public int numberOfLists() {
	 int counter=0;
	 Ccvor2 tek=first;
	 if (first==null) {
		 return 0;
	}else {
		while(tek!=null) {
			counter++;
			tek=tek.getNext();
		}
	}
	 return counter;
 }
public Ccvor2 getFirst() {
	return first;
}
public void setFirst(Ccvor2 first) {
	this.first = first;
}
public Ccvor2 getLast() {
	return last;
}
public void setLast(Ccvor2 last) {
	this.last = last;
}
}
