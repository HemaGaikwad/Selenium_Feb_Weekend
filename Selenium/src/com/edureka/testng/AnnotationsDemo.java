package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
	
		@BeforeSuite
		public void beforeSuiteMethod()
		{
			Reporter.log("Before Suite", true);
		}
		
		
		@BeforeTest
		public void beforeTestMethod()
		{
			Reporter.log("BeforeTest", true);
			
		}
		
		
		@BeforeClass
		public void beforeClassMethod()
		{
			Reporter.log("Before Class", true);
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			Reporter.log("Before Method", true);
		}
		
		@AfterMethod
		public void afterMethod()
		{
			Reporter.log("After Method", true);
		}
		
		@AfterClass
		public void afterClassMathod()
		{
			Reporter.log("After Class", true);
		}
		
		@AfterTest
		public void afterTestMethod()
		{
			Reporter.log("After Test", true);
		}
		
		
		@AfterSuite
		public void afterSuiteMethod()
		{
			Reporter.log("After Suite", true);
		}
}
