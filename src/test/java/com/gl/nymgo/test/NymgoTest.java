package com.gl.nymgo.test;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import nymgo.framework.DriverManager;
import nymgo.pages.MainPage;
import nymgo.pages.SignInPage;

public class NymgoTest {
	@Test
	public void testLoginPage() {
		
		
		
		
		SignInPage signinPage = new MainPage(DriverManager.getFirefoxDriver())
		.load()
		.waitToBeAvailable()
		.clickbtnSignIn()
		.loginAsWrongUser("", "");

		if (signinPage.getInUsername().getText().equals("Username is required")) {
			Assert.fail();
		}
		MatcherAssert.assertThat("Password Error wrong", signinPage.getPasswordError().getText(), equalTo("Password is required"));

	}


}
