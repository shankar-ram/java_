package pgm11;


import java.util.Scanner;

public class DigitSum 
{
//	public static void main(String[] args) 
//	{
//		Scanner in=new Scanner(System.in);
//		System.out.print("Enter the number to find digitsum : ");
//		int num=in.nextInt();
//		int sum=num;
//		int fin=0;
//		int fin1=0;
//		String temp=Integer.toString(num);
//		int len=temp.length();
//			for(int i=0;i<len;i++)
//			{
//				System.out.println("1 : " +sum%10);
//				fin=fin+sum%10;
//				if(Integer.toString(fin).length()!=1)
//				{
//					for(int j=0;j<=Integer.toString(fin).length();j++)
//					{
//						System.out.println("2 : " +fin%10);
//						fin1=fin1+fin%10;
//						fin=fin/10;
//					}
//					fin=fin1;
//				}
//				sum=sum/10;
//			}
//		System.out.println("3 : " +fin);
//	}
	
	public static void calc(int num) 
	   { 
	    int sum = 0;  
	    while(num > 0 || sum > 9) 
	    { 
	        if(num == 0) 
	        { 
	            num = sum; 
	            sum = 0; 
	        } 
	        sum += num % 10; 
	        num /= 10; 
	    } 
	    System.out.print(sum);
	} 
	public static void main(String args[]){
		   Scanner sc = new Scanner(System.in);
			System.out.print("Enter number:");              
			int n=sc.nextInt();
	        calc(n);
	 }

	
}
