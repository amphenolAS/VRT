/**
 * @author ruchika.behura
 *
 */

package com.vrt.pages;

import java.awt.AWTException;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.vrt.base.BaseClass;

public class EquipmentPage extends BaseClass {

	// EquipmentPage Element definition
	WebElement EquipmentID = null;
	WebElement ModelNumber = null;
	WebElement EquipmentTypeUMDropDown = null;
	WebElement EquipmentSaveButton = null;
	WebElement backBtn = null;

	private void initElements() {
		EquipmentID = driver.findElementByAccessibilityId("EquipmentIDTextBox");
		ModelNumber = driver.findElementByAccessibilityId("ModelNumberTextBox");
		EquipmentTypeUMDropDown = driver.findElementByAccessibilityId("EquipmentTypeComboBox");
		EquipmentSaveButton = driver.findElementByName("Save");
		backBtn = driver.findElementByAccessibilityId("ArrowGlyph");

	}

	EquipmentPage() throws IOException {
		super();
		initElements();
	}
	
	// Release memory
	public void resetWebElements() {
		EquipmentID = null;
		ModelNumber = null;
		EquipmentTypeUMDropDown = null;
		EquipmentSaveButton = null;
		backBtn = null;
	}

	/*----------------------
	Methods of Equipment Page
	------------------------*/
	public void enterNewEquipmentID(String NewUID) {
		ClearText(EquipmentID);
		enterText(EquipmentID, NewUID);
	}

	public void enterLgrSN(String SN) {
		ClearText(EquipmentID);
		enterText(EquipmentID, SN);
	}

	public void enterNewModelNumber(String MNum) {
		ClearText(ModelNumber);
		enterText(ModelNumber, MNum);
	}

	// Select Equipment Type

	public void select_EquipmentType(String Etype) throws InterruptedException {
		// System.out.println(Etype);
		clickOn(EquipmentTypeUMDropDown);
		Thread.sleep(2000);

		WebElement EPSelect = driver.findElementByName("Select");
		//WebElement EPValidator = driver.findElementByName("Validator");
		WebElement EPVRTLogger = driver.findElementByName("VRT Logger");
		//WebElement EPAVS = driver.findElementByName("AVS");
		WebElement EPIRTD = driver.findElementByName("IRTD");
		//WebElement EPBath = driver.findElementByName("Calibration Bath");
		//WebElement EPBaseStation = driver.findElementByName("Base Station");

		if (Etype.equals(EPSelect.getText())) {
			clickOn(EPSelect);
			Thread.sleep(500);
		} else if (Etype.equals(EPVRTLogger.getText())) {
			clickOn(EPVRTLogger);
			Thread.sleep(500);
		} else if (Etype.equals(EPIRTD.getText())) {
			clickOn(EPIRTD);
			Thread.sleep(500);
		} else {
			System.out.println("Incorrect Equipment selected or incorrect text given as input");
		}

	}

	// Click on Save button
	public void ClickSaveButton() throws InterruptedException {
		clickOn(EquipmentSaveButton);
		Thread.sleep(1000);
	}


	// Login Pop up presence
	public boolean UserLoginPopupVisible() throws InterruptedException {
		WebElement LgInPopup = driver.findElementByName("Enter User Credentials");
		return IsElementVisibleStatus(LgInPopup);
	}	
	
	// Enter Mandatory fields and create Equipment
	public void EqipCreation_MandatoryFields(String Etype, String ESN, String EMN)
			throws InterruptedException {
		select_EquipmentType(Etype);
		enterLgrSN(ESN);
		enterNewModelNumber(EMN);
		ClickSaveButton();
	}	

	// Enter Mandatory fields and create Equipment
	public void Logger_EqipCreation_MandatoryFields(String Etype, String LgrType, String ESN)
			throws InterruptedException {
		select_EquipmentType(Etype);
		enterLgrSN(ESN);
		ClickSaveButton();
	}

	// Enter Mandatory fields and create BS Equipment
	public void BaseStation_EqipCreation_MandatoryFields(String Etype, String EID, String EMnum, String McAddress)
			throws InterruptedException {
		select_EquipmentType(Etype);
		enterNewEquipmentID(EID);
		enterNewModelNumber(EMnum);
		WebElement BS_McAdd = driver.findElementByAccessibilityId("MacAddressTextBox");
		ClearText(BS_McAdd);
		enterText(BS_McAdd, McAddress);
		ClickSaveButton();
	}

	//Click on back button 
	public EquipmentHubPage ClickBackBtn() throws InterruptedException, IOException {
		clickOn(backBtn);
		return new EquipmentHubPage();
	}

}
