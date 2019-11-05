package cshape;

public class Ccircle implements Cshape{
	private double a;
	public Ccircle(double a) {
		this.a=a;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void cprint() {

		System.out.println("Cicle"+"\t"+"a = "+a+"\t"+"P = "+ccalculateP()+"\t"+"O = "+ccalculateO()+"\t\n");
		
	}

	public double ccalculateO() {
		
		return 2*a*Math.PI;
	}

	@Override
	public double ccalculateP() {
	
		return a*a*Math.PI;
	}
	public String getType() {
		StringBuffer k=new StringBuffer();
		k.append("Cicle"+"\t"+"a = "+a+"\t"+"P = "+ccalculateP()+"\t"+"O = "+ccalculateO()+"\t");
		return k.toString();
	}
	
	
	
}
