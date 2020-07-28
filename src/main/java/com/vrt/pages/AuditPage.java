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
import com.vrt.pages.EquipmentPage;
import com.vrt.base.BaseClass;

public class AuditPage extends BaseClass {
	
	// FileManagementPage Element definition
	WebElement Audit_HeadTitle = null;
	WebElement ActionFilter_Icon = null;
	
	
	void initElements() {
		Audit_HeadTitle = driver.findElementByName("Audit Trail");	
		ActionFilter_Icon = driver.findElementByAccessibilityId("PART_FilterButton");
		
		

	}
	
	AuditPage() throws IOException
	{
		super();
		initElements();

	}
	
	// Release memory
		public void resetWebElements() {
			ActionFilter_Icon = null;
	
		}
		
		
		
	// Audit TextBox is Visible
		public boolean AuditHeadTitleVisible() throws InterruptedException {
			return IsElementVisibleStatus(Audit_HeadTitle);
		}	
		
// Fetch the alert message when a user does not have privilege to access
		public String AlertMsg() {
			WebElement Msg = driver.findElementByAccessibilityId("displayMessageTextBlock");
			return FetchText(Msg);
		}
		
 // Click on Action filter icon to open the filter
		
		public void Click_ActionFilter_Icon() {
		List<WebElement> filtericon = driver.findElementsByAccessibilityId("PART_FilterButton");
		filtericon.get(3).click();
		}
		
 //Click on Action Filter (ok)Btn to get the filter result
				
	public AuditPage  click_Action_FilterBtn() throws IOException, InterruptedException {
	WebElement FilterButton = driver.findElementByAccessibilityId("PART_FilterButton");
	clickOn(FilterButton);
	//Thread.sleep(3000);
	return new AuditPage();
					
					//WebElement msg = driver.findElementByName("Asset : \"Asset01\" ,\" Asset ID : 02 \" is modified by User ID : \"1\" , User Name :\" User1\" .");
		//Setup: "manual 1 min sampling" is modified in Tab : "Define Setup" by User ID : "1" , User Name: "User1"			
					
						}
		
 // Enter value into Action filter text box
	
		public void EnterTxt_ActionFilter(String val) {
				WebElement ActionFltr_ValueBox = driver.findElementByAccessibilityId("PART_ValueBox");
				clickOn(ActionFltr_ValueBox);
				ClearText(ActionFltr_ValueBox);
				enterText(ActionFltr_ValueBox, val);
				}
		
	//Verify that the below details is displaying 	when user filter the paticular action
		public boolean isAssetEditedResult_Display() {
		WebElement msg = driver.findElementByName("5F106AB18C04BA15FD2A");
			//
		return IsElementVisibleStatus(msg);
			
		}
		//5F106AB18C04BA15FD2A
		
}
//Setup: "manual 1 min sampling" is modified in Tab : "Define Setup" by User ID : "1" , User Name: "User1""

		