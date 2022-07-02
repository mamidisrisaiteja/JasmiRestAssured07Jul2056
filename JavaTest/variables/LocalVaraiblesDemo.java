package variables;

public class LocalVaraiblesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVaraiblesDemo l=new LocalVaraiblesDemo();
		l.run();
		//System.out.println(a); local varaibel a is even not know to the main method
	}
	public void run() {
		int a=5; // THis variable a is defined in a mehtod and its scope is inside this method only
		System.out.println(a);
	}

}
