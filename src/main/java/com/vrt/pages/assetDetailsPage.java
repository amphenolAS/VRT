/**
 * @author manoj.ghadei
 *
 */

package com.vrt.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.vrt.base.BaseClass;
import com.vrt.utility.TestUtilities;

public class assetDetailsPage extends BaseClass {

	TestUtilities tu = new TestUtilities();
	// Asset Details element variable declaration definition
	WebElement AssetDetailPageTitle = null;
	WebElement AssetDetail_IDinfo = null;
	WebElement AssetDetail_Mdlinfo = null;
	WebElement AssetDetail_Mfginfo = null;
	WebElement AssetDetail_Typeinfo = null;
	WebElement AssetDetail_Dateinfo = null;
	WebElement BackBtn = null;
	WebElement AssetEditBtn = null;
	WebElement Asset_SetupTile = null;
	WebElement Asset_QualTile = null;
	WebElement Asset_ReportsTile = null;
	WebElement Asset_DocsTile = null;
	WebElement SetupTile_Count = null;
	WebElement QualTile_Count = null;
	WebElement ReportsTile_Count = null;
	WebElement DocsTile_Count = null;
	WebElement UploadDocs_Btn = null;
	WebElement VRTappClose_Btn = null;
	WebElement InitiateQual_Btn = null;
	WebElement SetupsHeaderTxt = null;
	WebElement NewSetupCreate_Btn = null;
	WebElement CopySetup_Btn = null;
	WebElement AssetEdit_Btn = null;
	WebElement AssetHub_ImgHldr = null;
	WebElement AssetHub_ImgHldr_NextBtn = null;
	WebElement AssetHub_ImgHldr_PrvsBtn = null;
	WebElement CopyAsset = null;
	WebElement Print_Button = null;
	WebElement AssetID = null;
	WebElement Model = null;
	WebElement Manufacturer = null;
	WebElement Type = null;
	WebElement LastValidated = null;
	WebElement DeleteIcon = null;
	WebElement Yesbtn = null;

	


	private void initElements() {
		AssetDetailPageTitle = driver.findElementByAccessibilityId("AssetsNameTextBlock");
		AssetDetail_IDinfo = driver.findElementByAccessibilityId("EquipmentIDTextBlock");
		AssetDetail_Mdlinfo = driver.findElementByAccessibilityId("ModelNoTextBlock");
		AssetDetail_Mfginfo = driver.findElementByAccessibilityId("ManufacturerTextBlock");
		AssetDetail_Typeinfo = driver.findElementByAccessibilityId("TypeTextBlock");
		AssetDetail_Dateinfo = driver.findElementByAccessibilityId("LastValidationTextBlock");
		BackBtn = driver.findElementByAccessibilityId("ArrowGlyph");
		AssetEditBtn = driver.findElementByAccessibilityId("EditAssetsButton");
		Asset_SetupTile = driver.findElementByAccessibilityId("SetupsButton");
		Asset_QualTile = driver.findElementByAccessibilityId("QualificationsButton");
		Asset_ReportsTile = driver.findElementByAccessibilityId("ReportsButton");
		Asset_DocsTile = driver.findElementByAccessibilityId("DocumentsButton");
		SetupTile_Count = driver.findElementByAccessibilityId("SetupsCountTextBlock");
		QualTile_Count = driver.findElementByAccessibilityId("QualificationCountTextBlock");
		ReportsTile_Count = driver.findElementByAccessibilityId("ReportsCountTextBlock");
		DocsTile_Count = driver.findElementByAccessibilityId("DocumentsCountTextBlock");
		VRTappClose_Btn = driver.findElementByAccessibilityId("Close");
		InitiateQual_Btn = driver.findElementByAccessibilityId("StartQualificationButton");
		SetupsHeaderTxt = driver.findElementByAccessibilityId("SetupsHeaderTextBlock");
		NewSetupCreate_Btn = driver.findElementByAccessibilityId("CreateSetupButton");
		CopySetup_Btn = driver.findElementByAccessibilityId("CopySetupButton");
		AssetEdit_Btn = driver.findElementByAccessibilityId("EditAssetsButton");
		AssetHub_ImgHldr = driver.findElementByClassName("Image");
		CopyAsset = driver.findElementByAccessibilityId("CopyAssetsButton");
		AssetID = driver.findElementByName("Asset ID");	
		Model = driver.findElementByName("Model");	
		Manufacturer = driver.findElementByName("Manufacturer");	
		Type = driver.findElementByName("Type");
		LastValidated = driver.findElementByName("Last Validated");
	    DeleteIcon = driver.findElementByAccessibilityId("DeleteAssetsButton");
		

	  
		
	}

