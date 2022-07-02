package arraysandstrings;

public class AssStrAss4 {

	public static void main(String[] args) {
		String s="hi my name is test@123";
		
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	      if(Character.isDigit(s.charAt(i)))
	      count++;
	    
	    }
	    System.out.println("the number of digits in the given string is:" + count);
	  }

	}


