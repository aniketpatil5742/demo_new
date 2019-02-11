package Custome;

import java.util.Scanner;

public class A {

	
	Scanner sc=new Scanner(System.in);
	
	
	 void m() 
	{
		System.out.println("Enter age");
		int age=sc.nextInt();
		try{
			
		
		if (age< 20)
		{
			throw new AgeNotValid("Age is under 20");
		}
		}catch(AgeNotValid a){
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
	
		A a=new A();
		a.m();
	}
}
