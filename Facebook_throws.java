package com.Exceptions;
import java.util.Scanner;
public class Facebook_throws {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try
		{
			age_valid(age);
		}
		catch(Exception e)
		{
			System.out.println("Age should be above 18 years");
		}
	}
	public static void age_valid(int age)throws ArithmeticException
	{
		if(age<18)
		    {
			
				throw new ArithmeticException();
			}
		else
		{
			System.out.println("Age accepted");
		}
		
	}

}
