package lex;

import java.util.Arrays;
import java.util.Scanner;

public class Lexicographical 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String[] ls=new String[5];
		System.out.println("Enter five strings : ");
		System.out.print("First : ");
		ls[0]=in.next();
		System.out.print("Second : ");
		ls[1]=in.next();
		System.out.print("Third : ");
		ls[2]=in.next();
		System.out.print("Fourth : ");
		ls[3]=in.next();
		System.out.print("Fifth : ");
		ls[4]=in.next();
		Arrays.sort(ls);
		for(int i=0;i<5;i++)
		{
			System.out.println(ls[i]);
		}
	}
}
