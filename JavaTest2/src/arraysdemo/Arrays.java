package arraysdemo;

public class Arrays {

	public static void main(String[] args) {
	
		int[] arr=new int[5];  //single dimensional array
		int[] arr1=new int[]{1,2}; 
		int arr2[]= {3,4};
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		float b[]=new float[5]; 
		float b1[]=new float[]{3.0f,4.5f,4.67f};
		float b2[]= {2.7f,4.0f};
		char c[]=new char[3]; 
		char c1[]=new char[] {'j','a','y'};
		char c2[]= {'t','e','j','a'};

		for(int i=0;i<=b1.length-1;i++) {
			System.out.println(b1[i]);
		}
		for(int i=0;i<=c1.length-1;i++) {
			System.out.println(c1[i]);
		}
		String s[]=new String[2];
		String s1[]= {"jasmi","jay"};
		for(int i=0;i<=s1.length-1;i++) {
			System.out.println(s1[i]);
		}
		
		
	}

}
