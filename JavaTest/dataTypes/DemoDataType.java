package dataTypes;

public class DemoDataType {

	static int a=5;
	static boolean b=true;
	static char c='f';
	static long d=909;
	static float f=56.000005f;
	static double g=478.0000000000001d;
	

	//static int a1=5.0f;  // we will get compile time error because we cant assigne 
	//float to int data type , so what is the solution, you cna type cast the datatypes
	
	// Note , the smaller data types will always be type caseted implitcity but to type cast the 
	//longer one to smaller data types, we need to expicitly mention them
	//static int e1=(int)a1;  // expicit type casting
	static boolean b1=true;
	static char c1='f';
	static long d1=909;
	static float f1=56;   /// impicit type casting
	static double g1=478;  
	static float h1=(float)9.00000400003d;
	static long i1=(long)123.005000045555555555d; 
	static int j1=(int)12345678902345678L;
	static long k1=123;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  //local variables should always be initialized
		
		
		System.out.println(" integer default value" + a);
		System.out.println(" boolean default value" + b);
		System.out.println(" char default value" + c);
		System.out.println(" long default value" + d);
		System.out.println(" float default value" + f);
		System.out.println(" double default value" + g   + " end of 1st code snippet ");
		
		//System.out.println(" integer default value" + e1);
		System.out.println(" boolean default value" + b1);
		System.out.println(" char default value" + c1);
		System.out.println(" long default value" + d1);
		System.out.println(" float default value" + f1);
		System.out.println(" double default value" + g1);
		System.out.println(" double default value" + h1);
		System.out.println(" double default value" + i1);
		System.out.println(" double default value" + j1);
		System.out.println(" double default value" + k1);
		
//		System.out.println(" integer default value" + a2);
//		System.out.println(" boolean default value" + b2);
//		System.out.println(" char default value" + c2);
//		System.out.println(" long default value" + d2);
//		System.out.println(" float default value" + f2);
//		System.out.println(" double default value" + g2);
	

	}

}
