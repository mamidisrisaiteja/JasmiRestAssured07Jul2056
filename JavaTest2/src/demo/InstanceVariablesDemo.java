package demo;

public class InstanceVariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables Ivd=new InstanceVariables(01,"Teja");//template class classname should be used for object creation
		Ivd.getempDetails();
		InstanceVariables Ivd1=new InstanceVariables(02,"jay");
		Ivd1.getempDetails(); //for every object creation values will be changed
	}

}
