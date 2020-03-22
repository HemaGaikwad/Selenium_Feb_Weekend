package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNgDemo 
{
		@Test
		public void display()
		{
			Reporter.log("This is my first testng demo method");
			System.out.println();
		}

}
