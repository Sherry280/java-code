import java.util.Scanner;
public class Test4{
	public static int maxTwo(int a,int b){
		return((a>=b)?a:b);
	}
	public static int max(int a,int b,int c){
		//return((maxTwo(a,b)>=c)?maxTwo(a,b):c);
		return(maxTwo(maxTwo(a,b),c));
	}

	public static void main(String[] args) {
		System.out.println(max(15,-2,6));

		
	}
}


// public static void main(String[] args) {
// 	int []a ={1,2,3,4};
// 	System.out.println(change(a));

// 	public static int[] change(int[] l1){
//         if (l1==null&&l1.length<=0){
//             return null;
//         }
//         int i=0;
//         int j=l1.length-1;
//         while (i!=j){
//             while (l1[i]/2==0&&i<j){
//                 i++;
//             }
//             while (l1[j]/2!=0&&i<j){
//                 j--;
//             }
//             int a =l1[i];
//             l1[i]=l1[j];
//             l1[j]=a;
//         }
//         return l1;
//     }
   
//    }


      // public static int max(int )




	
		//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序

    // public static int[] change(int[] arr,int length ){
    // 	if(arr==null||length==0){
    // 		return;
    // 	}
    // 	int begin=0;
    // 	int end=length-1;
    // 	while(begin<end){
    // 		while(begin<end)&&!isEven(arr[begin]){
    // 			begin++;
    // 		}
    // 		while(begin<end)&&!iseven(arr[end]){
    // 			end--;
    // 		}
    // 		if(begin<end){
    // 			int tmp=arr[begin];
    // 			arr[begin]=arr[end];
    // 			arr[end]=tmp;
    // 		}
    // 	}

    // }
    // 	public static boolean isEven(int n){
    // 		return(n&1)==0;
    // 	}
    	
    // public static void main(String[] args) {
    // 		int[] arr={1,2,3,4,5,6};
    // 		change(arr,arr.length);
    // 		for(int i=0;i<arr.length;i++){
    // 			System.out.print(arr[i]+" ");
    // 		}

    // }







		//求斐波那契数列的第n项。(迭代实现)
		// Scanner scan=new Scanner(System.in);
		// int sc=scan.nextInt();

		// int f1=1;
		// int f2=1;
		// int f=0;

		// if(sc==1||sc==2){
		// 		f=1;
		// 		System.out.println(f);
		// }else{
		//     for(int i=3;i<=sc;i++){
		//     	f=f1+f2;
		//     	f1=f2;
		//     	f2=f;
		//     }
		// System.out.println("斐波那契数列第"+sc+"项为： "+f);
	 //    }
		

	
// }




	
		//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
		// public static int findNum(int[] array){
		// 	int ret=0;
		// 	for(int i=0;i<array.length;i++){
		// 		ret^=array[i];

		// 	}
		// 	return ret;
		// }

// 		public static int facSum(int num){
// 			int sum=0;
// 			for(int i=1;i<=num;i++){
// 				// int ret=1;
// 				// for(int j=1;j<=i;j++){
// 				// 	ret*=j;
// 				// }
// 				int ret=fac(i);
// 				sum+=ret;
// 			}
// 			return sum;
// 		}
// 		public static int fac(int num){
// 			int ret=1;
// 			for(int i=1;i<=num;i++){
// 				ret*=i;
// 			}
// 			return ret;

// 		}
//     public static void main(String[] args) {
//     	//求1！+2！+3！+4！+........+n!的和
//     	Scanner scan=new Scanner(System.in);
//     	int x=scan.nextInt();
//     	int sum=facSum(x);
//     	System.out.println(sum);



// 	// 	int[] array={1,3,4,5,4,3,1};
// 	// 	System.out.println(findNum(array));
// 	  }

// }











