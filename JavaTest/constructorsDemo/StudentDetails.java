package constructorsDemo;

public class StudentDetails {
	
	int studentId;
	String studentName;
static String schoolName="Basil Woods";
	int age;
	
	
	public StudentDetails(int studentId,String studentName,int age) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.age=age;
	}
	
	public void printData() {
		System.out.println("the student details are " +studentId + studentName + schoolName  + age);
	}
	

}
