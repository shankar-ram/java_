package excp__;

public class multexception {
	public static void main(String args[]) {
		try {
			int arr[]=new int[7];
			arr[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bound");
		}
		catch(Exception e) {
			System.out.println("Other exception");
		}
		System.out.println("Out of try-catch block");
	}
}
