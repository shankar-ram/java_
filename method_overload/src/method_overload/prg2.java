package method_overload;
import java.util.*;
import java.io.*;
class operations{
	void printing(int x) {
		System.out.println("the value is"+x);
	}
	void equality(int a,int b) {
		System.out.println("checking whether the values of a and b are equal:");
		if(a==b)
			System.out.println("answer is :"+true);
		else
			System.out.println("answer is :"+false);
	}
}
   class prg2{
	public static void main(String []args) {
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the elements a and b:");
	a=s.nextInt();
	b=s.nextInt();
	 operations obj=new operations();
	 obj.printing(a);
	 obj.printing(b);
	 obj.equality(a,b);
	}
	}
