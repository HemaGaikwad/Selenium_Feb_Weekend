package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts extends AnnotationsDemo
{
	@Test
	public void createUser()
	{
		Reporter.log("User created successfully", true);
		
	}	
	@Test
	public void editUser()
	{
		Reporter.log("User info has been edited", true);
	}
	
	@Test
	public void deleteUser()
	{
		Reporter.log("User deleted successfully", true);
	}

}
