import java.util.Scanner;
import java.util.Random;
public class Test2{
	public static void main(String[] args) {

        /* Random rnd=new Random();
         int random =rnd.nextInt(100)+1;

         while(true) {
   	         System.out.println("请输入你想猜的数字：");
   	         Scanner scan = new Scanner(System.in);
       	     int n=scan.nextInt();
   	         if(n<random){
   		          System.out.println("猜小了！");
     	     } else if(n==random) {
   		          System.out.println("猜对了！");


   	         }else{
   		          System.out.println("猜大了！");
    	     }
        }*/
        
       	int m=0;
       while(m<3){
       	Scanner scan = new Scanner(System.in);
       	int n=scan.nextInt();
       	    while(n==2){
               System.out.println("ok!");
               break;
          	}
       	  System.out.println("失败!");
       	m++;
       }

    }
 }



// 		int num=0;
//          int i=1;
//          while(i<100){
//          	i+=2;
//          	num+=i;
//          }
//          System.out.println(num);

//     }
// }



		// Scanner scan=new Scanner(System.in);
		// int x=scan.nextInt();
		// if(x>0){
		// 	System.out.println(x+"是正数");
		// }else if(x<0) {
		// 	System.out.println(x+"是负数");
		// }else{
		// 	System.out.println(x+"是0");
		// }

	