	assetDetailsPage() throws IOException {
		super();
		initElements();
	}

 // Check the presence of AssetID field
		public boolean AssetIDPresence() {
			return IsElementEnabledStatus(AssetID);
		}
	
 // Check the presence of AssetID field
				public boolean ModelPresence() {
					return IsElementEnabledStatus(Model);
				}
		
 // Check the presence of AssetHub_ImgHldr field
				public boolean AssetHub_ImgHldrPresence() {
					return IsElementEnabledStatus(AssetHub_ImgHldr);
				}

 //Check the presence of Manufacturer field
				public boolean TypePresence() {
					return IsElementEnabledStatus(Type);
				}
				
 //Check the presence of Manufacturer field
				public boolean ManufacturerPresence() {
					return IsElementEnabledStatus(Manufacturer);
				}
				
 //Check the presence of Manufacturer field
				public boolean LastValidatedPresence() {
					return IsElementEnabledStatus(LastValidated);
				}	
				
 //Check the presence of setupTile_countdata
				public boolean IsSetupTile_countdataPresence() {
					return IsElementEnabledStatus(SetupTile_Count);
				}				
	
	// Check the presence of Setup tile
	public boolean setupTile_state() {
		return IsElementVisibleStatus(Asset_SetupTile);
	}
	
	// Check the presence of Setup tile
		public boolean SetupsHeader_state() {
			return IsElementVisibleStatus(SetupsHeaderTxt);
		}
		
		// Check the presence of Asset DeleteIcon button
				public boolean DeleteIcon_state() {
					return IsElementVisibleStatus(DeleteIcon);
				}	
		
		
		
	// Check the presence of Edit button in set up section
				public boolean SetupEditBtn_state() {
					WebElement Edit_Button = driver.findElementByAccessibilityId("EditButton");
					return IsElementVisibleStatus(Edit_Button);
				}
				
	//Click on Edit button
				public Setup_defineSetupPage Click_SetupEditBtn() throws IOException {
					WebElement Edit_Button = driver.findElementByAccessibilityId("EditButton");
					clickOn(Edit_Button);
					return new Setup_defineSetupPage();
				}

	// check the presence of date under setup
			
				public boolean DateUnder_Setup() {
					WebElement Date = driver.findElementByName("18-Mar-2020 13:11:17");
					return IsElementVisibleStatus(Date);
				}			
				
				
				
	// Check the presence of Print Button in set up section
				public boolean PrintButton_state() {
					WebElement PrintBtn = driver.findElementByAccessibilityId("PrintButton");
					return IsElementVisibleStatus(PrintBtn);
				}			
						
	// Check the presence of WiringImg Button in set up section
				public boolean WiringImgButton_state() {
					WebElement WiringImg_Button = driver.findElementByAccessibilityId("WiringImgButton");
					return IsElementVisibleStatus(WiringImg_Button);
				}
				
				
	//Click on  WiringImg Button in set up section
				public OverlayWiringImagePage Click_WiringImgButton() throws IOException {
					WebElement WiringImg_Button = driver.findElementByAccessibilityId("WiringImgButton");
					clickOn(WiringImg_Button);
					return new OverlayWiringImagePage();
				}	
				
  // Check the presence of Delete Btn in set up section
				public boolean DeleteBtn_state() {
					WebElement DeleteBtn  = driver.findElementByAccessibilityId("DeleteButton");
					return IsElementVisibleStatus(DeleteBtn);
				}			
			
	// Check the Setup tile default selected
	public String get_Setupheader_txt() {
		return FetchText(SetupsHeaderTxt);
	}

	// Get the Setup count data form the Setup tile
	public String setupTile_countdata() {
		return FetchText(SetupTile_Count);
	}

	// click on the setup tile
	public void click_SetupTile() {
		clickOn(Asset_SetupTile);
	}
	
	// click on any setup file
	public void click_Setupfile(String SteupName) {
		WebElement Setup = driver.findElementByName(SteupName);
		clickOn(Setup);
	}

	// Check the enable state of Initiate Qual button under Setup tile
	public boolean InitiateQualBtn_state() {
		return IsElementEnabledStatus(InitiateQual_Btn);
	}
	
