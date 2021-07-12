package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseinit.Base;

public class pageObjects {
	
	public pageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='UserName']")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id='Secret']")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id='captcha']")
	public static WebElement Captcha;
	
	@FindBy(xpath="//*[@id='ctl00_SiteMapPath1']/span[1]/a")
	public static WebElement FireflyHomepage;
	
	@FindBy(xpath="//*[@id='captcha']")
	public static String Captcha1;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div/div/span[1]")
	public static WebElement Month;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div/div/span[2]")	
	public static WebElement year;
	
	@FindBy(xpath="//*[@id='datepicker_from']")
	public static WebElement listtable;
	
	@FindBy(xpath="//*[@id='page-top']/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[3]/div/button/span")
	public static WebElement pagetops;
	
	
	@FindBy(xpath="//*[@id='go_to_forgotpass1']")
	public static WebElement forgetpassword1;
	
	
	@FindBy(xpath="//*[@id='SecurityQuestion1']")
	public static List<WebElement>  select1;
	
	
	@FindBy(xpath="//*[@id='SecurityAns1']")
	public static WebElement select1ans;
	
	
	@FindBy(xpath="//*[@id='SecurityQuestion2']")
	public static List<WebElement>  select2;
	
	
	@FindBy(xpath="//*[@id='SecurityAns2']")
	public static WebElement select1ans2;
	
	@FindBy(xpath="//*[@id='inputCaptcha']")
	public static WebElement forgetpasswordcaptchaimage;
	
	@FindBy(xpath="//*[@id='inputCaptcha']")
	public static WebElement forgetpasswordcaptcha;
	
	
	@FindBy(xpath="//*[@id='submitrequest']")
	public static WebElement submit;
	
	@FindBy(xpath="//*[@id='go_to_register1']")
	public static WebElement createacc;
	
	@FindBy(xpath="//*[@id='OrgName']")
	public static WebElement organizationname;

	@FindBy(xpath="//*[@id='BusinessType']")
	public static WebElement Bussinesstype;
	
	@FindBy(xpath="//*[@id=\'Address_Address\']")
	public static WebElement Addresss;
	
	@FindBy(xpath="//*[@id='Address_Zip']")
	public static WebElement zipcode;
	
	
	@FindBy(xpath="//*[@id='Address_Phone']")
	public static WebElement phone;
	
	
	@FindBy(xpath="//*[@id='Address_Email']")
	public static WebElement Email;
	
	
	@FindBy(xpath="//*[@id='Address_CountryId']")
	public static List<WebElement> country;
	
	
	@FindBy(xpath="//*[@id=\"reg_mernext_step1_2\"]")
	public static WebElement next;
	
	@FindBy(xpath="//*[@id='reg_mernext_step2_3']")
	public static WebElement paymentnext;
	
	@FindBy(xpath="//*[@id=\"PaymentTypeId\"]")
	public static List<WebElement> paymenttype;
	
	@FindBy(xpath="//*[@id='ServerName']")
	public static WebElement servername;
	
	@FindBy(xpath="//*[@id='navbarResponsive']/ul/li[9]/a")
	public static WebElement signup;
	
	@FindBy(xpath="//*[@id='login-box']/div[1]/span")
	public static WebElement HomepageIcon;
	
	@FindBy(xpath="//*[@id='MerchantAccount_RegUserId']")
	public static WebElement accregisterid;
	
	@FindBy(xpath="//*[@id='MerchantAccount_Secret']")
	public static WebElement accountsetuppassword;
	
	@FindBy(xpath="//*[@id='cmerchantpass']")
	public static WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id='MerchantAccount_SecurityQuestion1']")
	public static WebElement selectquestionnumber1;
	
	@FindBy(xpath="//*[@id='MerchantAccount_SecurityAns1']")
	public static WebElement selectans1;
	
	@FindBy(xpath="//*[@id='MerchantAccount_SecurityQuestion2']")
	public static WebElement selectquestionnumber2;
	
	@FindBy(xpath="//*[@id='MerchantAccount_SecurityAns2']")
	public static WebElement selectanswer2;
	
	@FindBy(xpath="//*[@id='inputCaptcha']")
	public static WebElement inputcaptch;
	
	@FindBy(xpath="//*[@id='captcha']")
	public static WebElement inputcaptchtext;
	
	
	@FindBy(xpath="//*[@id='menu_Merchant Tickets']/a")
	public static WebElement MenuMerchant;
	
	@FindBy(xpath="//*[@id='menu_Support']/a")
	public static WebElement menusupport;
	
	@FindBy(xpath="//*[@id='submitmerchant']")
	public static WebElement submitchart;
	
	@FindBy(xpath="//*[@id='Newtickets']/span")
	public static WebElement MercentRecentTickets;
	
	@FindBy(xpath="//a[contains(@id,'par')]")
	public static List<WebElement> AdminrecentTickets;
	
	@FindBy(xpath="//*[@id='mytickets']/span")
	public static WebElement Merchentmytickets;
	
	@FindBy(xpath="//a[contains(@id,'id')]")
	public static List<WebElement> MerchentrecentTickets;	
	
	@FindBy(xpath="//*[@id='6188-tt']")
	public static List<WebElement> Adminresponse;
	
	@FindBy(xpath="//*[@id='AlterMsg']/div/div/div[3]/button")
	public static WebElement adminmerchantapprovalpopupokbutton;
	
	@FindBy(xpath="//*[@id='innerRegister']/div/div[2]/div/div/h5")
	public static WebElement forgetpasswordLabelchecking;
	
	@FindBy(xpath="//*[@id='total']")
	public static WebElement total1;
	
	@FindBy(xpath="//*[@id='sidenavToggler']/span")
	public static WebElement Minimizedbutton;
	
