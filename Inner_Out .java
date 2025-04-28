package com.Exceptions;
public class Inner_Out {
	public static void main(String[] args) {
		System.out.println(name());
	}
	public static int name()
	{
		try 
		{
			return 1;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}
}
