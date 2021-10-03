package lex;

import java.util.*;

public class Sortstrings {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		String []words= new String[5];
		System.out.println("Enter names");              
        for (int i = 0; i < 5;i++){

            words[i] = sc.nextLine();
        }
        for (int i = 0; i < 5;i++){
        	
        	for (int j = 0; j < 5-i-1;j++){
        		if (words[i].compareTo(words[j+1]) > 0)
        		{
        			String temp=words[j];
        			words[j]=words[j+1];
        			words[j+1]=temp;
        		}
                
            }
        }
        for(int i=0;i<5;i++)
        {
        	System.out.print(words[i]+ " ");
        }
	}
	
}
