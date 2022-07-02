package variables;

public class StaticVaraibleStudent {
	int rollNo;
	String name;
	static String schoolName="Basil Woods";
	public StaticVaraibleStudent(int x,String y) { //This is the constructor , it is used to initialize the objects of the class, it is called whenever an object is created
		this.name=y;// this referes to the value of current object (this.name is "Jay" for object ivs and this.name is "Jamsi" for object ivs2)
		this.rollNo=x;
	}
	public void getStudentDetails() {
		System.out.println(rollNo + " " + name + schoolName);
	}


}
