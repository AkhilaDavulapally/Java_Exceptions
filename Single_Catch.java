package com.Exceptions;
import java.util.Scanner;
public class Single_Catch {
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
				catch(ArithmeticException |ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException |NullPointerException e)
				{
					System.out.println(e.getMessage());
				}
				
				System.out.println("Main ends");
			}

}
