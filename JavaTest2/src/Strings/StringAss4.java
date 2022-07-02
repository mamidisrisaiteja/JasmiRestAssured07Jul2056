package Strings;

public class StringAss4 {

	public static void main(String[] args) {
		String s1="surisetty.jasmitha123@gmail.com";
		String s2=s1.replaceAll("[0-9]", " ");
		String s3=s1.replaceAll("[a-z,A-Z]", " ");
		System.out.println(s2);
		System.out.println(s3);
	}

}
