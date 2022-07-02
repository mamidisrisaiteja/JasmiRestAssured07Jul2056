package Strings;

public class StringAss2 {

	public static void main(String[] args) {
		int count=0;
	
		String str="TENET";
		for(int i=0,j=str.length()-1;i<=str.length()/2 && j>=str.length()/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				break;
				
			}
			else {
				count++;
		}

	}
		
		if(count==(str.length()/2)+1) {
			System.out.println("the given String is a palindrome");
		}
		else
		{
			System.out.println(count);
			System.out.println("the given String is not a palindrome");
		}

}
	
}
