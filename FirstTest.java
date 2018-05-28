package com.dice;

import org.testng.annotations.Test;

import com.dice.base.BaseTest;

public class FirstTest extends BaseTest{
	
	@Test
	public void FirstTesmethod() {	
		
		//Open hotmail.com
		driver.get("http://www.hotmail.com");
		System.out.println("Hotmail opened. Test Passed"); //console message
		
	}
	
	

}