	// Click the Initiate Qual button under Setup tile
	public void click_InitiateQualBtn() {
		clickOn(InitiateQual_Btn);
	}
	
	//Check the presence of Sop Number Field
	public boolean IsSOPNumberField_Presence() {
		WebElement SopName_Field = driver.findElementByAccessibilityId("SopProtocolTextBox");
		return IsElementEnabledStatus(SopName_Field);
	}
	
	//Check the presence of Run Number Text Box
		public boolean IsRunNumberField_Presence() {
			WebElement RunNum_Field = driver.findElementByAccessibilityId("RunNumberTextBox");
			return IsElementEnabledStatus(RunNum_Field);
		}
	
	//Enter Value into Sop Protocol Text Box
	  public void Enter_SOPNum(String SOPNum) {
		WebElement SopNum_Field = driver.findElementByAccessibilityId("SopProtocolTextBox");
		clickOn(SopNum_Field);
		ClearText(SopNum_Field);
		enterText(SopNum_Field, SOPNum);
	}
	  
	// Fetch Sop Number Field text
		public String GetSOPNumText() {
			WebElement SopNum_Field = driver.findElementByAccessibilityId("SopProtocolTextBox");
			return FetchText(SopNum_Field);
		}  
	  
	//Enter  Value into Run Number Text Box
		 public void Enter_RunNumber(String RunNum) throws InterruptedException {
			WebElement Run_Field = driver.findElementByAccessibilityId("RunNumberTextBox");
			clickOn(Run_Field);
			ClearText(Run_Field);
			Thread.sleep(500);
			enterText(Run_Field, RunNum);
			}
		 
	// Fetch Run Number Field text
			public String GetRunNumText() {
				WebElement RunNum_Field = driver.findElementByAccessibilityId("RunNumberTextBox");
				return FetchText(RunNum_Field);
			}  
		
	//Click on OK button for SOP creation 
		  public void click_OK_InSOPBlock() {
			WebElement OK_Btn_InSOPBlock = driver.findElementByAccessibilityId("StartQualificationOKButton");
			clickOn(OK_Btn_InSOPBlock);
		}
			
	//	SOP Creation  for valid  value
	  public SelectBaseStationPage Create_SOP(String SNum, String RNum)throws InterruptedException, IOException {
		Enter_SOPNum(SNum);
		Enter_RunNumber(RNum);
		click_OK_InSOPBlock();
		return new SelectBaseStationPage();
		}
	  
   //SOP Creation  for Invalid  value
		  public void Create_SOP_InvalidData(String SNum, String RNum)throws InterruptedException, IOException {
			Enter_SOPNum(SNum);
			Enter_RunNumber(RNum);
			click_OK_InSOPBlock();
			}
		

	// Check the presence of Qual tile
	   public boolean qualTile_state() {
		return IsElementVisibleStatus(Asset_QualTile);
	}

	// click on the Qual tile
	public void click_QualTile() {
		clickOn(Asset_QualTile);
	}

	// Click on delete icon from the qualsection
	public void click_DeleteBtn() {
		WebElement Deletestudy = driver.findElementByAccessibilityId("DeleteButton");
		clickOn(Deletestudy);
	}

	// Check the presence of Delete Popup Window
	public boolean DeletePopupWindowVisible() {
		WebElement Deletewindow = driver.findElementByAccessibilityId("Popup Window");
		return IsElementVisibleStatus(Deletewindow);
	}

	// Get the Qual count data form the Setup tile
	public String qualTile_countdata() {
		return FetchText(QualTile_Count);
	}
	
	//select the qual under qual tile
	public void qualfile() {
		WebElement qualbox = driver.findElementByName("VRT.DataModule.Asset.ViewModels.ActivityItemViewModel");
		clickOn(qualbox);
	}
	
    //application should display alert msg when user doest have access to generatereport
	 public void GenerateReportsBtn() {
		WebElement GenerateReports = driver.findElementByAccessibilityId("GenerateReportsForQualButton");
		clickOn(GenerateReports);
	}	
	 
	// user who has acess  will navigate to next page
	 public RWFileSelctionPage GenerateReportsBtn_Nextpage() throws IOException {
			WebElement GenerateReports = driver.findElementByAccessibilityId("GenerateReportsForQualButton");
			clickOn(GenerateReports);
			return new RWFileSelctionPage();
		}	
	 //Setup_qualreportSelectSensorTypepage
	 
