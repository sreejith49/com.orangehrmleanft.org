package com.orangehrmleanft.org;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.java.Button;
import com.hp.lft.sdk.sap.gui.ButtonDescription;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.verifications.*;
import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {
	
	public static Browser browser;

	public LeanFtTest() {
		//Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
		browser = BrowserFactory.launch(BrowserType.CHROME);			
		browser.navigate("http://192.168.242.190/orangehrm-3.2.1/symfony/web/index.php/auth/login");
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void test() throws GeneralLeanFtException {
		
	}

}
 