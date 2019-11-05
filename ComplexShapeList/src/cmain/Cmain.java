package cmain;

import ccollection.CshapeCollection;
import ccollection2.CcollectionCollection;
import cshape.Ccircle;
import cshape.CequilateralTriangle;
import cshape.Cshape;
import cshape.Csquare;

public class Cmain {
	public static void main(String[] args) {
		Cshape s1 = new Ccircle(5.0);
		Cshape s2 = new Csquare(10.0);
		Cshape s3 = new Ccircle(10.0);
		Cshape s4 = new Csquare(5.0);
		Cshape s5 = new CequilateralTriangle(4.0);
		Cshape s6 = new Ccircle(10.0);
		Cshape s7 = new Csquare(5.0);
		Cshape s8 = new CequilateralTriangle(4.0);
		
		CshapeCollection shapeCollection = new CshapeCollection();
		shapeCollection.caddLast(s1);
		shapeCollection.caddLast(s2);
		shapeCollection.caddLast(s3);
		shapeCollection.caddLast(s4);
		shapeCollection.caddLast(s5);
		CshapeCollection shapeCollection2 = new CshapeCollection();
		shapeCollection2.caddLast(s6);
		shapeCollection2.caddLast(s7);
		shapeCollection2.caddLast(s8);
		CcollectionCollection listaliste=new	CcollectionCollection();
		listaliste.caddLast2(shapeCollection);
		listaliste.caddLast2(shapeCollection2);
		listaliste.print2(2);
		System.out.println(listaliste.numberOfLists());
		//shapeCollection2.print();	
		//shapeCollection.cremoveFirst();
		//System.out.println("NOVA LSITA\n");
		//shapeCollection.print();
	}
}
