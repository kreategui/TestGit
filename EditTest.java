package com.dice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dice.base.BaseTest;
import com.dice.pages.LogInPage;
import com.dice.pages.EditPage;
import com.dice.pages.ProfilePage;

public class EditTest extends BaseTest{

	
	@Test
	public void positiveLoginTest() throws InterruptedException  {
		LogInPage LogInPage = new LogInPage(driver);
	//	PopupPage PopupPage = new PopupPage(driver);
		
		//String expectedPageTitle = "Allow employers to search and view your profile";
		String CorrectProfileName = "Profile";
		String CorrectProfileName2 = "KAREN";
		String CorrectProfileName3 = "KAREN";
		
		//Open login page
		LogInPage.openLogInPage();
		
		//Fill email and password
		LogInPage.fillEmailandPassword("kaaa@hotmail.com", "User1234");
		
		
		//Push submit button and wait for page to load
		ProfilePage profilePage = LogInPage.pushinInbutton(); //it will return profile page after pressing sign in button
		
		//LogInPage.pushinInbutton();
		profilePage.waitForProfilePageToLoad();
		
		
		//Verify the another correct name in the screen
		Assert.assertTrue(profilePage.isCorrectProfileLoaded2(CorrectProfileName2),"Name is not expected");
		System.out.println("Page name found");
		
		//Verify the correct name/*//
		Assert.assertTrue(profilePage.isCorrectProfileLoaded(CorrectProfileName),"Name is not expected");
		System.out.println("User name found");
		
	
		//Click on edit button
		
		EditPage editPage = ProfilePage.clickedit(); //it will return editpage page after clicking link
		System.out.println("Edit button found and working");
	//	popupPage.waitForPopupLoad();
	
		
		editPage.waitForEditPageLoad2();


		
	/*	Assert.assertTrue(editPage.isCorrectProfileLoaded3(CorrectProfileName3),"Name in edit page is not expected");
		System.out.println("Label name found");
	*/	
		
		//Press done button
		
	/*	editPage.clickdone();
		System.out.println("Done button was clicked");
	*/	
	//	editPage.wait(400);
		
		//Click on link
		editPage.clicklink(); //it will return editpage page after clicking link
		System.out.println("Link found and clickable");
		
		//Edit linkedin link
		EditPage.filllinkedin("https://www.linkedin.com/");
		
		
		//Edit twitter link
		EditPage.fillingtwitter("https://twitter.com/");
		
		//Done button 
		EditPage.clickdone();
		System.out.println("Saved changes");
	}
}

//change