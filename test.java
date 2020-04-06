package Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	
	
   WebDriver driver=null;
   Keyword uidriver=new Keyword();
	@Test
	
	public void Admin_login(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    System.setProperty("webdriver.chrome.driver", "C:\\WMC_Online\\WMC_Online\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://rbcadminuat.investcloud.com");
	    
	    //Fill username
	    WebElement username=driver.findElement(By.xpath("(//input[@class='dxeEditArea dxeEditAreaSys'])[1]"));
	    username.sendKeys("rbcadmin@rbc.com");//DS
	    
	  //Fill password
	    WebElement password=driver.findElement(By.xpath("(//input[@class='dxeEditArea dxeEditAreaSys'])[1]"));
	    password.sendKeys("Rbc.Admin.1");
	    
	  //press submit button
	    WebElement submit=driver.findElement(By.xpath("(//img[contains(@id,'SignIn')])[6]"));
	    submit.click();	
	    
	  //press submit button
	    WebElement clientprofile=driver.findElement(By.xpath("//span[contains(text(),'Client Profile')]"));
	    clientprofile.click();
	    
	}
	public void Login() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    System.setProperty("webdriver.chrome.driver", "C:\\WMC_Online\\WMC_Online\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https:/secure-ds.sterbcwealthmanagement.com/Membership/OpenID/Login.ashx?client_id=InvestCloudDSIst&ui_locale=en-ca");
	    
	    //wait(5);
	    
	   // driver.wait(20);
	    //Fill username
	    WebElement username=driver.findElement(By.id("K11"));
	    username.clear();
	    username.sendKeys("4519003123224560");//DS
	    username.sendKeys("4519003190118398");//PHN
	    username.sendKeys("4519003190134130");//RT/ET
	    //Fill password
	    WebElement password=driver.findElement(By.id("Q1"));
	    password.sendKeys("Discovery1");
	    
	    //press submit button
	    WebElement submit=driver.findElement(By.cssSelector("#rbunxcgi > div.row.text-center > div > button"));
	    submit.click();
	
	    //Thread.sleep(20);
	    driver.navigate().refresh();
	    
	    driver.switchTo().alert();
	    WebElement Element=driver.findElement(By.className("wm-visual-design-button"));
	    uidriver.javascriptClick(Element);
	   // Element.click();
	}
	
	public void Get_A_Code(){
		//fill get a code text box
		 WebElement get_a_Code=driver.findElement(By.id("RBCTopPanel.Input.App_SAYT_search"));
		 get_a_Code.sendKeys("WBC");
		 
		 //click on the options
		 WebElement options=driver.findElement(By.xpath("(//div[@class='dx-item dx-list-item dx-item-content dx-list-item-content'])[1]"));
		 WebElement value=driver.findElement(By.xpath("(//div[@class='dx-item dx-list-item dx-item-content dx-list-item-content']//span[2])[1]"));
		 String value1=value.getText();
		 uidriver.javascriptClick(options);
		 
		 WebElement values=driver.findElement(By.xpath("((//div[@class='row'])[2]/div/h2/span[2])[1]"));
		 String value2=values.getText();
		 
		 
		 if(value1.equalsIgnoreCase(value2))
		 {
			 System.out.println("the client redirected to the particular fact set page");
	
		 }
		 
		 driver.navigate().back();
	}
	
	public void DetailQuote_to_HoldingPage(){
		
		//click on portfolio link
		WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
	    uidriver.javascriptClick(portfolio);
		
	    //click on holdings link
	   // WebElement holdings1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[1]"));
	    WebElement holdings2=driver.findElement(By.xpath("//span[contains(text(),'Holdings')]"));
	    uidriver.javascriptClick(holdings2);
	    
	    //click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    uidriver.javascriptClick(cross);
	
	    //click on overview tab
	    WebElement overview=driver.findElement(By.xpath("//span[contains(text(),'Overview')]"));
	    uidriver.javascriptClick(overview);
	    //checkpresent
	    WebElement overview_page=driver.findElement(By.xpath("(//div[contains(@id,'CP_IRBCSumCashInvListApp')])[1]"));
	    System.out.println("overview tab redirected to the respective page successfully");
	    
	    //click on currency tab
	    WebElement currency=driver.findElement(By.xpath("(//span[contains(text(),'Currency')])[1]"));
	    uidriver.javascriptClick(currency);
	    //checkpresent
	    WebElement canadian_dollar=driver.findElement(By.xpath("(//span[contains(text(),'Canadian Dollar')])[1]"));
	    System.out.println("currency tab redirected to the respective page successfully");
	    
	    
	    //click on AssetMix tab
	    WebElement AssetMix=driver.findElement(By.xpath("(//span[contains(text(),'Asset Mix')])[1]"));
	    uidriver.javascriptClick(AssetMix);
	    //checkpresent
	    WebElement assetmix_table=driver.findElement(By.xpath("(//h2[contains(text(),'Asset Mix')])[3]"));
	    System.out.println("AssetMix tab redirected to the respective page successfully");
	    
	    //click on Product_type tab
	    WebElement Product_type=driver.findElement(By.xpath("(//span[contains(text(),'Product Type')])[1]"));
	    uidriver.javascriptClick(Product_type);
	    //checkpresent
	    WebElement common_shares=driver.findElement(By.xpath("(//h2[contains(text(),'Common Shares')])[1]"));
	    System.out.println("Product_type tab redirected to the respective page successfully");
	    
	    driver.navigate().back();
	    
	}
	
	public void Overview_margintable_not()
	{
		//click on portfolio link
		WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
		uidriver.javascriptClick(portfolio);

		//click on holdings link
		WebElement holdings1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[1]"));
		WebElement holdings2=driver.findElement(By.xpath("//span[contains(text(),'Holdings')]"));
		uidriver.javascriptClick(holdings1);

		//click on walk_me
		WebElement walkme=driver.findElement(By.xpath("(//div[contains(@class,'walkme')])[7]"));
		uidriver.javascriptClick(walkme);
		
		
		//click on cross button
		WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
		uidriver.javascriptClick(cross);
		
		
		//click on overview tab
		WebElement overview=driver.findElement(By.xpath("//span[contains(text(),'Overview')]"));
		uidriver.javascriptClick(overview);
		//checkpresent margin/shoftfall table which shld nt be available
		//div[@data-app='IRBCSumMarShort.List.App']/div[@id='CP_IRBCSumMarShortListApp_2_Grid']
			   	    
	}
	
	public void Language_change()
	{
		String TypeLanguage="English";
		
		
		//if(input.get("Type@Language").equalsIgnoreCase("English"))
		if(TypeLanguage.equalsIgnoreCase("English"))
		{
			//click on language toggle
			WebElement Language=driver.findElement(By.xpath("//a[@id='lang-dropdown']"));
			Language.click();
			
			//click on  english
			WebElement English=driver.findElement(By.xpath("//a[@id='lang-dropdown']//following-sibling::ul//li/a[contains(text(),'English') or contains(text(),'Anglais')]"));
			English.click();
		}
		
		//if(input.get("Type@Language").equalsIgnoreCase("French"))
		if(TypeLanguage.equalsIgnoreCase("French"))
		{
			//click on language toggle
			WebElement Language=driver.findElement(By.xpath("//a[@id='lang-dropdown']"));
			Language.click();
			
			//click on  english
			WebElement French=driver.findElement(By.xpath("//a[@id='lang-dropdown']//following-sibling::ul//li/a[contains(text(),'French') or contains(text(),'Fran')]"));
			French.click();
		}
		
	}
	
	public void Verify_Content()
	{
		//click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    uidriver.javascriptClick(cross);
	    
	    
		//if(uiDriver.checkPresentBoolean(""),30)
		{
			WebElement English_Language=driver.findElement(By.xpath("//h2[contains(text(),'Summary')]"));
			System.out.println("Content displayed in English as expected");
		}
		//elseif (uiDriver.checkPresentBoolean(""),30)
		
		{
			WebElement French_Language=driver.findElement(By.xpath("//h2[contains(text(),'Sommaire')]"));
			System.out.println("Content displayed in French as expected");
		}
			
		//else
		{
			System.out.println("Content displayed is failed ");
		}
	}
	
	public void Create_Group()
	{
		String TypeLanguage="English";
		
		if(TypeLanguage.equalsIgnoreCase("English"))
		
		{
		//click on user button
	    //WebElement user=driver.findElement(By.xpath("//div[@class='dx-context-menu-container-border']"));
	    WebElement user=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuSecondary']"));	
	    uidriver.javascriptClick(user);
	    
	    //click on settings button
	    WebElement settings=driver.findElement(By.xpath("//div[@class='dx-submenu']//li/div/div/span/span[contains(text(),'Settings')]"));
	    uidriver.javascriptClick(settings);
	    
	   //click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    uidriver.javascriptClick(cross);
	    
	    //click on account group tab
	    WebElement Account_Group=driver.findElement(By.xpath("//div[@class='dx-tabs-wrapper']//div/div/span[contains(text(),'Account Groups')]"));
	    uidriver.javascriptClick(Account_Group);
	    
	    //click on create new group button
	    WebElement Create_new_group=driver.findElement(By.xpath("//button[contains(@class,'CreateNewGroup')]//div[@class='dx-button-content']/span[contains(text(),'Create')]"));
	    uidriver.javascriptClick(Create_new_group);
	    
	    //switch to latestwindow
	    //write a code for switching
	    //fill the group code
	    WebElement groupname=driver.findElement(By.xpath("//div[contains(@class,'CL_AccountGroupSecureName')]/div/input"));
	    groupname.sendKeys("RBC");
	    
	    //fill the description
	    WebElement descritpion=driver.findElement(By.xpath("//div[contains(@class,'CL_AccountGroupSecureDescription')]/div/input"));
	    descritpion.sendKeys("Royal Bank of canada");
	    
	    //click on the checkbox
	    WebElement checkbox=driver.findElement(By.xpath("(//div[@class='dx-checkbox-container']/span[@class='dx-checkbox-icon'])[6]"));
	    uidriver.javascriptClick(checkbox);
	    
	    //click on Save button
	    WebElement Save=driver.findElement(By.xpath("//div[@class='dx-button-content']/span[text()='Save']"));
	    uidriver.javascriptClick(Save);
	    
	    //verifying the saved message
	    //check present
	    WebElement SuccessMessage=driver.findElement(By.xpath("//div[@class='RBCNicknameToastGreen']/span[contains(text(),'Your Account Group has been created')]"));
	    if(SuccessMessage.isDisplayed())
	    {
	    System.out.println("Account has been created successfully and message displayed in English has been verified ");
	    }
		}
		
		
		if(TypeLanguage.equalsIgnoreCase("French"))
		{
			//click on user button
		    //WebElement user=driver.findElement(By.xpath("//div[@class='dx-context-menu-container-border']"));
		    WebElement user=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuSecondary']"));	
		    uidriver.javascriptClick(user);
		    
		    //click on settings button
		    WebElement settings=driver.findElement(By.xpath("//div[@class='dx-submenu']//li/div/div/span/span[contains(text(),'Paramètres')]"));
		    uidriver.javascriptClick(settings);
		    
		   //click on cross button
		    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
		    uidriver.javascriptClick(cross);
		    
		    //click on account group tab
		    WebElement Account_Group=driver.findElement(By.xpath("//div[@class='dx-tabs-wrapper']//div/div/span[contains(text(),'Groupes de comptes')]"));
		    uidriver.javascriptClick(Account_Group);
			
			//click on create new group button
		    WebElement Create_new_group=driver.findElement(By.xpath("//button[contains(@class,'CreateNewGroup')]//div[@class='dx-button-content']/span[contains(text(),'Créer un nouveau groupe')]"));
		    uidriver.javascriptClick(Create_new_group);
		    
		    //switch to latestwindow
		    //write a code for switching
		    //fill the group code
		    WebElement groupname=driver.findElement(By.xpath("//div[contains(@class,'CL_AccountGroupSecureName')]/div/input"));
		    groupname.sendKeys("RBC");
		    
		    //fill the description
		    WebElement descritpion=driver.findElement(By.xpath("//div[contains(@class,'CL_AccountGroupSecureDescription')]/div/input"));
		    descritpion.sendKeys("Royal Bank of canada");
		    
		    //click on the checkbox
		    WebElement checkbox=driver.findElement(By.xpath("(//div[@class='dx-checkbox-container']/span[@class='dx-checkbox-icon'])[4]"));
		    uidriver.javascriptClick(checkbox);
		    
		    //click on Save button
		    WebElement Save=driver.findElement(By.xpath("//div[@class='dx-button-content']/span[text()='Sauvegarder']"));
		    uidriver.javascriptClick(Save);
		    
		    //verifying the saved message
		    //check present
		    WebElement SuccessMessage=driver.findElement(By.xpath("//div[@class='RBCNicknameToastGreen']/span[contains(text(),'Votre groupe de comptes a été créé')]"));
		    if(SuccessMessage.isDisplayed())
		    {
		    System.out.println("Votre groupe de comptes a été créé/Account created successfully and message displayed in French has been verified ");
		    }
		}
	}
	
	
    public void Activities_Print()
    {
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click on activities link

    	//WebElement Activities1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[2]"));
    	WebElement Activities2=driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
    	uidriver.javascriptClick(Activities2);

    	/*//click on walk_me
    	WebElement walkme=driver.findElement(By.xpath("(//div[contains(@class,'walkme')])[7]"));
    	uidriver.javascriptClick(walkme);*/


    	//click on cross button
    	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
    	uidriver.javascriptClick(cross);
    	
    	//click on print button
    	WebElement print=driver.findElement(By.xpath("//button/div/span[contains(text(),'Print')]"));
    	print.click();
    	
    	//autoit to verify the print button
    	
    	
    }
    
    public void Doc_ExchAgree_Print()
    {
    	//click on documents tab
    	WebElement Documents=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]"));
    	//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
    	uidriver.javascriptClick(Documents);
    	
    	//click on Exchange Agreements link
    	//WebElement ExchangeAgreements1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[62]//following-sibling::div//following-sibling::ul/li/div/div/span)[3]"));
    	WebElement ExchangeAgreements2=driver.findElement(By.xpath("//span[contains(text(),'Exchange')]"));
    	uidriver.javascriptClick(ExchangeAgreements2);
    	
    	//click on cross button
    	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
    	uidriver.javascriptClick(cross);
    	
    	
    	//verify not accepted button
    	WebElement NotAccepted=driver.findElement(By.xpath("(//div[@class='dx-datagrid-content']/table//tr/td/button[contains(@class,'AgreementNotAccepted')])[2]"));
    	if(NotAccepted.isDisplayed())
    	{
    		WebElement Agreement=driver.findElement(By.xpath("(//div[@class='dx-datagrid-content']/table//tr/td/button[contains(@class,'AgreementNotAccepted')])[2]//parent::td//parent::tr//td[1]"));
        	uidriver.javascriptClick(Agreement);
    	}
    	
    	//click on print button
    	WebElement print=driver.findElement(By.xpath("//button/div/span[contains(text(),'Print')]"));
    	print.click();
    	
    	//autoit to verify the print button

    	
    }
    public void Portfolio_Holdings_Print()
    {
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click on holdings link
    	WebElement holdings1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[1]"));
    	WebElement holdings2=driver.findElement(By.xpath("//span[contains(text(),'Holdings')]"));
    	uidriver.javascriptClick(holdings1);

    	//click on print button
    	WebElement print=driver.findElement(By.xpath("(//button/div/span[contains(text(),'Print')])[2]"));
    	print.click();

    	//autoit to verify the print button
    }
    public void Portfolio_OrderStatus_Print()
    {
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click on Order status link 
    	//WebElement Order_Status1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[3]"));
    	WebElement Order_Status2=driver.findElement(By.xpath("//span[contains(text(),'Order Status')]"));
    	uidriver.javascriptClick(Order_Status2);

    	//click on print button
    	WebElement print=driver.findElement(By.xpath("//button/div/span[contains(text(),'Print')]"));
    	print.click();

    	//autoit to verify the print button
    	
    }
    public void Portfolio_Perform_Print()
    {
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click performance link
    	//WebElement performance1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[4]"));
    	WebElement performance2=driver.findElement(By.xpath("//span[contains(text(),'Performance')]"));
    	uidriver.javascriptClick(performance2);

    	//click on print button
    	WebElement print=driver.findElement(By.xpath("//button/div/span[contains(text(),'Print')]"));
    	print.click();

    	//autoit to verify the print button
    }
    public void Settings_Print()
    {
    	//click on user button
	    WebElement user=driver.findElement(By.xpath("//div[@class='dx-context-menu-container-border']"));
	    uidriver.javascriptClick(user);
	    
	    //click on settings button
	    WebElement settings=driver.findElement(By.xpath("//div[@class='dx-submenu']//li/div/div/span/span[contains(text(),'Settings')]"));
	    uidriver.javascriptClick(settings);
	    
	    //click on walk_me
	    WebElement walkme=driver.findElement(By.xpath("(//div[contains(@class,'walkme')])[7]"));
	    uidriver.javascriptClick(walkme);

	    //click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    uidriver.javascriptClick(cross);
	    
	    //click on legal link
	    WebElement Legal=driver.findElement(By.xpath("(//a[text()='Legal'])[2]"));
	    Legal.click();
	    
	    //switchtotab
	    //write a code to switch
	    
	    //click on print link
	    WebElement Print=driver.findElement(By.xpath("//p[@id='globalheader-links']/a/span"));
	    Print.click();
	    
	    //autoit to verify the print button
	    
    }
    public void TransferFunds_PreAuth_Print()
    {
    	//click on TransferFunds link
    	WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Transfer')]"));
    	uidriver.javascriptClick(TransferFunds);
    	
    	//click PreAuthorized link
    	//WebElement PreAuthorized1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[36]//following-sibling::div//following-sibling::ul/li/div/div/span)[2]"));
    	WebElement PreAuthorized1=driver.findElement(By.xpath("(//span[contains(text(),'Pre-authorized')])[1]"));
    	uidriver.javascriptClick(PreAuthorized1);

    	//click on print button
    	WebElement print=driver.findElement(By.xpath("//button/div/span[contains(text(),'Print')]"));
    	print.click();

    	//autoit to verify the print button
    	
    }
    public void Global_Navigation()
    {
    	//click on home page link
        WebElement Homepage=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[11]"));
        Homepage.click();
 	    WebElement HomepageVerify=driver.findElement(By.xpath("//h2[contains(text(),'Summary')]"));
 	   //click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    if(HomepageVerify.isDisplayed())
	    {
 	         if(cross.isDisplayed())
 	         {
 	         	System.out.println("Side Menu displayed successfully");
 	         }
	    }
	    Homepage.click();
	    
    	//click on portfolio link
 	    WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
   	    uidriver.javascriptClick(portfolio);
 	    
   	    //click performance link
   	    //WebElement performance1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[4]"));
   	    WebElement performance2=driver.findElement(By.xpath("//span[contains(text(),'Performance')]"));
   	    if(performance2.isDisplayed())
	    {
	         if(cross.isDisplayed())
	         {
	         	System.out.println("Side Menu displayed successfully");
	         }
	    }
   	    portfolio.click();
   	 
   	    //click on transfer funds
   	    WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Transfer')]"));
   	    uidriver.javascriptClick(TransferFunds);

   	    //click PreAuthorized link
   	    //WebElement PreAuthorized1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[36]//following-sibling::div//following-sibling::ul/li/div/div/span)[2]"));
   	    WebElement PreAuthorized2=driver.findElement(By.xpath("(//span[contains(text(),'Pre-authorized')])[1]"));
   	    if(PreAuthorized2.isDisplayed())
	    {
	         if(cross.isDisplayed())
	         {
	         	System.out.println("Side Menu displayed successfully");
	         }
	    }
   	    TransferFunds.click();
   	    
   	    
   	    //click on market and research
   	    WebElement MarketandSearch=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Market')]"));
   	    //div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
   	    uidriver.javascriptClick(MarketandSearch);

   	    //click on MarketOverview link
   	   // WebElement MarketOverview1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[57]//following-sibling::div//following-sibling::ul/li/div/div/span)[1]"));
   	    WebElement MarketOverview2=driver.findElement(By.xpath("//span[contains(text(),'Market  Overview')]"));

   	    if(MarketOverview2.isDisplayed())
   	    {
   	    	if(cross.isDisplayed())
   	    	{
   	    		System.out.println("Side Menu displayed successfully");
   	    	}
   	    }
   	    MarketandSearch.click();
   	    
    	//click on messages
   	    WebElement Messages=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Messages')]"));
	    uidriver.javascriptClick(Messages);

	    //click on NewMessage button
	    WebElement NewMessage=driver.findElement(By.xpath("//div[@data-app='RBCCreateNewMsgBtn.Input.App']/div/div/div/button/div/span[contains(text(),'New Message')]"));

	    if(NewMessage.isDisplayed())
	    {
	    	if(cross.isDisplayed())
	    	{
	    		System.out.println("Side Menu displayed successfully");
	    	}
	    }
	    Messages.click();
	    
    	
    	//click on documents
    	WebElement Documents=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]"));
    	//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
    	uidriver.javascriptClick(Documents);
    	
    	//click on Exchange Agreements link
    	WebElement ExchangeAgreements1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[86]//following-sibling::div//following-sibling::ul/li/div/div/span)[3]"));
    	WebElement ExchangeAgreements2=driver.findElement(By.xpath("//span[contains(text(),'Exchange')]"));
    	
    	if(ExchangeAgreements1.isDisplayed())
	    {
	         if(cross.isDisplayed())
	         {
	         	System.out.println("Side Menu displayed successfully");
	         }
	    }
    	Documents.click();
    }
    
    public void HomePage_Navigation()
    {
    	//click on home page link
        WebElement Homepage=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[11]"));
        Homepage.click();
 	    WebElement HomepageVerify=driver.findElement(By.xpath("//h2[contains(text(),'Summary')]"));
 	   //click on cross button
	    if(HomepageVerify.isDisplayed())
	    {
	    	System.out.println("HomePage navigated to summary page successfully");
	    }
 	         
    }
    public void Document_Tabs()
    {
    	WebElement Documents=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]"));
    	//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
    	uidriver.javascriptClick(Documents);
    	
    	//click on account documents link
    	WebElement AccountDocuments=driver.findElement(By.xpath("//span[contains(text(),'Account Doc')]"));
    	AccountDocuments.click();
    	WebElement AccountDocumentsPage=driver.findElement(By.xpath("//h1[contains(text(),'Account Documents')]"));
    	
    	if(AccountDocumentsPage.isDisplayed())
	    {
			System.out.println("Documents tab>Account Documents displayed account documents page successfully");	
	    }
    	WebElement PortfolioDocuments=driver.findElement(By.xpath("//span[contains(text(),'Portfolio Doc')]"));
    	PortfolioDocuments.click();
    	WebElement PortfolioDocumentsPage=driver.findElement(By.xpath("//h1[contains(text(),'Portfolio Documents')]"));
    	if(PortfolioDocumentsPage.isDisplayed())
	    {
    		System.out.println("Documents tab>Portfolio Documents displayed Portfolio documents page successfully");			
	    }
    	
    	WebElement ExchangeAgreements=driver.findElement(By.xpath("//span[contains(text(),'Exchange')]"));
    	ExchangeAgreements.click();
    	WebElement ExchangeAgreementsPage=driver.findElement(By.xpath("//h1[contains(text(),'Exchange Agreements')]"));
    	if(ExchangeAgreementsPage.isDisplayed())
	    {
    		System.out.println("Documents tab>Exchange Agreements displayed Exchange Agreements page successfully");
	    }
    	
    }
    
    public void MarketandResearch_Tabs()
    {
    	String TypeLanguage="English";
    	
    	//click on market and research
    	WebElement MarketandSearch=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Mar')]"));
    	//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
    	uidriver.javascriptClick(MarketandSearch);

    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    	//click on MarketOverview link
    	WebElement MarketOverview=driver.findElement(By.xpath("//span[contains(text(),'Market  Overview')]"));
    	MarketOverview.click();
    	WebElement MarketOverviewPage=driver.findElement(By.xpath("//h2[contains(text(),'Market Overview')]"));
    	if(MarketOverviewPage.isDisplayed())
    	{
    		System.out.println("Market and Research>MarketOverview displayed MarketOverview page successfully");
    	}
    	
    	//click on MarketNews link
    	WebElement MarketNews=driver.findElement(By.xpath("//span[contains(text(),'Market News')]"));
    	MarketNews.click();
    	WebElement MarketNewsPage=driver.findElement(By.xpath("//h2[contains(text(),'Market News')]"));
    	if(MarketNewsPage.isDisplayed())
    	{
    		System.out.println("Market and Research>MarketNews displayed MarketNews page successfully");
    	}
    	
    	//click on Research and commentary link
    	WebElement Research_Commentary=driver.findElement(By.xpath("//span[contains(text(),'Research  & Commentary')]"));
    	Research_Commentary.click();
    	WebElement Research_CommentaryPage=driver.findElement(By.xpath("//h2[contains(text(),'Research and Commentary')]"));
    	if(Research_CommentaryPage.isDisplayed())
    	{
    		System.out.println("Market and Research>Research and Commentary displayed Research and Commentary page successfully");
    	}
    	
    	//click on section and industries link
    	WebElement section_industries=driver.findElement(By.xpath("//span[contains(text(),'Sectors')]"));
    	section_industries.click();
    	WebElement section_industriesPage=driver.findElement(By.xpath("//h2[contains(text(),'Sectors')]"));
    	if(section_industriesPage.isDisplayed())
    	{
    		System.out.println("Market and Research>section and industries displayed section and industries page successfully");
    	}
    	
    	//click on Watchlists link
    	WebElement Watchlists=driver.findElement(By.xpath("//span[contains(text(),'Watchlist')]"));
    	Watchlists.click();
    	WebElement WatchlistsPage=driver.findElement(By.xpath("//h2[contains(text(),'Watchlist')]"));
    	if(WatchlistsPage.isDisplayed())
    	{
    		System.out.println("Market and Research>Watchlists displayed Watchlists page successfully");
    	}
    	
    	//click on SymbolSearch link
    	WebElement SymbolSearch=driver.findElement(By.xpath("(//span[contains(text(),'Symbol Search')])[2]"));
    	SymbolSearch.click();
    	WebElement SymbolSearchPage=driver.findElement(By.xpath("//h2[contains(text(),'Search')]"));
    	if(SymbolSearchPage.isDisplayed())
    	{
    		System.out.println("Market and Research>SymbolSearch displayed SymbolSearch page successfully");
    	}
    	}
    	
    	
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on MarketOverview link
        	WebElement MarketOverview=driver.findElement(By.xpath("//span[contains(text(),'Aper')]"));
        	MarketOverview.click();
        	WebElement MarketOverviewPage=driver.findElement(By.xpath("//h2[contains(text(),'Aper')]"));
        	if(MarketOverviewPage.isDisplayed())
        	{
        		System.out.println("Market and Research>MarketOverview displayed MarketOverview(Aperçu du marché) page successfully");
        	}
        	
        	//click on MarketNews link
        	WebElement MarketNews=driver.findElement(By.xpath("//span[contains(text(),'Nouvelles du marché')]"));
        	MarketNews.click();
        	WebElement MarketNewsPage=driver.findElement(By.xpath("//h2[contains(text(),'Nouvelles')]"));
        	if(MarketNewsPage.isDisplayed())
        	{
        		System.out.println("Market and Research>MarketNews displayed MarketNews(Nouvelles du marché) page successfully");
        	}
        	
        	//click on Research and commentary link
        	WebElement Research_Commentary=driver.findElement(By.xpath("//span[contains(text(),'Recherches et de commentaires')]"));
        	Research_Commentary.click();
        	WebElement Research_CommentaryPage=driver.findElement(By.xpath("//h2[contains(text(),'Recherches')]"));
        	if(Research_CommentaryPage.isDisplayed())
        	{
        		System.out.println("Market and Research>Research and Commentary displayed Research and Commentary(Recherches et de commentaires) page successfully");
        	}
        	
        	//click on section and industries link
        	WebElement section_industries=driver.findElement(By.xpath("//span[contains(text(),'Secteurs et industries')]"));
        	section_industries.click();
        	WebElement section_industriesPage=driver.findElement(By.xpath("//h2[contains(text(),'Secteurs')]"));
        	if(section_industriesPage.isDisplayed())
        	{
        		System.out.println("Market and Research>section and industries displayed section and industries(Secteurs et industries) page successfully");
        	}
        	
        	//click on Watchlists link
        	WebElement Watchlists=driver.findElement(By.xpath("//span[contains(text(),'Listes de cotes')]"));
        	Watchlists.click();
        	WebElement WatchlistsPage=driver.findElement(By.xpath("//h2[contains(text(),'Listes')]"));
        	if(WatchlistsPage.isDisplayed())
        	{
        		System.out.println("Market and Research>Watchlists displayed Watchlists(Listes de cotes) page successfully");
        	}
        	
        	//click on SymbolSearch link
        	WebElement SymbolSearch=driver.findElement(By.xpath("(//span[contains(text(),'Recherche de symbole')])[2]"));
        	SymbolSearch.click();
        	WebElement SymbolSearchPage=driver.findElement(By.xpath("//h2[contains(text(),'Recherche')]"));
        	if(SymbolSearchPage.isDisplayed())
        	{
        		System.out.println("Market and Research>SymbolSearch displayed SymbolSearch(Recherche de symbole) page successfully");
        	}
    	}
    }
    
    
    public void Messages_Page()
    {
    	//click on messages
   	    WebElement Messages=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Messages')]"));
	    uidriver.javascriptClick(Messages);

	    //click on NewMessage button
	    WebElement NewMessage=driver.findElement(By.xpath("//div[@data-app='RBCCreateNewMsgBtn.Input.App']/div/div/div/button/div/span[contains(text(),'New Message')]"));

	    if(NewMessage.isDisplayed())
	    {
	    	System.out.println("Messages navigated to Messages_Page successfully ");
	    }
    }

    public void Portfolio_Page()
    {
    	//click on portfolio link
 	    WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
 	    uidriver.javascriptClick(portfolio);

 	    //click on holdings link
 	    WebElement holdings=driver.findElement(By.xpath("//span[contains(text(),'Holdings')]"));
 	    holdings.click();
 	    WebElement holdingsPage=driver.findElement(By.xpath("//h1[contains(text(),'Holdings')]"));
 	    if(holdingsPage.isDisplayed())
 	    {    	
 	    	System.out.println("Portfolio-->holdings link navigated to holdings Page successfully ");
 	    }
   	
   	    
 	    //click on activities link
 	    WebElement Activities=driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
 	    Activities.click();
 	    WebElement ActivitiesPage=driver.findElement(By.xpath("//h1[contains(text(),'Activities')]"));
 	    if(ActivitiesPage.isDisplayed())
 	    {    	
 	    	System.out.println("Portfolio-->Activities link navigated to Activities Page successfully ");
 	    }
   	    
 	    //click on order status link
 	    WebElement Order_Status=driver.findElement(By.xpath("//span[contains(text(),'Order Status')]"));
 	    Order_Status.click();
 	    WebElement Order_StatusPage=driver.findElement(By.xpath("//h1[contains(text(),'Order Status')]"));
 	    if(Order_StatusPage.isDisplayed())
 	    {    	
 	    	System.out.println("Portfolio-->Order_Status link navigated to Order_Status Page successfully ");
 	    }
 	    
   	    //click performance link
   	    //WebElement performance1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[4]"));
   	    WebElement performance=driver.findElement(By.xpath("//span[contains(text(),'Performance')]"));
   	    performance.click();
   	    WebElement PerformancePage=driver.findElement(By.xpath("//h1[contains(text(),'Performance')]"));
   	    if(PerformancePage.isDisplayed())
   	    {    	
   	    	System.out.println("Portfolio-->Performance link navigated to Performance Page successfully ");
   	    }
    }

    public void TransferFunds_Page()
    {
    	//click on TransferFunds link
    	WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Transfer')]"));
    	uidriver.javascriptClick(TransferFunds);
    	
    	//click make a transfer link
    	WebElement Make_A_Transfer=driver.findElement(By.xpath("//span[contains(text(),'Make a Transfer')]"));
    	Make_A_Transfer.click();
    	WebElement Make_A_TransferPage=driver.findElement(By.xpath("//h1[contains(text(),'Transfer')]"));
    	if(Make_A_TransferPage.isDisplayed())
   	    {    	
   	    	System.out.println("Transfer Funds-->Make_A_Transfer link navigated to Make_A_Transfer Page successfully ");
   	    }
    	
    	//click PreAuthorized link
    	WebElement PreAuthorized=driver.findElement(By.xpath("(//span[contains(text(),'Pre-authorized')])[1]"));
    	PreAuthorized.click();
    	WebElement PreAuthorizedPage=driver.findElement(By.xpath("//h1[contains(text(),'Pre-Authorized')]"));
    	if(PreAuthorizedPage.isDisplayed())
   	    {    	
   	    	System.out.println("Transfer Funds-->PreAuthorized link navigated to PreAuthorized Page successfully ");
   	    }
    	
    	//click on transfer history link
    	WebElement Transfer_History=driver.findElement(By.xpath("//span[contains(text(),'Transfer History')]"));
    	Transfer_History.click();
    	WebElement Transfer_HistoryPage=driver.findElement(By.xpath("//h1[contains(text(),'Transfer History')]"));
    	if(Transfer_HistoryPage.isDisplayed())
   	    {    	
   	    	System.out.println("Transfer Funds-->Transfer_History link navigated to Transfer_History Page successfully ");
   	    }
    	
    }
    
    public void TranFunHead_Mess_TransInfo()
    {
    	String TypeLanguage="English";
    	
    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    	//click on TransferFunds link
    	WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Transfer')]"));
    	uidriver.javascriptClick(TransferFunds);

    	//click make a transfer link
    	WebElement Make_A_Transfer=driver.findElement(By.xpath("//span[contains(text(),'Make a Transfer')]"));
    	Make_A_Transfer.click();
    	WebElement Make_A_TransferPage=driver.findElement(By.xpath("//h1[contains(text(),'Transfer')]"));
    	if(Make_A_TransferPage.isDisplayed())
    	{
    		System.out.println("Transfer Funds Header and Make a Transfer Sub_Header label is verified in English and the  page opened successfully");
    	}

    	//click on cross button
    	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
    	uidriver.javascriptClick(cross);

    	//click From_Account drop down
    	WebElement From_Account=driver.findElement(By.xpath("//div[contains(@class,'RBCTransFromAccountField CL_FromAccount')]/div/div/input"));
    	From_Account.click();

    	//click From_Account drop down value
    	WebElement From_Account1=driver.findElement(By.xpath("(//div[@class='dx-scrollable-wrapper']//div[contains(@class,'dx-scrollview-content')]/div)[12]"));
    	From_Account1.click();

    	//check for the amount available to transfer message
    	WebElement AmtToTransfer=driver.findElement(By.xpath("//span[@class='RBCTransAvailAmt']"));

    	//click To_Account drop down
    	WebElement To_Account=driver.findElement(By.xpath("//div[contains(@class,'RBCTransToAccountField CL_ToAccount')]/div/div/input"));
    	To_Account.click();
    	
    	//click To_Account drop down value
    	WebElement To_Account1=driver.findElement(By.xpath("(//div[@class='dx-scrollable-wrapper']//div[contains(@class,'dx-scrollview-content')]/div)[13]"));
    	To_Account1.click();

    	
    	//fill the amount
    	WebElement Amt=driver.findElement(By.xpath("//div[contains(@class,'RBCTransAmountField CL_Amount')]/div/input"));
    	Amt.sendKeys("1");
    	
    	//click on frequency drop down
    	WebElement frequency=driver.findElement(By.xpath("//div[contains(@class,'RBCTransFrequencyField CL_Frequency')]/div/div/input"));
    	frequency.click();
    	
    	
    	//click on frequency value
    	WebElement frequency_once=driver.findElement(By.xpath("//div[contains(text(),'Once')]"));
    	frequency_once.click();
    
    	//click on continue button
    	WebElement continuebutton=driver.findElement(By.xpath("(//button//div[contains(@class,'dx-button-content')]/span[contains(text(),'Continue')])[2]"));
    	continuebutton.click();
    	
    	//switching to pop up and confirm
    	
    	//if confirm button popup is there means
    	WebElement confirmbuttonpopup=driver.findElement(By.xpath("//button//div[contains(@class,'dx-button-content')]/span[contains(text(),'Confirm')]"));
    	confirmbuttonpopup.click();
    	
    	//switchback to page
    	
    	//click on confirm button 
    	WebElement confirmbutton=driver.findElement(By.xpath("//button//div[contains(@class,'dx-button-content')]/span[contains(text(),'Confirm')]"));
    	confirmbutton.click();
    	
    	//verify the transfer submitted message label
    	WebElement MessageLabel=driver.findElement(By.xpath("//div[contains(@class,'RBCTransToastTextGreen')]"));
    	if(MessageLabel.isDisplayed())
    	{
    		System.out.println("transfer submitted message label is displayed in English and verified successfully");
    	}
    	
    	//verify the transfer request info
    	WebElement TransferInfo=driver.findElement(By.xpath("//div[contains(@class,'RBCTransSubmitted')]//h2[contains(text(),'Transfer Request')]"));
    	WebElement TransferHistorybutton=driver.findElement(By.xpath("//div[@class='dx-button-content']/span[contains(text(),'Histor')]"));
    	TransferHistorybutton.click();
    	WebElement TransferInformation=driver.findElement(By.xpath("//h1[contains(text(),'Transfer History')]"));
    	if(TransferInformation.isDisplayed())
    	{
    		System.out.println("TransferInformation in English was successfully verified ");
    	}
    	
    	}
    	
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on TransferFunds link
        	WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Virer des fonds')]"));
        	uidriver.javascriptClick(TransferFunds);

        	//click make a transfer link
        	WebElement Make_A_Transfer=driver.findElement(By.xpath("//span[contains(text(),'Faire un virement')]"));
        	Make_A_Transfer.click();
        	WebElement Make_A_TransferPage=driver.findElement(By.xpath("//h1[contains(text(),'Virer des fonds')]"));
        	if(Make_A_TransferPage.isDisplayed())
        	{
        		System.out.println("Transfer FundsVirer des fonds Header and Make a Transfer/Faire un virement Sub_Header label is verified in French and the  page opened successfully");
        	}

        	//click on cross button
        	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
        	uidriver.javascriptClick(cross);

        	//click From_Account drop down
        	WebElement From_Account=driver.findElement(By.xpath("//div[contains(@class,'RBCTransFromAccountField CL_FromAccount')]/div/div/input"));
        	From_Account.click();
        	
        	//click From_Account drop down value
        	WebElement From_Account1=driver.findElement(By.xpath("(//div[@class='dx-scrollable-wrapper']//div[contains(@class,'dx-scrollview-content')]/div)[12]"));
        	From_Account1.click();

        	//check for the amount available to transfer message
        	WebElement AmtToTransfer=driver.findElement(By.xpath("//span[@class='RBCTransAvailAmt']"));
        	
    		//click To_Account drop down
        	WebElement To_Account=driver.findElement(By.xpath("//div[contains(@class,'RBCTransToAccountField CL_ToAccount')]/div/div/input"));
        	To_Account.click();
        	
        	//click To_Account drop down value
        	WebElement To_Account1=driver.findElement(By.xpath("(//div[@class='dx-scrollable-wrapper']//div[contains(@class,'dx-scrollview-content')]/div)[13]"));
        	To_Account1.click();

        	//fill the amount
        	WebElement Amt=driver.findElement(By.xpath("//div[contains(@class,'RBCTransAmountField CL_Amount')]/div/input"));
        	Amt.sendKeys("1");
        	
        	//click on frequency drop down
        	WebElement frequency=driver.findElement(By.xpath("//div[contains(@class,'RBCTransFrequencyField CL_Frequency')]/div/div/input"));
        	frequency.click();
        	
        	
        	//click on frequency value
        	WebElement frequency_once=driver.findElement(By.xpath("//div[contains(text(),'Une fois')]"));
        	frequency_once.click();
        
        	//click on continue button
        	WebElement continuebutton=driver.findElement(By.xpath("(//button//div[contains(@class,'dx-button-content')]/span[contains(text(),'Continue')])[2]"));
        	continuebutton.click();
        	
        	//switching to pop up and confirm
        	
        	//if confirm button popup is there means
        	WebElement confirmbuttonpopup=driver.findElement(By.xpath("//button//div[contains(@class,'dx-button-content')]/span[contains(text(),'Confirm')]"));
        	confirmbuttonpopup.click();
        	
        	//switchback to page
        	
        	//click on confirm button 
        	WebElement confirmbutton=driver.findElement(By.xpath("//button//div[contains(@class,'dx-button-content')]/span[contains(text(),'Confirm')]"));
        	confirmbutton.click();
        	
        	//verify the transfer submitted message label
        	WebElement MessageLabel=driver.findElement(By.xpath("//div[contains(@class,'RBCTransToastTextGreen') and contains(text(),'Votre demande de virement a')]"));
        	if(MessageLabel.isDisplayed())
        	{
        		System.out.println("transfer submitted message/Votre demande de virement a label is displayed in French and verified successfully");
        	}
        	
        	//verify the transfer request info
        	WebElement TransferInfo=driver.findElement(By.xpath("//div[contains(@class,'RBCTransSubmitted')]//h2[contains(text(),'Demande de virement')]"));
        	WebElement TransferHistorybutton=driver.findElement(By.xpath("//div[@class='dx-button-content']/span[contains(text(),'Histor')]"));
        	TransferHistorybutton.click();
        	WebElement TransferInformation=driver.findElement(By.xpath("//h1[contains(text(),'Historique des virements')]"));
        	if(TransferInformation.isDisplayed())
        	{
        		System.out.println("TransferInformation in French was successfully verified ");
        	}
    	}
    	
    }
    
    public void Performance_Weighted_ROR()
    {
    	String TypeLanguage="English";
    	
    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    		//click on portfolio link
        	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
        	uidriver.javascriptClick(portfolio);
        	
        	//click performance link
        	//WebElement performance1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[4]"));
        	WebElement performance=driver.findElement(By.xpath("//span[contains(text(),'Rendement')]"));
        	uidriver.javascriptClick(performance);

        	//click on cross button
        	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
        	uidriver.javascriptClick(cross);
        	
        	//check the Performance weighted by ROR
        	WebElement PerformanceWeightedByROR=driver.findElement(By.xpath("(//label[contains(@class,'RBCActGrpPortFilterLabel') and contains(text(),'Performance By Time Weighted ROR')])[1]"));
    	    if(PerformanceWeightedByROR.isDisplayed())
    	    {
    	      System.out.println("Performance Weighted By ROR label displayed in English and verified successully ");
    	    }
    	}
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on portfolio link
        	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
        	uidriver.javascriptClick(portfolio);
        	
        	//click performance link
        	//WebElement performance1=driver.findElement(By.xpath("((//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]//following-sibling::div//following-sibling::ul/li/div/div/span)[4]"));
        	WebElement performance=driver.findElement(By.xpath("//span[contains(text(),'Rendement')]"));
        	uidriver.javascriptClick(performance);

        	//click on cross button
        	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
        	uidriver.javascriptClick(cross);
        	
        	//check the Performance weighted by ROR
        	WebElement PerformanceWeightedByROR=driver.findElement(By.xpath("(//label[contains(@class,'RBCActGrpPortFilterLabel') and contains(text(),'Taux de rendement pondéré en fonction du temps')])[1]"));
    	    if(PerformanceWeightedByROR.isDisplayed())
    	    {
    	      System.out.println("Performance Weighted By ROR label/Taux de rendement pondéré en fonction du temps displayed in French and verified successully ");
    	    }
    	}
    	
    }
    
    public void Settings_DocumentDelivery()
    {
    	String TypeLanguage="English";
    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    		//click on home page link
            WebElement Homepage=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[11]"));
            Homepage.click();
     	    WebElement HomepageVerify=driver.findElement(By.xpath("//h2[contains(text(),'Summary')]"));
     	   //click on cross button
    	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
    	    if(HomepageVerify.isDisplayed())
    	    {
     	         if(cross.isDisplayed())
     	         {
     	         	System.out.println("Home page header displayed in English successfully");
     	         }
    	    }
    	    
    		//click on user button
    	    //WebElement user=driver.findElement(By.xpath("//div[@class='dx-context-menu-container-border']"));
    	    WebElement user=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuSecondary']"));	
    	    uidriver.javascriptClick(user);
    	    
    	    //click on settings button
    	    WebElement settings=driver.findElement(By.xpath("//div[@class='dx-submenu']//li/div/div/span/span[contains(text(),'Settings')]"));
    	    uidriver.javascriptClick(settings);
    	    
    	    //click on Document_Delivery tab
    	    WebElement Document_Delivery=driver.findElement(By.xpath("//div[@class='dx-tabs-wrapper']//div/div/span[contains(text(),'Document Delivery')]"));
    	    uidriver.javascriptClick(Document_Delivery);
    	    
    	    //check the sub header label
    	    WebElement sub_header=driver.findElement(By.xpath("//h2[contains(text(),'Document Delivery')]"));
    	    //check footer label
    	    WebElement footer_label=driver.findElement(By.xpath("//div[@class='RBCHomeFooterRight']"));
    	    WebElement privacy_Security=driver.findElement(By.xpath("//div[@class='RBCHomeFooterRight']//a[contains(text(),'Privacy & Security')]"));
    	    WebElement Legal=driver.findElement(By.xpath("//div[@class='RBCHomeFooterRight']//a[contains(text(),'Legal')]"));
    	    if(sub_header.isDisplayed() && footer_label.isDisplayed() && privacy_Security.isDisplayed() &&Legal.isDisplayed() )
    	    {
    	    	
    	    	System.out.println("Settings--> Delivery Documents--> header,sub-header, footer-label(privacy and security, legal) label is displayed successfullly in English");
    	    }
    	    
    	}
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on home page link
            WebElement Homepage=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[11]"));
            Homepage.click();
     	    WebElement HomepageVerify=driver.findElement(By.xpath("//h2[contains(text(),'Sommaire')]"));
     	   //click on cross button
    	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
    	    if(HomepageVerify.isDisplayed())
    	    {
     	         if(cross.isDisplayed())
     	         {
     	         	System.out.println("Home page header displayed in French successfully");
     	         }
    	    }
    	    
    		//click on user button
    	    //WebElement user=driver.findElement(By.xpath("//div[@class='dx-context-menu-container-border']"));
    	    WebElement user=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuSecondary']"));	
    	    uidriver.javascriptClick(user);
    	    
    	    //click on settings button
    	    WebElement settings=driver.findElement(By.xpath("//div[@class='dx-submenu']//li/div/div/span/span[contains(text(),'Paramètres')]"));
    	    uidriver.javascriptClick(settings);
    	    
    	    //click on Document_Delivery tab
    	    WebElement Document_Delivery=driver.findElement(By.xpath("//div[@class='dx-tabs-wrapper']//div/div/span[contains(text(),'Livraison de documents')]"));
    	    uidriver.javascriptClick(Document_Delivery);
    	    
    	    //check the sub header label
    	    WebElement sub_header=driver.findElement(By.xpath("//h2[contains(text(),'Livraison de documents')]"));
    	    //check footer label
    	    WebElement footer_label=driver.findElement(By.xpath("//div[@class='RBCHomeFooterRight']"));
    	    WebElement privacy_Security=driver.findElement(By.xpath("//div[@class='RBCHomeFooterRight']//a[contains(text(),'Protection des renseignements et Sécurité')]"));
    	    WebElement Legal=driver.findElement(By.xpath("//div[@class='RBCHomeFooterRight']//a[contains(text(),'Conditions d’utilisation')]"));
    	    if(sub_header.isDisplayed() && footer_label.isDisplayed() && privacy_Security.isDisplayed() &&Legal.isDisplayed() )
    	    {
    	    	
    	    	System.out.println("Settings--> Delivery Documents--> header,sub-header, footer-label(privacy and security/Protection des renseignements et Sécurité, legal/Conditions d’utilisation) label is displayed successfullly in English");
    	    }
    	}
    	
    }
    
    public void LeftNav_ExchangeRates()
    {
    	String TypeLanguage="English";
    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    		//click on documents tab
        	WebElement Documents=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]"));
        	//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
        	uidriver.javascriptClick(Documents);
        	
        	//click on Exchange Agreements link
        	WebElement ExchangeAgreements=driver.findElement(By.xpath("//span[contains(text(),'Exchange')]"));
        	
            if(ExchangeAgreements.isDisplayed())
            {
            	System.out.println("LeftNavigation Documents--> exchange agreements displayed in English successfully ");
            }
            
    	}
    	
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on documents tab
        	WebElement Documents=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]"));
        	//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]
        	uidriver.javascriptClick(Documents);
        	
        	//click on Exchange Agreements link
        	WebElement ExchangeAgreements=driver.findElement(By.xpath("//span[contains(text(),'Conventions')]"));
        	
            if(ExchangeAgreements.isDisplayed())
            {
            	System.out.println("LeftNavigation Documents--> exchange agreements/Conventions boursières displayed in French successfully ");
            }
    	}
    	
    }
    
    public void Verify_Activities_Page()
    {
    	
    	String TypeLanguage="English";
    	
    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    		//click on portfolio link
        	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
        	uidriver.javascriptClick(portfolio);
        	
        	//click on activities link
        	WebElement Activities=driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        	uidriver.javascriptClick(Activities);

        	/*//click on walk_me
        	WebElement walkme=driver.findElement(By.xpath("(//div[contains(@class,'walkme')])[7]"));
        	uidriver.javascriptClick(walkme);*/

        	//click on cross button
        	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
        	uidriver.javascriptClick(cross);
        	
        	//verify activities page header 
        	WebElement ActivitiesPage=driver.findElement(By.xpath("//h1[contains(text(),'Activities')]"));
     	    if(ActivitiesPage.isDisplayed())
     	    {    	
     	    	System.out.println("Portfolio-->Activities link navigated to Activities Page and the header in English is also verified successfully ");
     	    }
     	    
     	    //verify search box
     	    WebElement SearchBox=driver.findElement(By.xpath("//div[contains(@class,'RBCInputFieldWithInsetBtnRightWrapper')]"));
     	    //verify ActivityType DropDown
     	    WebElement ActivityTypeDropDown=driver.findElement(By.xpath("//div[contains(@class,'RBCInputFieldWithInsetBtnRightWrapper')]"));
     	    //Verify ProductType dropdown
     	    WebElement ProductTypeDropDown=driver.findElement(By.xpath("//div[contains(@class,'RBCInputFieldWithInsetBtnRightWrapper')]"));
     	   if(SearchBox.isDisplayed() && ActivityTypeDropDown.isDisplayed() && ProductTypeDropDown.isDisplayed())
    	    {    	
    	    	System.out.println("Product_type dropdown, activity_type dropdown and searchbox verified successfully ");
    	    }
     	    
    	}
    	
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on portfolio link
        	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
        	uidriver.javascriptClick(portfolio);
        	
        	//click on activities link
        	WebElement Activities=driver.findElement(By.xpath("//span[contains(text(),'Activit')]"));
        	uidriver.javascriptClick(Activities);

        	/*//click on walk_me
        	WebElement walkme=driver.findElement(By.xpath("(//div[contains(@class,'walkme')])[7]"));
        	uidriver.javascriptClick(walkme);*/

        	//click on cross button
        	WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
        	uidriver.javascriptClick(cross);
        	
        	WebElement ActivitiesPage=driver.findElement(By.xpath("//h1[contains(text(),'Activit')]"));
     	    if(ActivitiesPage.isDisplayed())
     	    {    	
     	    	System.out.println("Portfolio-->Activities/Activités link navigated to Activities/Activités Page and the header in French is also verified successfully ");
     	    }
     	    
     	    //verify search box
     	    WebElement SearchBox=driver.findElement(By.xpath("//div[contains(@class,'RBCInputFieldWithInsetBtnRightWrapper')]"));
     	    //verify ActivityType DropDown
     	    WebElement ActivityTypeDropDown=driver.findElement(By.xpath("//div[contains(@class,'RBCInputFieldWithInsetBtnRightWrapper')]"));
     	    //Verify ProductType dropdown
     	    WebElement ProductTypeDropDown=driver.findElement(By.xpath("//div[contains(@class,'RBCInputFieldWithInsetBtnRightWrapper')]"));
     	    if(SearchBox.isDisplayed() && ActivityTypeDropDown.isDisplayed() && ProductTypeDropDown.isDisplayed())
     	    {    	
     	    	System.out.println("Product_type dropdown, activity_type dropdown and searchbox verified successfully ");
    	    }
    	}
    }
    public void Performance_Page()
    {
    	String TypeLanguauge="English";
    	
    	if(TypeLanguauge.equalsIgnoreCase("English"))
    	{
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click performance link
    	WebElement performance=driver.findElement(By.xpath("//span[contains(text(),'Performance')]"));
    	uidriver.javascriptClick(performance);
    	
    	//click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    uidriver.javascriptClick(cross);
    	
    	//verify performance page
    	WebElement performancepage=driver.findElement(By.xpath("//h1[contains(text(),'Performance')]"));
    	
    	//select an acccount dropdown
    	WebElement Acc_DropDown=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
    	
    	//verify the disclaimer text
    	WebElement disclaimer=driver.findElement(By.xpath("//div[contains(text(),'Disclaimer')]"));
    	
   	    if(performancepage.isDisplayed()  && Acc_DropDown.isDisplayed() && disclaimer.isDisplayed() )
	    {
	         
	         	System.out.println("Performance page header, Acccount dropdown and discalimer contents displayed in English and verified successfully");
	         
	    }
    	}
    	
    	if(TypeLanguauge.equalsIgnoreCase("French"))
    	{
    		
    		//click on portfolio link
        	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
        	uidriver.javascriptClick(portfolio);
        	
        	//click performance link
        	WebElement performance=driver.findElement(By.xpath("//span[contains(text(),'Rendement')]"));
        	uidriver.javascriptClick(performance);
        	
        	//click on cross button
    	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
    	    uidriver.javascriptClick(cross);
    	    
    	  //verify performance page
        	WebElement performancepage=driver.findElement(By.xpath("//h1[contains(text(),'Rendement')]"));
        	
        	//select an acccount dropdown
        	WebElement Acc_DropDown=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
        	
        	//verify the disclaimer text
        	WebElement disclaimer=driver.findElement(By.xpath("//div[contains(text(),'responsabili')]"));
        	
       	    if(performancepage.isDisplayed()  && Acc_DropDown.isDisplayed() && disclaimer.isDisplayed() )
    	    {
    	         	System.out.println("Performance page/Rendement header, Acccount dropdown/Sélectionner un compte and discalimer/Afficher les avis de non-responsabilité contents displayed in French and verified successfully");
    	    }
    	    
    	}
    	
    }

    public void Order_Status_Page()
    {
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click on Order status link 
    	WebElement Order_Status=driver.findElement(By.xpath("//span[contains(text(),'Order Status')]"));
    	uidriver.javascriptClick(Order_Status);
    	
    	//verify Order_Status page
    	WebElement Order_StatusPage=driver.findElement(By.xpath("//h1[contains(text(),'Order')]"));
    	
    	//select an acccount dropdown
    	WebElement OrderStatus_DropDown=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
    	
    	if(Order_StatusPage.isDisplayed()  && OrderStatus_DropDown.isDisplayed() )
	    {
	         	System.out.println("Orderstatus page header, Acccount dropdown contents displayed in English and verified successfully");
	    }
    	
    }
    
    public void Order_Status_HideColumns()
    {
    	
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);
    	
    	//click on Order status link 
    	WebElement Order_Status=driver.findElement(By.xpath("//span[contains(text(),'Order Status')]"));
    	uidriver.javascriptClick(Order_Status);
    	
    	//verify Order_Status page
    	WebElement Order_Status_Show_hideColumns=driver.findElement(By.xpath("//span[contains(text(),'Show/Hide Columns')]"));
    	
    	if(Order_Status_Show_hideColumns.isDisplayed())
	    {
	         	System.out.println("Orderstatus page show or hide columns contents displayed in English and verified successfully");
	    }
    	
    }
    
    public void Holdings_HideCol_Intraday()
    {
    	//click on portfolio link
    	WebElement portfolio=driver.findElement(By.xpath("(//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div)[13]"));
    	uidriver.javascriptClick(portfolio);

    	//click on holdings link
    	WebElement holdings=driver.findElement(By.xpath("//span[contains(text(),'Holdings')]"));
    	uidriver.javascriptClick(holdings);
    	
    	//verify Order_Status page
    	WebElement Holdings_Show_hideColumns=driver.findElement(By.xpath("//span[contains(text(),'Show/Hide Columns')]"));
    	
    	//verify intraday
    	WebElement Intraday=driver.findElement(By.xpath("//span[contains(text(),'Intraday')]"));
    	
    	if(Holdings_Show_hideColumns.isDisplayed() &&Intraday.isDisplayed())
	    {
	         	System.out.println("Intraday contents displayed in English and verified successfully");
	    }
    }
    
    public void AccountDoc_Page()
    {
    	//click on documents tab
    	WebElement Documents=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Documents')]"));
    	uidriver.javascriptClick(Documents);
    	
    	
    	//click on account documents link
    	WebElement AccountDocuments=driver.findElement(By.xpath("//span[contains(text(),'Account Doc')]"));
    	AccountDocuments.click();
    	WebElement AccountDocumentsPage=driver.findElement(By.xpath("//h1[contains(text(),'Account Documents')]"));
    	
    	//click on cross button
	    WebElement cross=driver.findElement(By.xpath("(//button[contains(@class,'CloseButtonHome')])[2]"));
	    uidriver.javascriptClick(cross);
	    
	    //select an acccount dropdown
	    WebElement Acc_DropDown=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));

	    //check the statments tab
	    WebElement Statements=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
	    
	    //check the Trade confirmations tab
	    WebElement Trade_confirmations=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
	    
	    //check the annual reports
	    WebElement Annual_Reports=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
	    
	    //check the tax documents
	    WebElement Tax_Documents=driver.findElement(By.xpath("//div[contains(@class,'CL_FilterAccountGroupOrPortfolio')]"));
    	if(AccountDocumentsPage.isDisplayed() &&  Acc_DropDown.isDisplayed() && Statements.isDisplayed() && Trade_confirmations.isDisplayed() && Annual_Reports.isDisplayed() &&Tax_Documents.isDisplayed())
	    {
			System.out.println("Documents tab>Account Documents displayed account documents page, 6 tabs displayed in English  successfully");	
	    }
    	
    	
    }
    
    public void TransFun_PreAuth()
    {
    	
    	String TypeLanguage="English";
    	
    	if(TypeLanguage.equalsIgnoreCase("English"))
    	{
    		//click on TransferFunds link
        	WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Transfer')]"));
        	uidriver.javascriptClick(TransferFunds);
        	
        	//click PreAuthorized link
        	WebElement PreAuthorized=driver.findElement(By.xpath("(//span[contains(text(),'Pre-authorized')])[1]"));
        	uidriver.javascriptClick(PreAuthorized);
        	
        	
        	//check the page header of pre authorized page
        	WebElement PreAuthorizedPage=driver.findElement(By.xpath("//h1[contains(text(),'Pre-Authorized')]"));
        	
        	//verify the table
        	WebElement PreAuthorizedPageTable=driver.findElement(By.xpath("(//div[contains(@id,'RBCTransHistPreHolderApp')])[3]"));
        	
        	//verify the disclaimer text
        	WebElement disclaimer=driver.findElement(By.xpath("//div[contains(text(),'Disclaimer')]"));
        	
        	if(PreAuthorizedPage.isDisplayed() && PreAuthorizedPageTable.isDisplayed() && disclaimer.isDisplayed())
        	{
        		System.out.println("Page header, table content and disclaimer content verified in English successfully");
        	}
        	
        	//Edit label in English
        	WebElement EditLabel=driver.findElement(By.xpath("//div[contains(text(),'Edit')]"));
        	
        	//Edit button verify
        	WebElement EditButton=driver.findElement(By.xpath("//button[contains(@class,'RBCTransPreEditBtn')]"));
        	
        	if(EditLabel.isDisplayed() && EditButton.isDisplayed())
        	{
        		System.out.println("EditLabel content and EditButton verified in English successfully");
        	}
    	}
    	
    	if(TypeLanguage.equalsIgnoreCase("French"))
    	{
    		//click on TransferFunds link
        	WebElement TransferFunds=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Transfer')]"));
        	uidriver.javascriptClick(TransferFunds);
        	
        	//click PreAuthorized link
        	WebElement PreAuthorized=driver.findElement(By.xpath("(//span[contains(text(),'Virements préautorisés')])[1]"));
        	uidriver.javascriptClick(PreAuthorized);
        	
        	
        	//check the page header of pre authorized page
        	WebElement PreAuthorizedPage=driver.findElement(By.xpath("//h1[contains(text(),'Virements préautorisés')]"));
        	
        	//verify the table
        	WebElement PreAuthorizedPageTable=driver.findElement(By.xpath("(//div[contains(@id,'RBCTransHistPreHolderApp')])[3]"));
        	
        	//verify the disclaimer text
        	WebElement disclaimer=driver.findElement(By.xpath("//div[contains(text(),'responsabili')]"));
        	
        	if(PreAuthorizedPage.isDisplayed() && PreAuthorizedPageTable.isDisplayed() && disclaimer.isDisplayed())
        	{
        		System.out.println("Page header, table content and disclaimer/Afficher les avis de non-responsabilité content verified in French successfully");
        	}
        	
        	//Edit label in French
        	WebElement EditLabel=driver.findElement(By.xpath("(//div[contains(text(),'Edit')])[1]"));
        	
        	//Edit button verify
        	WebElement EditButton=driver.findElement(By.xpath("//button[contains(@class,'RBCTransPreEditBtn')]"));
        	
        	if(EditLabel.isDisplayed() && EditButton.isDisplayed())
        	{
        		System.out.println("EditLabel content and EditButton verified successfully");
        	}
      
    	}
    	
    }
    
    public void Message_Received_EN()
    {
    	
    	//click on messages
   	    WebElement Messages=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Messages')]"));
	    uidriver.javascriptClick(Messages);
    	
    	//click on new tab button
    	WebElement NewTab=driver.findElement(By.xpath("//div[@data-app='RBCMessagesTabsV4.Input.App']/div/div/div/div/div/div/div/span[contains(text(),'New')]"));
    	uidriver.javascriptClick(NewTab);
    	
    	//verify new messages received
    	WebElement Messages_Table=driver.findElement(By.xpath("//div[@data-app='RBCMessagesTabsV4.Input.App']/div/div/div/div/div/div/div/span[contains(text(),'New')]"));
    	WebElement NoMessagesLabel=driver.findElement(By.xpath("//span[contains(text(),'You do not have any messages to view')]"));
    	
    	if(NoMessagesLabel.isDisplayed())
    	{
    		System.out.println("No messages are there to view");
    	}
    	
    	else
    	{
    		System.out.println("Messages received and viewed successfully");
    	}
    	
    	
    }

    public void NewMessage_FR()
    {
    	//click on messages
    	WebElement Messages=driver.findElement(By.xpath("//div[@id='CL_ComponentMenuDefault']/div/div/div/div/div/div/ul//div/div/span/span[contains(text(),'Messages')]"));
    	uidriver.javascriptClick(Messages);

    	//New message button
    	WebElement NewMessageButton=driver.findElement(By.xpath("//div[@data-app='RBCCreateNewMsgBtn.Input.App']/div/div/div/button/div/span[contains(text(),'Nouveau message')]"));

    	//switchtotab
    	
    	
    	//click on To drowndown
    	WebElement To_dropdown=driver.findElement(By.xpath("(//div[@data-app='RBCNewMessageV4.Input.App']/div/div/div)[1]/div"));
    	uidriver.javascriptClick(To_dropdown);
    	
    	//click on the value in the dropdown
    	WebElement To_Values=driver.findElement(By.xpath("(//div[@class='dx-list-group']//div[3])[1]"));
    	uidriver.javascriptClick(To_Values);
    	
    	//click on object drowndown
    	WebElement Subject_dropdown=driver.findElement(By.xpath("(//div[@data-app='RBCNewMessageV4.Input.App']/div/div/div)[2]/div"));
    	uidriver.javascriptClick(Subject_dropdown);
    	
    	//click on the value in the dropdown
    	WebElement Subject_Values=driver.findElement(By.xpath("(//div[@class='dx-popup-content'])[9]/div/div/div/div/div/div[2]"));
    	uidriver.javascriptClick(Subject_Values);
    	
    	//div in blue
    	WebElement Blue=driver.findElement(By.xpath("(//div[@data-app='RBCNewMessageV4.Input.App']/div/div/div)[4]/div"));
    	
    	//fill the values in messages textarea
    	WebElement Messages_TextArea=driver.findElement(By.xpath("(//div[@data-app='RBCNewMessageV4.Input.App']/div/div/div)[5]/div/div/textarea"));
    	Messages_TextArea.click();
    	Messages_TextArea.sendKeys("Messages");
    	
    	//press on send/Envoyer button
    	WebElement Send_Button=driver.findElement(By.xpath("(//div[@class='dx-button-content']/span[contains(text(),'Envoyer')])[1]"));
    	Send_Button.click();
    	
    	//Envoyer/send tab
    	WebElement Send_Tab=driver.findElement(By.xpath("//div[@data-app='RBCMessagesTabsV4.Input.App']/div/div/div/div/div/div/div/span[contains(text(),'Envoyé')]"));
    	Send_Tab.click();
    	
    	//verify message sent or not
    	WebElement Message_sent=driver.findElement(By.xpath("(((//div[@data-app='RBCMessagesTabsV4.Input.App']/div/div/div/div/div/div)[7]/div/div/div/div/div/div/div/div/div//following-sibling::div[4]/div)[2]/div/div/div/table/tbody/tr/td/span)[1]"));
    	String Message_Sent_Date=Message_sent.getText().substring(0,2);
    	
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-YYYY");  
    	LocalDateTime now = LocalDateTime.now();  
    	String Date=dtf.format(now); 
    	Date=Date.replaceAll("-", " ").replaceAll("0", "0").substring(0,2);
    	if(Date.contains(Message_Sent_Date))
    	{
    		System.out.println("Message sent and verified successfully");
    	}
    	
    }
    

    public static void main(String[] args) 
	{
    
	    //((JavascriptExecutor)driver).executeScript("document.getElementById('K11')");
	}
	
}
