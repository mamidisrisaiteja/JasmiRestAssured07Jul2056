package arraysandstrings;

public class AssStrAss6 {

	public static void main(String[] args) {
		String s="hi my name is test@123";
		String s1=s.replaceAll("[@,0-9]"," ");
//        System.out.println(s1);
        System.out.println("the number of alphabet in a string are "+ s1.length());
        
	}

}