	// Check the presence of Reports tile
	public boolean reportsTile_state() {
		return IsElementVisibleStatus(Asset_ReportsTile);
	}
	
	//Click on Copy to drive
	public void click_Copytodrive() {
		WebElement CopytodriveBox = driver.findElementByName("Copy to drive");
		clickOn(CopytodriveBox);
	}
	
	//Check the presence of Select Folder window is visible
	
	public boolean SelectFolder_PopupWindowVisible() {
		WebElement SelectFolderWindow = driver.findElementByName("Select Folder");
		return IsElementVisibleStatus(SelectFolderWindow);
	}

	// click on the Reports tile
	public void Click_reportsTile() {
		clickOn(Asset_ReportsTile);
	}

	// click on the qualification sub section from Reports tile
	public void Click_QualReportsButton() {
		WebElement QualUnderReport = driver.findElementByAccessibilityId("QualificationReportsButton");
		clickOn(QualUnderReport);
	}

	// click on the Pass/Fail sub section from Reports tile
	public void Click_PassFailReportBtn() {
		WebElement PassFailReport = driver.findElementByAccessibilityId("PassFailReportsButton");
		clickOn(PassFailReport);
	}

	// click on the setup sub section from Reports tile
	public void Click_SetupReportsButton() {
		WebElement SetupReportsButton = driver.findElementByAccessibilityId("SetupReportsButton");
		clickOn(SetupReportsButton);
	}

	// Get the Reports count data form the Setup tile
	public String reportsTile_countdata() {
		return FetchText(ReportsTile_Count);
	}

	// Check the presence of Docs tile
	public boolean docsTile_state() {
		return IsElementVisibleStatus(Asset_DocsTile);
	}

	// Get the Docs count data form the Docs tile
	public String docsTile_countdata() {
		return FetchText(DocsTile_Count);
	}

	// Click the Asset Docs tile button
	public void click_DocsTileBtn() throws InterruptedException {
		clickOn(Asset_DocsTile);
		Thread.sleep(1000);
	}

	// Click the Upload Docs button under Assets Docs tile
	public void click_UploadDocsBtn() throws InterruptedException {
		UploadDocs_Btn = driver.findElementByAccessibilityId("UploadDocumentsButton");
		clickOn(UploadDocs_Btn);
		Thread.sleep(2000);
	}

	// Get the Asset details Page header data for the corresponding Asset
	public String assetDetail_PageTitle() {
		return FetchText(AssetDetailPageTitle);
	}
	
	
	//verify the presence of the assetDetail PageTitle
	
	public boolean assetDetailPageTitle_Visible() {
		return IsElementVisibleStatus(AssetDetailPageTitle);
	}

	

	// Get the Asset ID data for the corresponding Asset
	public String get_asset_IDinfo() {
		return FetchText(AssetDetail_IDinfo);
	}

	// Get the Asset Model data for the corresponding Asset
	public String get_asset_Modelinfo() {
		return FetchText(AssetDetail_Mdlinfo);
	}

	// Get the Asset Manufacturer data for the corresponding Asset
	public String get_asset_Mfginfo() {
		return FetchText(AssetDetail_Mfginfo);
	}

	// Get the Asset Type data for the corresponding Asset
	public String get_asset_Typeinfo() {
		return FetchText(AssetDetail_Typeinfo);
	}

	// Get the Asset Last Validated data for the corresponding Asset
	public String get_asset_LastValidatedinfo() throws ParseException {
		String Dt = FetchText(AssetDetail_Dateinfo);
		return tu.convert_StringDate_to_ActualDate_inCertainFormat(Dt);
	}

	// Check the presence of Asset edit button
	public boolean assetEditBtn_state() {
		return IsElementVisibleStatus(AssetEditBtn);
	}
	
	// Check the presence of Asset DeleteIcon button
		public boolean NewSetupCreate_Btn_Visible() {
			return IsElementVisibleStatus(NewSetupCreate_Btn);
		}
		
	// Check the presence of Asset Copy button
			public boolean CopyAsset_state() {
				return IsElementVisibleStatus(CopyAsset);
			}

	// Click the Asset edit button
	public assetCreationPage click_assetEditBtn() throws InterruptedException, IOException {
		clickOn(AssetEditBtn);
		Thread.sleep(1000);
		return new assetCreationPage();
	}

