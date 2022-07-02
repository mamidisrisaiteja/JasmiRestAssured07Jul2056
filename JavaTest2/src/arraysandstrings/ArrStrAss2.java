package arraysandstrings;

public class ArrStrAss2 {

	public static void main(String[] args) {
		String s1="hi my name is test@123";
		String s2[]=s1.split(" ");
		
		for(int i=0;i<=s2.length-1;i++) {
			System.out.println("the number of characters in " + i+1 + "th word are" +s2[i].length());
		}
	}

}
