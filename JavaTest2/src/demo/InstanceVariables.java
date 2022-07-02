package demo;

public class InstanceVariables {
	int empid;
	String empname;  //for non static variables object should be created
	public InstanceVariables(int x,String y) {
		this.empid=x;
		this.empname=y;
	}
	
	
	public void getempDetails() {
		System.out.println(empid+" "+empname);
	}

}
