package com.Exceptions;
import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gmail id");
		String mail=sc.next();
		try {
			mail_valid(mail);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void mail_valid(String mail) throws User_Defined
	{
		if(mail.endsWith("@gmail.com"))
		{
			System.out.println("Gmail accepted");
		}
		else
		{
			throw new User_Defined();
		}
	}
	
}
