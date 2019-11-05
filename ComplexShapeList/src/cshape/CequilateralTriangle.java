package cshape;

public class CequilateralTriangle implements Cshape {
	private double	a;
	public CequilateralTriangle(double a) {
		// TODO Auto-generated constructor stub
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
		System.out.println("equilateralTriangle"+"\t"+"a = "+a+"\t"+"P = "+ccalculateP()+"\t"+"O = "+ccalculateO()+"\t\n");
	}
	@Override
	public double ccalculateO() {
		// TODO Auto-generated method stub
		return 3*a;
	}
	@Override
	public double ccalculateP() {
		// TODO Auto-generated method stub
		return a*a*1.73205080757/4;
	}
	public String getType() {
		StringBuffer k=new StringBuffer();
		k.append("equilateralTriangle"+"\t"+"a = "+a+"\t"+"P = "+ccalculateP()+"\t"+"O = "+ccalculateO()+"\t\n");
		return k.toString();
	}
	
}
