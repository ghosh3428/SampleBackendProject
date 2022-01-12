package com.niit.SampleBackendProject.testMyPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.niit.SampleBackendProject.mypackage.Calculator;

public class TestCalculator 
{

	@Test
	public void testAdd()
	{
		Calculator obj = new Calculator();
		
		//Expected Output 
		//generated output
		
		obj.first = 10;
		obj.second = 20;
		obj.add();
		
		assertEquals("Error" , 30, (int)obj.result);
	}
	
	@Test
	public void testDiv()
	{
		Calculator obj = new Calculator();
		
		//Expected Output 
		//generated output
		
		obj.first = 120;
		obj.second = 20;
		obj.div();
		
		assertEquals("Error" ,6, (int)obj.result);
	}

}
