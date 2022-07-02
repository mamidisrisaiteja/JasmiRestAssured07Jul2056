package arraysandstrings;

public class AssStrAss3 {

	public static void main(String[] args) {
		String s1="10";
		int k=10;
		int i=2;
		int j=3;
		System.out.println(s1+i+j);//intially i will be converted to string and later j will be conerted to string
		System.out.println(s1+(i+j));// here i aand ja will be added first an later will be appended to string, so  later (i+j) will be conv to string
		System.out.println(i+j+s1);
		System.out.println(s1+(i+j)+k);
		System.out.println(s1+(i+j+k));
		System.out.println(i+j+s1+k);
		//o/p
//		1023
//		105
//		510
//		10510
//		1015
//		51010

		
	}

}