	// Click the Asset edit button to get alert msg..when admin does not have the
	// privilege to edit the asset
	public void click_assetEditBtn_alrt() throws InterruptedException {
		clickOn(AssetEditBtn);
		Thread.sleep(1000);
	}

	// Fetch the alert message when admin not have the privilege to edit the asset
	public String AlertMsg() {
		WebElement Msg = driver.findElementByAccessibilityId("displayMessageTextBlock");
		return FetchText(Msg);
	}

	// Click the Back Button
	public assetHubPage ClickBackBtn() throws InterruptedException, IOException {
		clickOn(BackBtn);
		//Thread.sleep(1000);
		return new assetHubPage();
	}

	// Get the Asset info in Asset details page
	public String[] get_assetinfo() throws ParseException {
		String[] asstDetailinfo = new String[6];
		asstDetailinfo[0] = get_asset_IDinfo();
		asstDetailinfo[1] = get_asset_Modelinfo();
		asstDetailinfo[2] = get_asset_Mfginfo();
		asstDetailinfo[3] = get_asset_Typeinfo();
		asstDetailinfo[4] = get_asset_LastValidatedinfo();
		String[] AsstTitle = assetDetail_PageTitle().split(" - ");
		asstDetailinfo[5] = AsstTitle[1];

		return asstDetailinfo;
	}

	// Click new Setup create button
	public Setup_defineSetupPage click_NewStupCreateBtn() throws InterruptedException, IOException {
		clickOn(NewSetupCreate_Btn);
		//Thread.sleep(1000);
		return new Setup_defineSetupPage();
	}

	// Fetch the alert message when does not have access to on new Setup create
	// button
	public void click_NewStupCreateBtn_alert() throws InterruptedException {
		clickOn(NewSetupCreate_Btn);
		Thread.sleep(1000);
	}

	
	
	
	
	// Click Copy Setup button
	public CopySetuppage click_CopyStup_Btn() throws InterruptedException, IOException {
		clickOn(CopySetup_Btn);
		Thread.sleep(1000);
		return new CopySetuppage();
	}

	/*
	 * // Click the Asset Edit button public assetCreationPage click_AssetEditBtn()
	 * throws InterruptedException { clickOn(AssetEdit_Btn); Thread.sleep(1000);
	 * return new assetCreationPage(); }
	 */

	// Click VRT app close button
	public void click_vrtAppcloseBtn() throws InterruptedException {
		clickOn(VRTappClose_Btn);
		Thread.sleep(1000);
	}

	// Upload Documents method under Asset details page
	public void uploadDoc_Assetdetails(String filename) throws AWTException, IOException, InterruptedException {

		// switch to the file upload window
		WebElement alert = driver.switchTo().activeElement();
		Thread.sleep(1000);

		// enter the filename
		String filepath = System.getProperty("user.dir") + "\\TestData\\" + filename;
		// System.out.println(filepath);
		alert.sendKeys(filepath);
		Thread.sleep(1000);

		// hit enter
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// switch back
		driver.switchTo().activeElement();
	}

	// Verify if duplicate doc alert message displayed
	public String alertMeg_duplicateDocupload_Assetdetails() throws InterruptedException {

		WebElement alertMsg = driver
				.findElementByName("Another file with same name already exists. Please use different name.");
		Thread.sleep(1000);
		// System.out.println(alertMsg.getAttribute("Name"));
		String msg = alertMsg.getAttribute("Name");
		return msg;
	}

	// Verify if More than One Asset required for copy setup alert message displayed
	public String alertMeg_CopyAsset_WithOneAsset() throws InterruptedException {

		WebElement alertMsg = driver.findElementByName("To perform Copy Setup more than 1 asset required.");
		Thread.sleep(1000);
		// System.out.println(alertMsg.getAttribute("Name"));
		String msg = alertMsg.getAttribute("Name");
		return msg;
	}

	// click Next button of the Asset Image Holder
	public void click_ImgNextkBtn() throws InterruptedException {
		clickOn(AssetHub_ImgHldr);
		Thread.sleep(500);
		AssetHub_ImgHldr_NextBtn = driver.findElementByAccessibilityId("NextButtonHorizontal");
		clickOn(AssetHub_ImgHldr_NextBtn);
		clickOn(SetupsHeaderTxt);
		Thread.sleep(5000);
		// clickOn(AssetHub_ImgHldr);
	}

