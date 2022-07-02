package Strings;

import java.util.Arrays;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="JAVA TRAINING";
char arr1[]=str1.toCharArray();
char arr2[]=new char[arr1.length];
for(int i=str1.length()-1,j=0;i>=0&&j<=str1.length()-1;i--,j++) {
	arr2[j]=arr1[i];
}
if(Arrays.equals(arr1, arr2)) {
	System.out.println("the given string is palindrome");
}
else {
	System.out.println("the given string not a palindrome");
}
	}

}
