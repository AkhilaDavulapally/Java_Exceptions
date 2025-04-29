package com.Exceptions;
import java.util.*;
public class Multi_Throw_Handle {
		public static void main(String[] args) {
			System.out.println("main start");
			try
			{
				m1();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("main ends");
		}
		public static void m1()throws ArithmeticException,NullPointerException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=sc.nextInt();
			System.out.println(10/a);
			String s=null;
			System.out.println(s.length());
			System.out.println(s.charAt(9));
		}
}
		

