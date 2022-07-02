package Strings;

public class StringAss6 {

	public static void main(String[] args) {
		String s1="jasmi";
		String s2="jasmi";
		String s3=new String("jasmi");
		String s4=new String("jasmi");
		boolean f1=(s1==s2)?true:false;
		boolean f2=(s1.equals(s2))?true:false;
		boolean f3=(s3.equals(s4))?true:false;
		boolean f4=(s1.equals(s4))?true:false;
		boolean f5=(s3==s4)?true:false;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);

	}

}
