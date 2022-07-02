package variables;

public class InstanceVariableStudent {
	int rollNo;   // rollNo and name are the instance variables
	String name;  // these variables are specific to each object or instance // like rollNo = 1 for ivs object // rollNo=02 for ivs2 object
	public InstanceVariableStudent(int x,String y) { //This is the constructor , it is used to initialize the objects of the class, it is called whenever an object is created
		this.name=y;// this referes to the value of current object (this.name is "Jay" for object ivs and this.name is "Jamsi" for object ivs2)
		this.rollNo=x;
	}
	public void getStudentDetails() {
		System.out.println(rollNo + " " + name);
	}

}
