package com.qa.hs.test;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeywordEngine;

public class LoginTest {

	public KeywordEngine keywordEngine;	
	
	@Test
	public void loginTest() {
		keywordEngine = new KeywordEngine();
		keywordEngine.startExecution("login");
	}
	
}
