package cshape;

public class Csquare implements Cshape  {
	private double a;
	public Csquare(double a) {
		this.a=a;
	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	@Override
	public void cprint() {
		// TODO Auto-generated method stub
		System.out.println("Square"+"\t"+"a = "+a+"\t"+"P = "+ccalculateP()+"\t"+"O = "+ccalculateO()+"\t");
	}
	@Override
	public double ccalculateO() {
		// TODO Auto-generated method stub
		return 4*a;
	}
	@Override
	public double ccalculateP() {
		// TODO Auto-generated method stub
		return a*a;
	}
	public String getType() {
		StringBuffer k=new StringBuffer();
		k.append("Square"+"\t"+"a = "+a+"\t"+"P = "+ccalculateP()+"\t"+"O = "+ccalculateO()+"\t\n");
		return k.toString();
	}
}
