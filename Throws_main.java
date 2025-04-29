package com.Exceptions;
import java.util.*;
public class Throws_main {
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
	public static void m1()throws ArrayIndexOutOfBoundsException
	{
		System.out.println("m1 starts");
		int a[]= {1,2,3,4,5};
		System.out.println(a[5]);
		System.out.println("m2 ends");
	}

}
