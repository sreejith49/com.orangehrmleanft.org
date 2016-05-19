package com.orangehrmleanft.org;

import org.junit.Test;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.CSSDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.WebElement;

public class TestOrangeHrm extends LeanFtTest{
	
	public static void textBoxField(String id, String text){
		EditField field;
		
		try {
			
			field = browser.describe(EditField.class, new EditFieldDescription.Builder().id(id).build());
			field.setValue(text);
			
		} catch (GeneralLeanFtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void buttonField(String id){
		Button field;
		
		try {
			
			field = browser.describe(Button.class, new CSSDescription(id));
			field.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	@Test
	public void testOrangeHrm(){
		
		try {
						
						
			WebElement menuPim = browser.describe(WebElement.class, new CSSDescription("a[id='menu_pim_viewPimModule']"));
			WebElement menuAddEmployee = browser.describe(WebElement.class, new CSSDescription("a[id='menu_pim_addEmployee']"));
			EditField txtFirstName = browser.describe(EditField.class, new CSSDescription("input[id='firstName']"));
			
			
			textBoxField("txtUsername","admin");
			textBoxField("txtPassword","Password01");			
			buttonField("input[id='btnLogin']");
			
			menuPim.click();
			menuAddEmployee.click();
			txtFirstName.setValue("Sreejith");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
