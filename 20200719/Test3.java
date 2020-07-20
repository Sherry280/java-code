import java.util.Scanner;
//import java.lang.System;
public class Test3{
	public static void main(String[] args) {
		//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=31;i>=1;i-=2){
			System.out.print(((num>>i)&1)+" ");
		}
		System.out.println();

		for(int i=30;i>=0;i-=2){
			System.out.print(((num>>i)&1)+" ");
		}








		//求一个整数，在内存当中存储时，二进制1的个数。
		// Scanner scan=new Scanner(System.in);
		// int num=scan.nextInt();
		// int count=0;
		// for(int i=0;i<31;i++){
		// 	if((num&1)!=0){
		// 		count++;
		// 		num=num>>i;
		// 	}
		// }
		// System.out.println(count);



		//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
		//提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。
		//三次均错，则提示退出程序
		// int count=3;
		// Scanner scan=new Scanner(System.in);
		// while(count!=0){
		// 	System.out.println("请输入你的密码：");
		// 	String password=scan.nextLine();
		// 	if(password.equals("123")){
		// 		System.out.println("登录成功");
		// 		break;

		// 	}else{
		// 		count--;
		// 		System.out.println("密码错误，你还有"+count+"次机会");
		// 	}
		// }



		//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
		// Scanner scan=new Scanner(System.in);
		// int num=scan.nextInt();
		// while(num!=0){
		// 	System.out.print(num%10+" ");
		// 	num/=10;
		// }




		//打印水仙花数
		// Scanner sc=new Scanner(System.in);
		// int num=sc.nextInt();
		// int i=1;
		// for(i=1;i<=num;i++){
		//  int tmp=i;
		//  int count=0;
		//  while(tmp!=0){
		//  	count++;
		//  	tmp=tmp/10;
		//  }
		//  tmp=i;
		//  int sum=0;
		//  while(tmp!=0){
		//  	sum+=Math.pow(tmp%10,count);
		//  	tmp=tmp/10;
		//  }
		
		//  if(sum==i){
		//  	System.out.println(i);
		//  }
		// }


		//求两个正整数的最大公约数
		// int a=24;
		// int b=18;
		// int c=a%b;
		// while(c!=0){
		// 	a=b;
		// 	b=c;
		// 	c=a%b;
		
		// }
		// System.out.println(b);



		//计算1/1-1/2+1/3-1/4+...+1/99-1/100
		// double sum=0.0;
		// int flag=1;
		// for(int i=1;i<=100;i++){
		// 	sum+=1.0/i*flag;
		// 	flag=-flag;

		// }
		// System.out.println(sum);
	
		
		//输出乘法口诀表
		// for(int i=1;i<=9;i++){
		// 	for(int j=1;j<=i;j++){
		// 		System.out.print(j+"*"+i+"="+j*i+" ");
		// 	}
		// 	System.out.println();
		// }
		


		//根据年龄打印青年，少年，中年，老年
		// while(true){
		// 	System.out.println("请输入你要判断的年龄");
		// 	Scanner in=new Scanner(System.in);
		// 	int age=in.nextInt();
		// 	if(age<0){
		// 		System.out.println("输入有误，请重新输入");
		// 		continue;
		// 	}
		// 	if(age>=0&&age<=18){
		// 		System.out.println("少年");
		// 		break;
		// 	}
		// 	if(age>=19&&age<=28){
		// 		System.out.println("青年");
		// 		break;
		// 	}
		// 	if(age>=29&&age<=55){
		// 		System.out.println("中年");
		// 		break;
		// 	}
		// 	else{
		// 		System.out.println("老年");
		// 		break;
		// 	}
		// }


		//判断一个数是否为素数
		//  Scanner sc=new Scanner(System.in);
		// System.out.println("请输入你要判断的数字");

		// while(sc.hasNext()){
		// 	boolean isPrime=true;

		// 	int num=sc.nextInt();
		// 	if(num==1||num%2==0&&num!=2){
		// 		isPrime=false;
		// 	}else{
		// 		for(int i=3;i<num;i+=2){
		// 			if(num%i==0){
		// 				isPrime=false;
		// 				break;
		// 			}
		// 		}
		// 	}
		// 	System.out.println(isPrime+"\n请输入需要判断的数字");
		// }
		
		//打印1-100之间的所有素数
		
		// int count=0;
		// int i=1;
		// int j=2;
		// for( i=1;i<=100;i++){
			
		// 	for( j=2;j<i;j++){
		// 		if(i==1){
		// 			break;
		// 		}
		// 		if(i%j==0){
					
		// 			break;
		// 		}
		// 	}
		// 	if(j==i){
		// 			System.out.println(i+" ");
		// 			count++;
		//     }
		// }
		// System.out.println();
		// System.out.println("1-100之间总共有"+count+"个素数");
		

		//打印1000~2000之间的闰年
		// int count=0;
		// int year=1000;
		// while(year<=2000){
		// 	if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0)){
		// 		System.out.println(year);
		// 		count++;
				

		// 	}
		// 	year++;
		// }
		// System.out.println("闰年的总数为"+count);



        //打印100以内9的个数
		// int a=0;
		// int i=1;
		// for(;i<100;i++){
		// 	if(i%10==9){
		// 		a++;
		// 	}
		// 	if(i/10==0){
		// 		a++;
		// 	}
			
		// }
		// System.out.println("数字9出现的次数"+a);
	}
}