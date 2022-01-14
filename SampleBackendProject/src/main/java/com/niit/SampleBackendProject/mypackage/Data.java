package com.niit.SampleBackendProject.mypackage;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Data
{
	private static final Logger LOG = LogManager.getLogger(Data.class);
	public int first , second ;
	public double result;
	
	public void acceptTwo()
	{
		LOG.info("Data.acceptTwo() called");
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter two numbers :");
		first = sc.nextInt();
		second = sc.nextInt();
	}

	public void acceptOne()
	{
		LOG.info("Data.acceptOne() called");
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter radian :");
		first = sc.nextInt();
		
	}

	public void display()
	{
		LOG.info("Data.display() called");
		System.out.println("Result of the calculation is : " + result);
	}
}	