//	@FindBy(xpath="//*[@id='total']")
//	public static WebElement total1;
	
	@FindBy(xpath="//*[@id='page-top']/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/h4/a/span")
	public static WebElement MerchantNewTickets;
	
	@FindBy(xpath="//*[@id='title']")
	public static WebElement Merchanttickettitle;
	
	@FindBy(xpath="//*[@id='details']")
	public static WebElement Merchantticketdetails;
	
	@FindBy(xpath="//*[@id='formsupport']/div[3]/div/button")
	public static WebElement Merchantticketsubmit;
	
	@FindBy(xpath="//*[@id='AlterMsg']/div/div/div[3]/button")
	public static WebElement Merchantticketpopupconfirmation;
	
	/*@FindBy(xpath="//*[@id='details']")
	public static WebElement Merchantticketdetails;*/
	
	@FindBy(xpath="//*[@id='formsignin']/div[4]/div/input")
	public static WebElement signin;
	
	@FindBy(xpath="//span[@id='inputCaptcha']")
	public static WebElement captachatext;
	
	@FindBy(xpath="//*[@id='avatar-profile']/div[1]/img")
	public static WebElement profileimage;
	
	@FindBy(xpath="//*[@id='profile']/li/div/a[1]")
	public static WebElement userprofile;
	
	@FindBy(xpath="//*[@id='user']/ul/li[2]/a")
	public static WebElement userprofile1;
	
	@FindBy(xpath="//*[@id='menuDashboard']/a/span[2]")
	public static WebElement menudashbord;
	
	@FindBy(xpath="//*[@id='list-group-item']")
	public static List<WebElement> listgroupitem;
	
	@FindBy(xpath="//*[@id='menuReport']/a/span[2]")
	public static WebElement Report;
	
	@FindBy(xpath="//*[@id='menu_Report']/a")
	public static WebElement Report1;
	
	@FindBy(xpath="//*[@id='navbarResponsive']/ul/li[8]/a")
	public static WebElement HomepageLogin;
	
	@FindBy(xpath="//*[@id='go_to_forgotpass1']")
	public static WebElement forgetpassword;
	
	@FindBy(xpath="//*[@id='formsignin']/div[4]/div/input")
	public static WebElement signinbutton;
	
	@FindBy(xpath="//*[@id='go_to_register1']")
	public static WebElement createuser;
	

	@FindBy(xpath="//*[@id='captchaErr']")
	public static WebElement InvalidErrorMsg;
	
	@FindBy(xpath="//*[@id='btnreport']")
	public static WebElement Report2;
	
	@FindBy(xpath="\"//*[@id='reportdata']/div/span\"")
	public static WebElement Report3;
	
	@FindBy(xpath="//*[@id='menuDashboard']/a/span[2]")
	public static WebElement DashboardmenuLink;
	
	@FindBy(xpath="//*[@id='menuAccount']/a")
	public static WebElement AccountMenuLink;
	
	@FindBy(xpath="//*[@id='menu_Registrationdetails']/a")
	public static WebElement RegistrationDetails;
	
	@FindBy(xpath="//*[@id='menu_GatewayDetails']/a")
	public static WebElement GatewayDetails;
	
	@FindBy(xpath="//*[@id='menuGateway']/span[2]")
	public static WebElement GatewayDetailsMenu;
	
	@FindBy(xpath="//*[@id='menu_GatewayPaymentType']/a")
	public static WebElement GatewayPaymentType;
	
	@FindBy(xpath="//*[@id='page-top']/div[2]/div/div/div[2]/div/div/div")
	public static WebElement Registrationlinktable;
	
	@FindBy(xpath="//*[@id='RegiUserdetail']/thead/tr[2]/th[2]/input")
	public static WebElement RegistrationUsernamesearch;
	
	@FindBy(xpath="//*[@id='RegiUserdetail']/thead/tr[2]/th[6]/input")
	public static WebElement RegistrationActionsearch;
	
	@FindBy(xpath="//*[@id='approve']")
	public static WebElement Registrationapproveimage;
		
	@FindBy(xpath="//*[@id='cancel']")
	public static WebElement Registrationcancelimage;
	
	@FindBy(xpath="//*[@id='userdetails']/tr[1]/td[8]/input[1]")
	public static WebElement RegistrationRemarkssection;
	
	@FindBy(xpath="//*[@id='userdetails']/tr[1]/td[6]")
	public static WebElement Registrationapprovestatus;
	
	@FindBy(xpath="//*[@id='Eftusername']")
	public static List<WebElement> DashboardSelectUser;
	
	@FindBy(xpath="//*[@id='Tran-summary_Details']/div/div/div/div/span/button")
	public static WebElement GetDetails;
		
	@FindBy(xpath="//*[@id='total']")
	public static WebElement TotalTransaction;
	
	@FindBy(xpath="//*[@id='RegiUserdetail_info']")
	public static WebElement Registrationtotalentries;
	
	@FindBy(xpath="//*[@id='Gatewaynv']/li[2]/a/span[2]")
	public static WebElement PaymentType;
	
	@FindBy(xpath="//*[@id='PaymentTypeTable_info']")
	public static WebElement PaymentTypetotalcountentries;
	
	@FindBy(xpath="//input[contains(@id,'UserName')]")
	public static WebElement Usernamebutton123;
	
	@FindBy(xpath="//*[@id='UserName']")
	public static WebElement Usernamebuttonfirefly;
	
	@FindBy(xpath="//*[@id='menu_Paymenttype']/a")
	public static WebElement PaymentTypemenu;
	
	@FindBy(xpath="//*[@id='menu_Paymentoption']/a")
	public static WebElement PaymentOption;
	
	@FindBy(xpath="//*[@id='menu_GatewayService']/a")
	public static WebElement GatewayService;
	
	@FindBy(xpath="//*[@id='menuReport']/a")
	public static WebElement ReportLink;
	
	@FindBy(xpath="//*[@id='menu_Report']/a")
	public static WebElement PaymentReport;
	
	@FindBy(xpath="//*[@id='menu_RTPReport']/a")
	public static WebElement Requesttopaymentreport;
	
	@FindBy(xpath="//*[@id='MerchantTickets']/a/span[2]")
	public static WebElement MerchantTickets;
	
	@FindBy(xpath="//*[@id='menuDeployment']/a/span[2]")
	public static WebElement Deployment;
	
	@FindBy(xpath="//*[@id='menu_Deployment']/a")
	public static WebElement Deployment1;
	
	@FindBy(xpath="//*[@id='menu_AlertMaster']/a")
	public static WebElement AlterMaster;
	
	
	@FindBy(xpath="//*[text()='Payment']")
	public static WebElement Payment;
	
	@FindBy(xpath="//*[@id='avatar-profile']/div[1]/img")
	public static WebElement LogoutImage;
	
	@FindBy(xpath="//*[@id='menu_Support']/a")
	public static WebElement MakePayment;
	
	@FindBy(xpath="//*[@id='profile']/li/div/a[2]")
	public static WebElement signout;
	
	@FindBy(xpath="//*[@id='signout']/div/div/div[3]/a")
	public static WebElement signoutsurepopup;
	
	@FindBy(xpath="//*[@id='page-top']/div[2]/div/div/div[1]/div/div/h5")
	public static WebElement LabelChecking;
	
	
	@FindBy(xpath="//*[@id='UserName']")
	public static WebElement Username1;
	
	@FindBy(xpath="//*[@id='Password']")
	public static WebElement Password1;
	
	@FindBy(xpath="//*[@id=\"Domain\"]")
	public static List<WebElement> Domain1;
	
	@FindBy(xpath="//*[@id='btn_login']")
	public static WebElement Login1;
	
		
	@FindBy(xpath="//ul[@id='ddl_pjct']//li//a")
	public static List<WebElement> dropdown1;
	
	@FindBy(xpath="//*[@id='navbar1']/ul[2]/li/a/span[1]")
	public static WebElement dropdownvisibletext;
	
	@FindBy(xpath="//*[@id='content']/span[1]/ul/li/a")
	public static List<WebElement> ElementList;
		
}
