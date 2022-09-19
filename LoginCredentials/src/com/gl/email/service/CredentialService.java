package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService {

	public String generatePassword()
	{
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCase="abcdefghijklmnopqrstuvwxyz";
		String number="0123456789";
		String splChar="!@#$%^&*()_";
		String bigString=caps+smallCase+number+splChar;
		Random random = new Random() ;
		char[] password = new char[8];	
		for (int i=0; i<8; i++)
		{
			password[i] = bigString.charAt(random.nextInt(bigString.length()));
		}
		
	return new String(password);
	}
		 
	public String generateEmailAddress(String fstName, String lastName, String Dpt)
	{
		return fstName+lastName+"@"+Dpt+"."+"gl.com";
				
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		
		System.out.println("Dear "+emp.getFstName() +" "+ "your generated credentials are as follows");
		
		System.out.println("Email  --->" + email);
		
		System.out.println("Password  --->" + password);
		
	}


}
