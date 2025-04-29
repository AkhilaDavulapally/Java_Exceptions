package com.Exceptions;
import java.util.Scanner;
public class Multiple_Catches
	{
		public static void main(String[] args) 
		{
			System.out.println("Main starts");
			Scanner sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter first number");
				int a=sc.nextInt();
				System.out.println("Enter the second number");
				int b=sc.nextInt();
				System.out.println(a/b);
				int a1[]= {1,2,3,4,5};
				System.out.println("Enter the index to print the the element");
				int i=sc.nextInt();
				System.out.println(a1[i]);
				String name="Hello";
				System.out.println(name.charAt(5));
				String s=null;
				System.out.println(s.length());
			}
			catch(ArithmeticException e1)
			{
				System.out.println(e1.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println(e2.getMessage());
			}
			catch(StringIndexOutOfBoundsException e3)
			{
				System.out.println(e3.getMessage());
			}
			catch(NullPointerException e4)
			{
				System.out.println(e4.getMessage());
			}
			System.out.println("Main ends");
		}
		
}
