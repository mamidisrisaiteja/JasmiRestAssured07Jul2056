package demo;

public class StaticVariables {
	int empid;
	String empname;
	static String companyname="EY";
	public StaticVariables(int x,String y) {
		this.empid=x;
		this.empname=y;
		
	}
	public void getempDetails() {
		System.out.println(empid+ " " +empname+ "  "+companyname+" ");
	}

}
