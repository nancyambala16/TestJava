package com.collections.demo;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		
		Login login=new Login();
		if(args.length==2)
		{
			login.validate(args[0], args[1]);
		}
		
		else
		{
			System.out.println("Invalid arguments");
		}
	}
	

}

class Login{
	
	String expUserName="admin";
	String expPass="admin";
	public void validate(String actUserName,String actPass)
	{
		if(actUserName.equals(expUserName)&&actPass.equals(expPass))
		{
			System.out.println("Login Passed");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
}