	// click Previous button of the Asset Image Holder
	public void click_ImgPrevkBtn() throws InterruptedException {
		clickOn(AssetHub_ImgHldr);
		Thread.sleep(500);
		AssetHub_ImgHldr_PrvsBtn = driver.findElementByAccessibilityId("PreviousButtonHorizontal");
		clickOn(SetupsHeaderTxt);
		Thread.sleep(5000);
		// clickOn(AssetHub_ImgHldr);
	}

	public void Capture_AsstImg(String Img_Name) throws IOException {
		TestUtilities tu = new TestUtilities();
		tu.capture_element_screenshot(driver, AssetHub_ImgHldr, "TestData", Img_Name);
	}

	// Click on Delete Icon
	public void DeleteAssert() {
		clickOn(DeleteIcon);
	}

	// Verify delete pop up window displayed
	public boolean Deletepopupwindow() {
		WebElement dp = driver.findElementByAccessibilityId("Popup Window");
		return IsElementVisibleStatus(dp);
	}
	// Click on "Yes" button from the delete confirmation pop-up
		public assetHubPage Delete_ClickYesBtn() throws InterruptedException, IOException {
			Yesbtn = driver.findElementByAccessibilityId("Button1");
			clickOn(Yesbtn);
			return new assetHubPage();
		}
		
		//Click on Yes Btn with files
		public void YesBtn_WithFiles() throws InterruptedException, IOException {
			Yesbtn = driver.findElementByAccessibilityId("Button1");
			clickOn(Yesbtn);
		}
		
		// Click on "No" button from the delete confirmation pop-up
		public void Delete_ClickNoBtn() throws InterruptedException {
			WebElement Nobtn = driver.findElementByAccessibilityId("Button0");
			clickOn(Nobtn);
		}
	
	
	
	
	
	//Click on Copyasset button
		public Copyassetpage clickCopyasset() throws InterruptedException, IOException
		{
			clickOn(CopyAsset);
			Thread.sleep(500);
			return new Copyassetpage();
		}
		
		// select a setup 
		
		public void Click_SetupName(String SN) throws InterruptedException, IOException {

			List<WebElement> SetupList = driver.findElementByName("VRT.DataModule.Asset.ViewModels.ActivityItemViewModel")
					.findElements(By.className("TextBlock"));
			// Loop for the different serial number created
			for (int i = 0; i < SetupList.size(); i++) {

				List<WebElement> SETUPTileInfoList = SetupList.get(i).findElements(By.className("TextBlock"));

				// Fetch all the contents of the Asset tile
				for (int j = 0; j < SETUPTileInfoList.size(); j++) {
					// System.out.println("AssetTileInfo: "+IRTDTileInfoList.get(j).getText());

					if (SETUPTileInfoList.get(j).getText().equals(SN)) {
						clickOn(SETUPTileInfoList.get(j));
						//Thread.sleep(1000);
						break;
					} else {
							Actions ac = new Actions(driver);
							ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
						}
					}
				}
					
		}
		
	// ||Hard code || click on set up file
		
