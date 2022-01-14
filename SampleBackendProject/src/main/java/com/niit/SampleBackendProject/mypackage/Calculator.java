package com.niit.SampleBackendProject.mypackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator extends Data
{
	private static final Logger LOG = LogManager.getLogger(Calculator.class);
	public void add()
	{
		LOG.info("Calculator.add() called");
		result = first + second;
	}

	public void div()
	{
		LOG.info("Calculator.div() called");
		result = first / second;
	}

	public void mul()
	{
		LOG.info("Calculator.mul() called");
		result = first * second;
	}
	
	public void sub()
	{
		LOG.info("Calculator.sub() called");
		result = first - second;
	}
}


