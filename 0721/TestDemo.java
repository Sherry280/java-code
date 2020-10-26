public class TestDemo{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int ret=addInt(a,b);
		System.out.println("ret="+ret);

		double c=1.2;
		double d=3.4;
		System.out.println(addDouble(c,d));

	}

	public static int addInt(int x,int y){
		return x+y;
	}
	public static double addDouble(double x,double y){
		return x+y;
	}











	// public static void main(String[] args) {
	// 	int a=10;
	// 	int b=20;

	// 	int ret=add(a,b);

	// }

	// public static int add(int x,int y){
	// 	return x+y;
	// }





	// public static int func(int n){
	// 	if(n<10){
	// 		return n;
	// 	}
	// 	return n%10+fac(n/10);

	// }
	// public static void main(String[] args) {
	// 	int n=1729;
	// 	System.out.println(func(n));
	// }

	// public static int add(int n){
	// 	if(n==1){
	// 		return 1;
	// 	}
	// 	return n+add(n-1);
	// }


	// public static void main(String[] args) {
	// 	int a=5;
	// 	add(5);
	// 	System.out.println(n);
	// }




	// public static void print(int num){
	// 	if(num<10){
	// 		System.out.println(num);
	// 	}
	// 	System.out.print(num%10+" ");
	// }


	// public static void main(String[] args) {
	// 	print(1234);
	

		
	// }
}