package demo;

public class LocalVariables {

	public static void main(String[] args) {

		LocalVariables l=new LocalVariables();
		l.run();
		

	}
	public void run() {
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c); //inside the method
	}

}
