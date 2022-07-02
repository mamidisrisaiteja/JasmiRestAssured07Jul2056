package demo;

public class DataTypes {
	static int a=10;
	static boolean a1=true;
	static char b='j';
	static long c=123456;
	static float d=1.000008f;
	static double e=2.100000000000000;
	//static int a2=6.01f;  //cannot convert float to int we get compile time error for this the 
//	solution is to type cast the data type     (explicit type casting) explicit=to be specified by us
	
	//static int a3=(int)a2;
	
	static float f1=59;
	static float f2=f1;   //(implicit type casting, no need to specify type casting)  implicit =automatic
	static long i=834567890L;
    static int i1=(int)i;  // explicit type casting (we need to type caste by specifing the type cast operators)
	static double f3=4.000000000088888888888888d;
	static float f4=(float)f3;//conversion of double to float
	
	
	
	public static void main(String[] args) {
		System.out.println(" default value of f2  " + f2);
		System.out.println(" default value of i1  " + i1);
		System.out.println(" default value of f4  " + f4);

	}

}
