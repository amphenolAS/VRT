/**
* @author manoj.ghadei
*
*/

package com.vrt.pages;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vrt.base.BaseClass;
import com.vrt.utility.TestUtilities;

public class RW_DefineQual_ExposurePage extends BaseClass {

	// Page element variable declaration definition
	WebElement ReportParameters = null;

	// Page element Initialize method
	private void initElements() {
		ReportParameters = driver.findElementByAccessibilityId("_nextStageButton");

	}

	// Constructor for initializing the page elements
	RW_DefineQual_ExposurePage() throws IOException {
		super();
		initElements();
	}

// Release memory
	public void resetWebElements() {
		ReportParameters = null;

	}

// click on next btn n select No Btn to navigate Edit parameters page
//Edit Parameters
	public RW_EditParametersPage click_ReportParameters_Btn() throws IOException, InterruptedException {
		clickOn(ReportParameters);
		WebElement No = driver.findElementByAccessibilityId("Button0");
		clickOn(No);
		return new RW_EditParametersPage();

	}

}
