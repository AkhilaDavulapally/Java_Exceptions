package com.Exceptions;
import java.util.*;
public class Facebook_throw {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	age_valid(age);
}
public static void age_valid(int age)
{
	if(age<18)
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println("Age should be above 18 years");
		}
	}
	else
	{
		System.out.println("Age accepted");
	}
	
}
}
