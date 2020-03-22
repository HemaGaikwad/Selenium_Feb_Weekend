package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModuleScripts extends AnnotationsDemo
{
	@Test
	public void createTask()
	{
		Reporter.log("Task created successfully", true);
		
	}	
	@Test
	public void editTask()
	{
		Reporter.log("Task info has been edited", true);
	}
	
	@Test
	public void deleteTask()
	{
		Reporter.log("Task deleted successfully", true);
	}

}