		public void ClickSetup_file() throws InterruptedException, IOException {
			WebElement Setupname = driver.findElementByName("Qual_case_51");
			clickOn(Setupname);
		}
		
		
 //Click on CopyToDrive_Btn
		public void SETUP_CopyToDrive_Btn(String filename) throws AWTException, IOException, InterruptedException
		{
			WebElement CopySetupTo_Drive = driver.findElementByAccessibilityId("CopySetupToDriveButton");
			clickOn(CopySetupTo_Drive);
			Thread.sleep(1000);
			tu.uploadDoc("CopySetups");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
 //Print_Button
		public void Click_Print_Button() throws AWTException, IOException, InterruptedException
		{
			Print_Button = driver.findElementByAccessibilityId("PrintButton");	

			clickOn(Print_Button);
		}
		
 // Select and click on Qual file
		
		public void  Select_QualFile(String SN) throws InterruptedException, IOException {

			List<WebElement> QUALList = driver.findElementByName("VRT.DataModule.Asset.ViewModels.ActivityItemViewModel")
					.findElements(By.className("TextBlock"));

			// Loop for the different serial number created
			for (int i = 0; i < QUALList.size(); i++) {
				// System.out.println("serial number : " + IrtdList.get(i).getText());

				List<WebElement> QUALInfoList = QUALList.get(i).findElements(By.className("TextBlock"));
				// System.out.println(" IRTD tile info count: " + IRTDTileInfoList.size());

				// Fetch all the contents of the Asset tile
				for (int j = 0; j < QUALInfoList.size(); j++) {
					// System.out.println("AssetTileInfo: "+IRTDTileInfoList.get(j).getText());

					if (QUALInfoList.get(j).getText().contains(SN)) {
						clickOn(QUALInfoList.get(j));
						Thread.sleep(1000);
						break;
					} else {
						Actions ac = new Actions(driver);
						ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
					}
				}
			}		
		}
		// Select and click on Report file
		
				public void  Select_ReportFile(String SN) throws InterruptedException, IOException {

					List<WebElement> REPORTList = driver.findElementByName("VRT.DataModule.Asset.ViewModels.ActivityItemViewModel")
							.findElements(By.className("TextBlock"));

					// Loop for the different serial number created
					for (int i = 0; i < REPORTList.size(); i++) {
						// System.out.println("serial number : " + IrtdList.get(i).getText());

						List<WebElement> REPORTListInfoList = REPORTList.get(i).findElements(By.className("TextBlock"));
						// System.out.println(" IRTD tile info count: " + IRTDTileInfoList.size());

						// Fetch all the contents of the Asset tile
						for (int j = 0; j < REPORTListInfoList.size(); j++) {
							// System.out.println("AssetTileInfo: "+IRTDTileInfoList.get(j).getText());

							if (REPORTListInfoList.get(j).getText().contains(SN)) {
								clickOn(REPORTListInfoList.get(j));
								Thread.sleep(1000);
								break;
							} else {
								Actions ac = new Actions(driver);
								ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
							}
						}
					}		
				}
				
				// Select and click on Doc file
				
				public void  Select_DocFile(String DC) throws InterruptedException, IOException {

					List<WebElement> REPORTList = driver.findElementByName("VRT.DataModule.Asset.ViewModels.ActivityItemViewModel")
							.findElements(By.className("TextBlock"));

					// Loop for the different serial number created
					for (int i = 0; i < REPORTList.size(); i++) {
						// System.out.println("serial number : " + IrtdList.get(i).getText());

						List<WebElement> REPORTListInfoList = REPORTList.get(i).findElements(By.className("TextBlock"));
						// System.out.println(" IRTD tile info count: " + IRTDTileInfoList.size());

						// Fetch all the contents of the Asset tile
						for (int j = 0; j < REPORTListInfoList.size(); j++) {
							// System.out.println("AssetTileInfo: "+IRTDTileInfoList.get(j).getText());

							if (REPORTListInfoList.get(j).getText().contains(DC)) {
								clickOn(REPORTListInfoList.get(j));
								Thread.sleep(1000);
								break;
							} else {
								Actions ac = new Actions(driver);
								ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
							}
						}
					}		
				}
					
				
	//CopyToDrive Btn in QUAL sub group
		public void CopyQualToDrive_Btn(String filename) throws AWTException, IOException, InterruptedException {
			WebElement CopyQualTo_Drive = driver.findElementByAccessibilityId("CopyQualToDrive");
			clickOn(CopyQualTo_Drive);
				Thread.sleep(1000);
				tu.uploadDoc("CopyQUAL");
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		
  //CopyToDrive Btn in Setup Reports
	
		public void CopyReportToDrive_Btn(String filename) throws AWTException, IOException, InterruptedException {
			WebElement CopyToDrive_Report = driver.findElementByAccessibilityId("CopyReportToDrive");
			clickOn(CopyToDrive_Report);
				Thread.sleep(1000);
				tu.uploadDoc("CopyReports");
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		
	//CopyToDrive Btn in Document Reports
		
			public void CopyToDrive_Document(String filename) throws AWTException, IOException, InterruptedException {
				WebElement CopyToDrive_Document_btn = driver.findElementByAccessibilityId("CopyDocumentToDrive");
				clickOn(CopyToDrive_Document_btn);
					Thread.sleep(1000);
					tu.uploadDoc("CopyDoc");
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
	//verify the presence of the setup
			
			public boolean SetupName_Visible() {
				WebElement Setupname = driver.findElementByName("manual 1 min sampling");
				return IsElementVisibleStatus(Setupname);
			}
			
	//not able to delete
			public void ClickOK_btn() throws InterruptedException {
				driver.switchTo().activeElement();
				Thread.sleep(1000);
				WebElement OK_btn = driver.findElementByAccessibilityId("OK");
				clickOn(OK_btn);
				driver.switchTo().activeElement();
				Thread.sleep(500);
				
			}
		
			
}
