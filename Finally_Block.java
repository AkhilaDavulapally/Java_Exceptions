package com.Exceptions;
public class Finally_Block {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println("Try called");
			System.out.println(0/0);
		}
		finally
		{
			System.out.println("Finally called");
		}
		System.out.println("Main ends");
		}
}
