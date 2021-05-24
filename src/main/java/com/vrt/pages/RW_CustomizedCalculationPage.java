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

public class RW_CustomizedCalculationPage extends BaseClass {

	// Page element variable declaration definition
	WebElement Customize = null;

	// Page element Initialize method
	private void initElements() {
		Customize = driver.findElementByName("Customize");

	}

	// Constructor for initializing the page elements
	RW_CustomizedCalculationPage() throws IOException {
		super();
		initElements();
	}

// Release memory
	public void resetWebElements() {
		Customize = null;

	}

// Customize state

	public boolean is_Customize_Visible() {
		return IsElementVisibleStatus(Customize);

	}

}
