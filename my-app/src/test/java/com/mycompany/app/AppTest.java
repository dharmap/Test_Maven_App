package com.mycompany.app;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
		String a="1222221";
		// TODO Auto-generated method stub
		System.out.println("its working..");
		if(a.matches("[0-9]+"))
		System.out.println("Sucess");
		else
		System.out.println("Failure");
	}
}
