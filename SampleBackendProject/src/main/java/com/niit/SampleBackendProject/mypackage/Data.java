package com.niit.SampleBackendProject.mypackage;

import java.util.Scanner;

public class Data
{
	public int first , second ;
	public double result;
	
	public void acceptTwo()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter two numbers :");
		first = sc.nextInt();
		second = sc.nextInt();
	}

	public void acceptOne()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter radian :");
		first = sc.nextInt();
	}

	public void display()
	{
		System.out.println("Result of the calculation is : " + result);
	}
}	
