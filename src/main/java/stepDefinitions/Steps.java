package stepDefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseinit.Base;
import cucumber.api.java.en.When;
import framework.Elements;
import framework.Waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Beats;
import pageObjects.*;
//import pageObjects.Beats;
import pageObjects.pageObjects;
import util.EmailUtil;

public class Steps {

	public WebDriver driver;
	public Beats BP;
	public static List<String> options;
	public String outtext, ss, sss;
	public Integer ss1;
	public static String scenarioName;

	SoftAssertions sft = new SoftAssertions();
	// Beats bea123 = new Beats(null);
	// Beats Beats1=new Beats();

	/*
	 * @Given("navigate to url") public void navigate_to_url() {
	 * Base.driver.navigate().to(PropertyFileReader.properties.getProperty("url"));
	 * }
	 */

	@Then("enter the captcha")
	public void enter_captcha() {
		Waits.waitUntilElementLocated(60, pageObjects.Captcha);
		Elements.TypeText(pageObjects.Captcha, Elements.getText(pageObjects.captachatext));
	}

	/*
	 * @Then("enter the captcha1") public void enter_captcha1() {
	 * Waits.waitUntilElementLocated(60, pageObjects.Captcha); String
	 * st=Elements.getText(pageObjects.captachatext); st=st+"1";
	 * Elements.TypeText(pageObjects.Captcha, st); System.out.println("Welcome"); }
	 */

	@Then("enter the captcha1")
	public void enter_captcha1() {
		Waits.waitUntilElementLocated(60, pageObjects.Captcha);
		String st = Elements.getText(pageObjects.captachatext);
		st = st + "1";
		Elements.TypeText(pageObjects.Captcha, st);
		System.out.println("Welcome");
	}

	@Then("title of the page should be {string}")
	public void title_of_the_page_should_be(String title) throws InterruptedException {
		Thread.sleep(3000);
		String shk = Elements.getTitle();
		System.out.println(shk);
		// Assert.assertEquals(Elements.getTitle(), title);
		// Assert.
		if (shk.contains(title)) {

			Assert.assertEquals(title, title);

		} else {
			Assert.assertEquals(shk, title);
		}

		/*
		 * String getprovalue=Base.driver.findElement(By.xpath("//*[@id='captcha']")).
		 * getCssValue("background-color"); System.out.println(getprovalue); String
		 * getprovalue1=Base.driver.findElement(By.xpath("//*[@id='captcha']")).
		 * getAttribute("style"); System.out.println(getprovalue1);
		 */

	}

	@Then("It shows red line message as {string}")
	public void It_shows_red_line_message_as(String title2) throws InterruptedException {

		Thread.sleep(3000);

		String err1 = Elements.getbackgroundcolor("//*[@id='captcha']");
		System.out.println(err1);
		if (err1.equalsIgnoreCase(title2)) {

			Assert.assertEquals(err1, err1);

		} else {
			Assert.assertEquals(err1, title2);
		}

	}

	@When("Click Forgotpassword button")
	public void Click_Forgotpassword_button() {

		Elements.click(pageObjects.forgetpassword1);

	}

	@Then("Check all the menu option opened in the page details or not")
	public void Check_all_the_menu_option_opened_in_the_page_details_or_not() throws InterruptedException {

		String expstri = "", actstri = "";
		expstri = "DashBoard,Registration Details,Gateway Details,Gateway Payment Type,Payment Type,Payment Option,GateWay Service,Report,Request To Payment,Support,Deployment,Alert Master,Make Payment";
		Elements.click(pageObjects.DashboardmenuLink);
		Thread.sleep(1000);
		String lab = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab);
		actstri = lab;
		Elements.click(pageObjects.AccountMenuLink);
		Thread.sleep(1000);
		String lab1 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab1);
		// actstri=actstri+","+lab1;
		Elements.click(pageObjects.RegistrationDetails);
		Thread.sleep(1000);
		String lab2 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab2);
		actstri = actstri + "," + lab2;
		Thread.sleep(1000);
		Elements.click(pageObjects.AccountMenuLink);
		Thread.sleep(1000);
		Elements.click(pageObjects.GatewayDetails);
		Thread.sleep(1000);
		String lab3 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab3);
		actstri = actstri + "," + lab3;
		/*
		 * Thread.sleep(1000); Elements.click(pageObjects.AccountMenuLink);
		 */
		Thread.sleep(1000);
		/*
		 * Elements.click(pageObjects.GatewayDetailsMenu); Thread.sleep(1000); String
		 * lab4=Elements.getText(pageObjects.LabelChecking); System.out.println(lab4);
		 */
		/*
		 * Thread.sleep(1000); Elements.click(pageObjects.GatewayDetailsMenu);
		 * Thread.sleep(1000);
		 */
		/*
		 * Thread.sleep(1000); Elements.click(pageObjects.GatewayDetailsMenu);
		 */
		Thread.sleep(1000);
		Elements.click(pageObjects.GatewayPaymentType);
		Thread.sleep(1000);
		String lab5 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab5);
		actstri = actstri + "," + lab5;
		Thread.sleep(1000);
		// Elements.click(pageObjects.GatewayDetailsMenu);
		Thread.sleep(1000);
		// Elements.click(pageObjects.PaymentType);
		Thread.sleep(1000);
		String lab6 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab6);
		// actstri=actstri+","+lab6;
		Thread.sleep(1000);
		// Elements.click(pageObjects.GatewayDetailsMenu);
		Thread.sleep(1000);
		Elements.click(pageObjects.PaymentType);
		Thread.sleep(1000);
		Elements.click(pageObjects.PaymentTypemenu);
		Thread.sleep(1000);
		String lab7 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab7);
		actstri = actstri + "," + lab7;
		Thread.sleep(1000);
		Elements.click(pageObjects.GatewayDetailsMenu);
		Thread.sleep(1000);
		Elements.click(pageObjects.PaymentType);
		Thread.sleep(1000);
		Elements.click(pageObjects.PaymentOption);
		Thread.sleep(1000);
		String lab8 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab8);
		actstri = actstri + "," + lab8;
		Thread.sleep(1000);
		Elements.click(pageObjects.GatewayDetailsMenu);
		Thread.sleep(1000);
		Elements.click(pageObjects.GatewayService);
		Thread.sleep(1000);
		String lab9 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab9);
		actstri = actstri + "," + lab9;
		/*
		 * Thread.sleep(1000); Elements.click(pageObjects.ReportLink);
		 */
		/*
		 * Thread.sleep(1000); String lab10=Elements.getText(pageObjects.LabelChecking);
		 * System.out.println(lab10);
		 */
		Thread.sleep(1000);
		Elements.click(pageObjects.ReportLink);
		Thread.sleep(1000);
		Elements.click(pageObjects.PaymentReport);
		Thread.sleep(1000);
		String lab11 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab11);
		actstri = actstri + "," + lab11;
		Thread.sleep(1000);
		// Elements.click(pageObjects.ReportLink);
		Thread.sleep(1000);
		Elements.click(pageObjects.Requesttopaymentreport);
		Thread.sleep(1000);
		String lab12 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab12);
		Thread.sleep(1000);
		actstri = actstri + "," + lab12;
		Elements.click(pageObjects.MerchantTickets);
		Thread.sleep(1000);
		Elements.click(pageObjects.MenuMerchant);
		Thread.sleep(1000);
		String lab13 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab13);
		actstri = actstri + "," + lab13;
		Thread.sleep(1000);
		Elements.click(pageObjects.Deployment);
		Thread.sleep(1000);
		String lab14 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab14);
		/*
		 * actstri=actstri+","+lab14; Thread.sleep(1000);
		 * Elements.click(pageObjects.Deployment);
		 */
		Thread.sleep(1000);
		Elements.click(pageObjects.Deployment1);
		Thread.sleep(1000);
		String lab15 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab15);
		actstri = actstri + "," + lab15;
		Thread.sleep(1000);
		Elements.click(pageObjects.Deployment);
		Thread.sleep(1000);
		Elements.click(pageObjects.AlterMaster);
		Thread.sleep(1000);
		String lab16 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab16);
		actstri = actstri + "," + lab16;
		Thread.sleep(1000);
		/*
		 * Elements.click(pageObjects.Payment); Thread.sleep(1000); String
		 * lab17=Elements.getText(pageObjects.LabelChecking); System.out.println(lab17);
		 * actstri=actstri+","+lab17;
		 */
		Thread.sleep(1000);
		Elements.click(pageObjects.Payment);
		Thread.sleep(1000);
		Elements.click(pageObjects.MakePayment);
		Thread.sleep(1000);
		String lab18 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab18);
		actstri = actstri + "," + lab18;

		System.out.println(expstri);
		System.out.println(actstri);

		Assert.assertEquals(expstri, actstri);
	}

	@Then("it will redirect to Password reset page as {string}")
	public void it_will_redirect_to_Password_reset_page_as(String pagedire) throws InterruptedException {

		Thread.sleep(3000);
		String errmsg2 = Elements.getText(pageObjects.forgetpasswordLabelchecking);

		if (errmsg2.contains(pagedire)) {

			Assert.assertEquals(pagedire, pagedire);

		} else {
			Assert.assertEquals(errmsg2, pagedire);
		}

	}

	@Then("select the question as {string}")
	public void select_the_question_as(String selval1) throws InterruptedException {

		Thread.sleep(3000);
		// Elements.selectByValue(pageObjects.select1, selval1);
		// Elements.selectByText(pageObjects.select1, selval1);
		// Elements.selectByTextSen(pageObjects.select1, selval1);
		Elements.selectByTextSen(pageObjects.select1, selval1);

	}

	@Then("select the questiontwo as {string}")
	public void select_the_questiontwo_as(String selval2) throws InterruptedException {

		Thread.sleep(3000);
		// Elements.selectByValue(pageObjects.select2, selval2);
		Elements.selectByTextSen(pageObjects.select2, selval2);

	}

	@Then("give answer as {string}")
	public void give_answer_as(String ans) {

		Elements.TypeText(pageObjects.select1ans, ans);
	}

	@Then("give answertwo as {string}")
	public void give_answertwo_as(String ans2) {

		Elements.TypeText(pageObjects.select1ans2, ans2);
	}

	@Then("click submit button")
	public void click_submit_button() {

		Elements.click(pageObjects.submit);

	}

	@Then("sendemail")
	public void sendmail() throws IOException {

		EmailUtil.sendEmailAfterLogs();

	}

	@Then("It shows error message as {string}")
	public void It_shows_error_message_as(String title1) throws InterruptedException {

		Thread.sleep(3000);
		String shk1 = Elements.getText(pageObjects.InvalidErrorMsg);
		System.out.println(shk1);
		// Assert.assertEquals(Elements.getTitle(), title);
		// Assert.
		if (shk1.contains(title1)) {

			Assert.assertEquals(title1, title1);

		} else {
			Assert.assertEquals(shk1, title1);
		}

	}

	@Then("Tab the Menu Button")
	public void TabtheMenubutton() {

		Elements.click(pageObjects.Minimizedbutton);
	}

	@Then("Menu bar option shuold get minimized and Maximized")
	public void Menu_bar_Option_should_get_minimized_and_maximized() {

		boolean chk123 = Elements.isDisplayed(pageObjects.DashboardmenuLink);

		if (!chk123) {

			System.out.println("Success");

		} else {

			System.out.println("Failure");

		}

	}

	@Then("Click Under Gateway details and check Payment details,Payment Type,Gateway details,Gateway payment type and Gateway services")
	public void Click_Under_Gateway_details_and_check_Payment_details_Payment_Type_Gateway_details_Gateway_payment_type_and_Gateway_services()
			throws InterruptedException {

		boolean chr = Elements.isDisplayed(pageObjects.GatewayDetailsMenu);
		if (!chr) {

			Assert.assertEquals("Gatewaydetailmenu", "not displayed");

		}
		Elements.click(pageObjects.GatewayDetailsMenu);
		chr = Elements.isDisplayed(pageObjects.GatewayPaymentType);
		if (!chr) {

			Assert.assertEquals("Gatewaytypemenu", "not displayed");

		}
		Thread.sleep(3000);
		Elements.click(pageObjects.PaymentType);
		Thread.sleep(3000);
		chr = Elements.isDisplayed(pageObjects.PaymentType);
		if (!chr) {

			Assert.assertEquals("Paymenttype", "not displayed");

		}
		chr = Elements.isDisplayed(pageObjects.PaymentTypemenu);
		if (!chr) {

			Assert.assertEquals("Paymenttypemenu", "not displayed");

		}
		chr = Elements.isDisplayed(pageObjects.PaymentOption);
		if (!chr) {

			Assert.assertEquals("PaymentOption", "not displayed");

		}
		chr = Elements.isDisplayed(pageObjects.GatewayService);
		if (!chr) {

			Assert.assertEquals("Gatewayservice", "not displayed");

		}

	}

	@Then("Click on login button")
	public void click_on_login_button() {

		Elements.click(pageObjects.signin);
	}

	@Then("select from date as {string}")
	public void select_from_date_as(String datetext) {

		Elements.click(pageObjects.listtable);

		Elements.Dateselect(datetext);
	}

	@Then("click on getdetails")
	public void click_on_getdetails() {

		Elements.click(pageObjects.pagetops);

	}

	@Then("transaction count should be displayed")
	public void transaction_count_should_be_displayed() {

		Elements.click(pageObjects.total1);
	}

	@Then("Click Login Button in Home Page")
	public void Click_Login_Button_in_Home_Page() {

		Elements.click(pageObjects.HomepageLogin);

	}

	@Then("Check the Forgot button in the Login Page")
	public void Check_the_Forget_button_in_the_Login_Page() throws InterruptedException {

		Thread.sleep(3000);
		boolean sen = Elements.isDisplayed(pageObjects.forgetpassword);
		System.out.println(sen);

	}

	@Then("Check the Signin button in the Login Page")
	public void Check_the_Signin_button_in_the_Login_Page() throws InterruptedException {

		Thread.sleep(3000);
		boolean sen1 = Elements.isDisplayed(pageObjects.signinbutton);
		System.out.println(sen1);

	}

	@Then("Check the createuser button in the Login Page")
	public void Check_the_createuser_button_in_the_Login_Page() throws InterruptedException {

		Thread.sleep(3000);
		boolean sen2 = Elements.isDisplayed(pageObjects.createuser);
		System.out.println(sen2);

	}

	@Then("click on reports")
	public void click_on_reports() {

		Elements.click(pageObjects.Report);

	}

	@Then("click on payment report")
	public void click_on_payment_report() {

		Elements.click(pageObjects.Report1);

	}

	@Then("click on getreport button")
	public void click_on_getreport_button() {

		Elements.click(pageObjects.Report2);

	}

	@Then("system should display {string}")
	public void system_should_display(String act) {

		String exp = Elements.getText(pageObjects.Report3);
		Assert.assertEquals(exp, act);

	}

	@Then("click on myprofile image")
	public void click_on_myprofile_image() {

		Elements.click(pageObjects.profileimage);

	}

	@Then("click on myprofile link")
	public void click_on_myprofile_link() throws InterruptedException {

		Thread.sleep(3000);
		Elements.click(pageObjects.userprofile);

	}

	@Then("click on payment option")
	public void click_on_payment_option() throws InterruptedException {

		Thread.sleep(3000);
		Elements.click(pageObjects.userprofile1);

	}

	@Then("click on credit checkbox")
	public void click_on_credit_checkbox() throws InterruptedException {

		Thread.sleep(3000);
		// Elements.click(pageObjects.listgroupitem);
		System.out.println(pageObjects.listgroupitem);
		// WebElement sat=pageObjects.listgroupitem;
		// String ade=String. sat;
		Elements.clickcheckbox(pageObjects.listgroupitem, "credit");

	}

	@Given("Navigate to URL {string}")
	public void navigatetourl(String url) throws InterruptedException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir")+"/drivers/Windows/Chrome/chromedriver.exe");
		 * Thread.sleep(1000); Base.driver=new ChromeDriver();
		 * 
		 * BP= new Beats(Base.driver); Base.driver.manage().window().maximize();
		 */
		Base.driver.get(url);
		pageObjects ob = new pageObjects(Base.driver);
		Thread.sleep(3000);
		// bea123.callurl(url);

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir")+"/drivers/Windows/Chrome/chromedriver.exe");
		 * driver = new ChromeDriver(); //WebDriverWait wait=new WebDriverWait(driver,
		 * 50); driver.manage().window().maximize(); driver.get(url);
		 * driver.manage().window().maximize();
		 */

	}
	
	

	@Given("Call the Catching Service {string} and {string}")
	public void callthecatchingservice(String url,String Methodname) throws MalformedURLException, IOException, InterruptedException {
		
		scenarioName=url;
	         
	   if(url.contains("hhhtttttttp://"))
	   {
		   HttpURLConnection.setFollowRedirects(false);
		   HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		        con.setRequestMethod("GET");
	          int a =con.getResponseCode();
	          
	          System.out.println(a);
	          
	             int b=HttpURLConnection.HTTP_OK;
	             
	             Assert.assertEquals(a, b);
	   }else
	   {
		   
		   calltheurl(url);
		   Check_the_method_as(Methodname);   
		   /*try
		   {
		   HttpsURLConnection.setFollowRedirects(false);
		   HttpsURLConnection con = (HttpsURLConnection) new URL(url).openConnection();
		      //  con.setRequestMethod("GET");
	          int a =con.getResponseCode();
	          
	          System.out.println(a);
	          
	             int b=HttpURLConnection.HTTP_OK;
	             
	             Assert.assertEquals(a, b);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }*/
	   }
	             
/*	             if(a == b)
	             {
	              System.out.println("True");
	             }else
	             {
	              System.out.println("False");
	             }*/
		
	};
	
	
	@Given("Call the URL {string}")
	public void test(String string) throws IOException  {
		scenarioName=string;
	   Base.driver.navigate().to(string);
	   pageObjects ob = new pageObjects(Base.driver);
	}
	

	@Given("Call the URL <URL>")
	public void calltheurl(String URL) throws InterruptedException {
		scenarioName=URL;
		//Base.driver.get(URL);
		Base.driver.navigate().to(URL);
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pageObjects ob = new pageObjects(Base.driver);
		Thread.sleep(5000);
	}
	
	@Given("Navigate to URLLL <URL>")
	public void navigatetourll11(String URL) throws InterruptedException {

		Base.driver.get(URL);
		pageObjects ob = new pageObjects(Base.driver);
		Thread.sleep(3000);
		
	}
	
	/*@Given("Navigate to URLLL {string}")
	public void navigatetourll(String string) {
	    
		
	}*/

	@Then("Check login page displayed or not")
	public void check_login_page_displayed_or_not() throws InterruptedException {

		boolean s=false;
		//boolean s=Elements.isDisplayed(pageObjects.Usernamebutton123);
		String fh=Base.driver.getTitle();
		Thread.sleep(5000);
		System.out.println(fh);
		if(!fh.trim().equalsIgnoreCase("Login Page") && fh.trim().equalsIgnoreCase("Error Page")) {
			Waits.waitUntilElementToClick(60, pageObjects.FireflyHomepage);
			Elements.click(pageObjects.FireflyHomepage);
			Thread.sleep(10000);
			Waits.waitUntilElementLocated(60, pageObjects.Usernamebutton123);
			s=Elements.isDisplayed(pageObjects.Usernamebutton123);
			System.out.println(s);
		}else if (fh.trim().equalsIgnoreCase("Firefly")) {
			Waits.waitUntilElementLocated(60, pageObjects.Usernamebuttonfirefly);
			s=Elements.isDisplayed(pageObjects.Usernamebuttonfirefly);
			System.out.println(s);
			
		}else if (fh.trim().equalsIgnoreCase("Login Page")) {
			Waits.waitUntilElementLocated(60, pageObjects.Usernamebutton123);
			s=Elements.isDisplayed(pageObjects.Usernamebutton123);
			System.out.println(s);
			
		}
		
	}
	

	@Then("enter username as {string} and password as {string}")
	public void enterusernameandpassword(String inp1, String inp2) throws InterruptedException {

		/*
		 * Elements.TypeText(pageObjects.Username1, inp1);
		 * 
		 * Elements.TypeText(pageObjects.Password1, inp2);
		 */

		Elements.TypeText(pageObjects.username, inp1);

		Elements.TypeText(pageObjects.Password, inp2);

		Thread.sleep(3000);
	}

	@Then("select Domain as {string}")
	public void select_Domain_as(String inp5) {

		Elements.selectByTextSen(pageObjects.Domain1, inp5);

	}

	@Then("select items in the drop down")
	public void select_items_in_the_drop_down() throws InterruptedException {

		// Elements.selectByTextSenall(pageObjects.dropdown1);
		// List<WebElement> ele=Elements.getAllOptions(pageObjects.dropdown1);

		/*
		 * WebElement sq=pageObjects.dropdown1;
		 * 
		 * 
		 * Elements.getAllOptions(sq);
		 */

		options = new ArrayList<String>();

		int a = pageObjects.dropdown1.size();
		for (int i = 0; i <= a; i++) {

			options.add(pageObjects.dropdown1.get(i).getText());
			System.out.println(pageObjects.dropdown1.get(i).getText());
			// WebElement sse="//*[@id='ddl_pjct']/li[3]/a";
			/*
			 * System.out.println("Welcome");
			 * Base.driver.findElement(By.xpath("//*[@id='Shipment']/a")).click();
			 * Base.driver.findElement(By.xpath("//*[@id='navbar1']/ul[2]/li")).click();
			 */
			System.out.println("Welcome1");
			if (i != 1) {

				Base.driver.findElement(By.xpath("//span[contains(@class, 'current-selected')]")).click();
				Thread.sleep(3000);
				Base.driver.findElement(By.xpath("//*[@id='ddl_pjct']/li[" + i + "]/a")).click();
				Thread.sleep(5000);

			}

			// Select select1=new Select((WebElement) pageObjects.dropdown1);
			// select1.selectByIndex(i);

			Thread.sleep(5000);
			// Base.driver.findElement(By.xpath(pageObjects.dropdownvisibletext))
			String ss = Elements.getText(pageObjects.dropdownvisibletext);
			System.out.println(ss);
			String outtext = ((WebElement) pageObjects.dropdownvisibletext).getText();
			System.out.println(outtext);

		}

	}

	@Then("Check the method as {string}")
	public void Check_the_method_as(String inpsen) {

		String method1 = "";
		List<String> methodnames = new ArrayList<String>();
		String[] str = inpsen.split(",");

		int h = 0;
		for (String as : str) {

			methodnames.add(as);
			//System.out.println(as);

		}

		Waits.waitUntilElementLocated(15, pageObjects.ElementList);
		int siz = pageObjects.ElementList.size();
		int fg = 1;
		Assert.assertNotEquals(0, siz);
		// for(int siz1=0;siz1<siz;siz1++) {
		for (int jk = 0; jk < methodnames.size(); jk++) {

			// String method1=pageObjects.ElementList.get(siz1).getAttribute("text");
			// String method1=pageObjects.ElementList.get(siz1).getText();
			String dd = methodnames.get(jk);
			// System.out.println(method1);
			int k = 0;
			// for (int jk=0;jk<methodnames.size();jk++) {
			for (int siz1 = 0; siz1 < siz; siz1++) {

				method1 = pageObjects.ElementList.get(siz1).getText();
				// String dd=methodnames.get(jk);
				if (dd.equalsIgnoreCase(method1)) {
					// System.out.println("Success");
					Assert.assertEquals(method1, dd);
					fg = fg + 1;
				//	System.out.println(fg);
					k = 1;
					break;
				}
			}
			
			
			if(fg>1) {
				
				Assert.assertEquals(method1, dd);
				//System.out.println("Success");
				break;
				
			}

			if (k == 1) {
				Assert.assertEquals(method1, dd);
				//System.out.println("Success");
				// break;

			} else {

				Assert.assertEquals(method1, dd);
				//System.out.println("Failure");
			}

		}
		

	}

	@Then("select items in the drop down as {string}")
	public void select_items_in_the_drop_down_as_1(String dropdownlist) throws InterruptedException {

		Thread.sleep(5000);
		int d = 0;
		String actlist = "", explist = "";
		List<String> drolist = new ArrayList<String>();
		options = new ArrayList<String>();
		int a = pageObjects.dropdown1.size();
		// String s=pageObjects.dropdown1.get(index)public

		// String str = "GeeksforGeeks:A Computer Science Portal";
		String[] arrOfStr = dropdownlist.split(",");

		int k = 0;
		for (String a11 : arrOfStr) {
			System.out.println(a11);
			drolist.add(a11);
			k = k + 1;
		}

		int droloistcount = drolist.size();
		int gh = 0;
		int kjh = 0;

		// for(int i=0;i<a;i++) {
		for (int ghf = 0; ghf < droloistcount; ghf++) {

			String arraycurrentlistname = "";
			arraycurrentlistname = drolist.get(ghf);

			if (ghf == 0) {
				explist = arraycurrentlistname;
			} else {
				explist = explist + "," + arraycurrentlistname;
			}

			for (int i = 0; i < a; i++) {

				options.add(pageObjects.dropdown1.get(i).getText());
				String currentlist = "";
				currentlist = pageObjects.dropdown1.get(i).getAttribute("text");
				System.out.println(currentlist);
				System.out.println(pageObjects.dropdown1.get(i).getText());
				d = d + 1;
				int l = 0;

				outtext = "";

				if (arraycurrentlistname.equalsIgnoreCase(currentlist)) {

					Base.driver.findElement(By.xpath("//span[contains(@class, 'current-selected')]")).click();
					Thread.sleep(3000);
					int a1 = i + 1;
					Base.driver.findElement(By.xpath("//*[@id='ddl_pjct']/li[" + a1 + "]/a")).click();
					Thread.sleep(5000);
					/*
					 * String ss=Elements.getText(pageObjects.dropdownvisibletext);
					 * System.out.println(ss);
					 */
					outtext = ((WebElement) pageObjects.dropdownvisibletext).getText();
					System.out.println(outtext);

					if (kjh == 0) {
						actlist = outtext;
					} else {
						actlist = actlist + "," + outtext;
					}

					kjh = kjh + 1;

					if (outtext.equalsIgnoreCase(currentlist)) {

						// Assert.assertEquals(outtext, currentlist);
						l = 1;
						gh = gh + 1;

					} else {
						// Assert.assertEquals(outtext, currentlist);
					}

					break;

				}

			}

		}

		if (droloistcount == gh) {

			Assert.assertEquals(explist, actlist);

			System.out.println("Success");

		} else {

			Assert.assertEquals(explist, actlist);
			System.out.println("Fail");
		}

	}

	@Then("Click Login button")
	public void loginbutton() {

		/*
		 * String getprovalue=Base.driver.findElement(By.xpath("//*[@id='captcha']")).
		 * getCssValue("background-color"); System.out.println(getprovalue); String
		 * getprovalue1=Base.driver.findElement(By.xpath("//*[@id=\'captcha\']")).
		 * getCssValue("border-bottom-color"); System.out.println(getprovalue1); String
		 * getprovalue12=Base.driver.findElement(By.xpath("//*[@id='captcha']")).
		 * getCssValue("border-color"); System.out.println(getprovalue12); String
		 * colorname=Color.fromString(getprovalue1).asHex(); //String
		 * colorname=Color.fromString(getprovalue1).toString();
		 * System.out.println(colorname); String
		 * getprovalue14=Base.driver.findElement(By.xpath("//*[@id='captcha']")).
		 * getAttribute("color"); System.out.println(getprovalue14);
		 */

		Elements.click(pageObjects.signin);

		// Elements.click(pageObjects.Login1);

	}

	@Then("click create account link")
	public void click_create_account_link() {

		Elements.click(pageObjects.createacc);
	}

	@Then("check control moves to bussiness details link")
	public void check_control_moves_to_bussiness_details_link() throws InterruptedException {

		Thread.sleep(3000);
		boolean elecheck = Elements.isDisplayed(pageObjects.organizationname);
		System.out.println(elecheck);

	}

	@Then("enter organization name as {string}")
	public void enter_organization_name_as(String org) {

		Elements.TypeText(pageObjects.organizationname, org);

	}

	@Then("enter bussiness type as {string}")
	public void enter_bussiness_type_as(String bus) {

		Elements.TypeText(pageObjects.Bussinesstype, bus);

	}

	@Then("enter address as {string}")
	public void enter_address_as(String add) {

		Elements.TypeText(pageObjects.Addresss, add);

	}

	@Then("enter zipcode as {string}")
	public void enter_zipcode_as(String zip) {

		Elements.TypeText(pageObjects.zipcode, zip);
	}

	@Then("enter phone {string}")
	public void enter_phone(String phone) {

		Elements.TypeText(pageObjects.phone, phone);
	}

	@Then("enter Email {string}")
	public void enter_Email(String Email) {
		Elements.TypeText(pageObjects.Email, Email);

	}

	@Then("select country as {string}")
	public void select_country_as(String country) {

		Elements.selectByTextequalignorecase(pageObjects.country, country);
	}

	@Then("click Next button")
	public void click_Next_button() {

		Elements.click(pageObjects.next);
		System.out.println("Wekcome1");

	}

	@Then("click payment option Next button")
	public void click_payment_option_Next_button() {

		Elements.click(pageObjects.paymentnext);
		System.out.println("Wekcome1");

	}

	@Then("click Home Page button")
	public void click_Home_Page_button() {

		Elements.click(pageObjects.HomepageIcon);

	}

	@Then("Check the control moves to Login page")
	public void Check_the_control_moves_to_Login_page() {

		boolean signupchk = Elements.isDisplayed(pageObjects.signup);
		System.out.println(signupchk);

	}

	@Then("check control will moves to Payment Option tap")
	public void check_control_will_moves_to_Payment_Option_tap() {

		boolean paycheck = Elements.isDisplayed(pageObjects.servername);
		System.out.println(paycheck);

	}

	@Then("select the payment option as {string}")
	public void select_the_payment_option_as(String payoption) {

		Elements.selectByTextequalignorecase(pageObjects.paymenttype, payoption);

	}

	@Then("enter server name as {string}")
	public void enter_server_name_as(String ser) {

		Elements.TypeText(pageObjects.servername, ser);

	}

	@Then("Check the control moves to Account Setup")
	public void Check_the_control_moves_to_Account_Setup() {

		System.out.println("Hello");
		boolean accset = Elements.isDisplayed(pageObjects.accountsetuppassword);
		System.out.println(accset);

	}

	@Then("Click the Dashboard")
	public void ClicktheDashboard() throws InterruptedException {

		Elements.click(pageObjects.DashboardmenuLink);
		Thread.sleep(3000);

	}

	@Then("select the user as {string}")
	public void selecttheuser(String selval) {

		Elements.selectByTextequalignorecase(pageObjects.DashboardSelectUser, selval);

	}

	@Then("Click the Getdetails")
	public void ClicktheGetdetails() {

		Elements.click(pageObjects.GetDetails);
		ss = Elements.getText(pageObjects.TotalTransaction);
		System.out.println(ss);

	}

	@When("Get the total count of two tables as {string} and {string}")
	public void Getthetotalcountoftwotablesas(String inp1, String inp2) {

		ss1 = Elements.getdatafromDB(inp1, inp2);
		System.out.println(ss1);

	}

	@Then("Compare the total count of db with total transaction")
	public void comparethetotalcountofdbwithtotaltransaction() {

		Assert.assertEquals(ss, ss1);

	}

	@Then("Select Payment Details Link")
	public void Select_Payment_Details_Link() throws InterruptedException {

		Elements.click(pageObjects.GatewayDetailsMenu);
		Thread.sleep(3000);
		Elements.click(pageObjects.PaymentType);
		Thread.sleep(3000);
		Elements.click(pageObjects.PaymentTypemenu);
		Thread.sleep(3000);
		ss = Elements.getText(pageObjects.PaymentTypetotalcountentries);
		System.out.println(ss);
		String[] ss11 = ss.split(" ");
		String hy = "";
		int r = 0;

		for (String fg : ss11) {
			if (r == 5) {

				ss = fg;
				break;

			}
			String ft = fg;
			System.out.println(ft);
			r = r + 1;
		}

	}

	@Then("and check the number of entries shown in the menu are matches with the tables {string}")
	public void check_the_number_of_entries_shown_in_the_menu_are_matches_with_the_tables(String inp1) {

		Integer sgh = 0;
		ss1 = 0;
		ss1 = Elements.getdatafromsingletableDB1(inp1);
		System.out.println(ss1);
		sgh = Integer.parseInt(ss);
		Assert.assertEquals(ss1, sgh);

	}

	@Then("Click the Registration Details menu")
	public void Clicktheregisterdetailsmenu() throws InterruptedException {

		Integer df = 0;
		Elements.click(pageObjects.AccountMenuLink);
		Thread.sleep(1000);
		String lab1 = Elements.getText(pageObjects.LabelChecking);
		System.out.println(lab1);
		Elements.click(pageObjects.RegistrationDetails);
		Thread.sleep(3000);
		Elements.scrollIntoView(pageObjects.Registrationtotalentries);
		Thread.sleep(3000);
		// String sss;
		sss = Elements.getText(pageObjects.Registrationtotalentries);
		System.out.println(sss);
		String[] sd = sss.split(" ");

		for (String sf : sd) {

			System.out.println(sf);

			if (df == 1) {
				ss = sf;
				break;
			}

			if (sf.equalsIgnoreCase("of")) {
				df = 1;
			}
		}

	}

	@Then("and check the number of entries shown in the menu are matches with the tables as {string}")
	public void checkthenumberofentriesshowninthemenuarematcheswiththetables(String inp1) {

		Integer sgh = 0;
		ss1 = 0;
		ss1 = Elements.getdatafromsingletableDB(inp1);
		System.out.println(ss1);
		sgh = Integer.parseInt(ss);
		Assert.assertEquals(ss1, sgh);

	}

	@Then("select the user as {string} and {string}")
	public void selecttheuseras(String inp1, String inp2) throws InterruptedException {

		Elements.TypeText(pageObjects.RegistrationUsernamesearch, inp1);
		Thread.sleep(1000);
		Elements.TypeText(pageObjects.RegistrationActionsearch, inp2);
		Thread.sleep(1000);

	}

	@When("Select tick mark on the Action button")
	public void selectthetickmarkontheactionbutton() throws InterruptedException {

		boolean fg = Elements.TypeTextIfElementPresentornot(pageObjects.Registrationapproveimage);
		if (fg) {

			Elements.click(pageObjects.Registrationapproveimage);
		} else {

			System.out.println("Element is not displayed");
		}

		Thread.sleep(1000);

	}

	@Then("Check the status as {string}")
	public void Checkthestatusas(String inp1) throws InterruptedException {

		// Elements.TypeText(pageObjects.RegistrationUsernamesearch, inp1);
		Thread.sleep(3000);
		ss = "";
		ss = Elements.getText(pageObjects.Registrationapprovestatus);
		Assert.assertEquals(ss, inp1);

	}

	@When("Select untick mark on the Cancel button")
	public void selectunntikmarkothecancelbutton() throws InterruptedException {

		boolean bg = Elements.TypeTextIfElementPresentornot(pageObjects.Registrationcancelimage);
		if (bg) {

			Elements.click(pageObjects.Registrationcancelimage);
		} else {

			System.out.println("Element is not displayed");
		}

		Thread.sleep(1000);
	}

	@Then("enter comments in the remarks section as {string}")
	public void enterthecommentsintheremarkssection(String inp5) {

		Elements.TypeText(pageObjects.RegistrationRemarkssection, inp5);

	}

	@Then("Check the comments updated correctly or not as {string}")
	public void checkthecommentsupdatedcorrectlyornot(String inp5) {

		ss = "";
		ss = Elements.getpropert(pageObjects.RegistrationRemarkssection);
		Assert.assertEquals(inp5, ss);

	}

	@Then("Click the Support Menu")
	public void Clickthesupportmenu() throws InterruptedException {

		Elements.click(pageObjects.MerchantTickets);
		Thread.sleep(3000);
		Elements.click(pageObjects.menusupport);
		Thread.sleep(3000);

	}

	@Then("Create the ticket from merchant account with the following details as {string} and {string}")
	public void Create_the_ticket_from_merchant_account_with_the_following_detail_as(String inp1, String inp2)
			throws InterruptedException {

		Elements.click(pageObjects.MerchantNewTickets);
		Elements.TypeText(pageObjects.Merchanttickettitle, inp1);
		Thread.sleep(1000);
		Elements.TypeText(pageObjects.Merchantticketdetails, inp2);
		Thread.sleep(1000);
		Elements.click(pageObjects.Merchantticketsubmit);
		Thread.sleep(1000);
		Elements.click(pageObjects.Merchantticketpopupconfirmation);
		Thread.sleep(1000);
		Elements.click(pageObjects.LogoutImage);
		Thread.sleep(1000);
		Elements.click(pageObjects.signout);
		Thread.sleep(1000);
		Elements.click(pageObjects.signoutsurepopup);
		Thread.sleep(1000);

	}

	@Then("Check respond from the admin as {string} and {string}")
	public void Check_respond_from_the_admin_as(String inp1, String inp2) throws InterruptedException {

		Elements.click(pageObjects.Merchentmytickets);
		String hnm = "", dgh1 = "", dgh2 = "";
		String dgh = Elements.selectBysenmerchent(pageObjects.MerchentrecentTickets, inp1);
		String[] dgnh = dgh.split(":");
		int ki = 0;
		for (String hyj1 : dgnh) {

			/*
			 * String[] dgn=hyj1.split("_"); for(String hyj:dgn) {
			 */
			hnm = hyj1;
			System.out.println(hnm);

			if (ki == 0) {

				dgh1 = hnm;
				ki = ki + 1;

			} else {

				dgh2 = hnm;

			}
			// }

		}

		/*
		 * String[] dgnh=dgh.split(":"); for(String hyj1:dgnh) {
		 * 
		 * String[] dgn=dgh.split("_"); for(String hyj:dgn) { hnm=hyj;
		 * System.out.println(hnm); }
		 * 
		 * }
		 */

		// WebElement sd="//";
		Thread.sleep(1000);
		Waits.tryJavascript("arguments[0].scrollIntoView()", "//a[contains(@id,'" + dgh2 + "')]/span[1]");
		Thread.sleep(1000);
		Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])",
				Base.driver.findElement(By.xpath("//a[contains(@id,'" + dgh2 + "')]/span[1]")).getLocation().x,
				Base.driver.findElement(By.xpath("//a[contains(@id,'" + dgh2 + "')]/span[1]")).getLocation().y);
		System.out.println("//a[contains(@id,'" + dgh1 + "')]/span[1]");
		Thread.sleep(1000);
		Base.driver.findElement(By.xpath("//a[contains(@id,'" + dgh1 + "')]/span[1]")).click();
		Thread.sleep(1000);

		String[] dgn = dgh1.split("_");
		for (String hyj : dgn) {
			hnm = hyj;
			System.out.println(hnm);
		}

		String der = hnm;
		hnm = hnm + "-tt";
		/*
		 * Waits.tryJavascript("arguments[0].scrollIntoView()", "//*[@id='"+hnm+"']");
		 * Thread.sleep(1000);
		 * Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])",
		 * Base.driver.findElement(By.xpath("//*[@id='"+hnm+"']")).getLocation().x,
		 * Base.driver.findElement(By.xpath("//*[@id='"+hnm+"']")).getLocation().y);
		 * Thread.sleep(1000);
		 * Base.driver.findElement(By.xpath("//*[@id='"+hnm+"']")).sendKeys(inp2);
		 */

		Thread.sleep(1000);

		String fgt = Base.driver.findElement(By.xpath("//*[@id='" + der + "']/div/div/div[1]/ul/li[3]/div/div"))
				.getText();

		Thread.sleep(1000);

		// Elements.click(pageObjects.adminmerchantapprovalpopupokbutton);

		Thread.sleep(1000);

		Elements.click(pageObjects.LogoutImage);

		Thread.sleep(1000);

		Elements.click(pageObjects.signout);

		Thread.sleep(1000);

		Elements.click(pageObjects.signoutsurepopup);

		Thread.sleep(1000);
		Assert.assertEquals(inp2, fgt);
	}

	@Then("Click respond to the Merchant ticket as {string} and {string}")
	public void Click_respond_to_the_Merchant_ticket_as(String inp1, String inp2) throws InterruptedException {

		String hnm = "";
		String dgh = Elements.selectBysen(pageObjects.AdminrecentTickets, inp1);
		String[] dgn = dgh.split("_");
		for (String hyj : dgn) {
			hnm = hyj;
			System.out.println(hnm);
		}
		// WebElement sd="//";
		Base.driver.findElement(By.xpath("//a[contains(@id,'" + dgh + "')]")).click();
		Thread.sleep(1000);

		String der = hnm;
		hnm = hnm + "-tt";
		Waits.tryJavascript("arguments[0].scrollIntoView()", "//*[@id='" + hnm + "']");
		Thread.sleep(1000);
		Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])",
				Base.driver.findElement(By.xpath("//*[@id='" + hnm + "']")).getLocation().x,
				Base.driver.findElement(By.xpath("//*[@id='" + hnm + "']")).getLocation().y);
		Thread.sleep(1000);
		Base.driver.findElement(By.xpath("//*[@id='" + hnm + "']")).sendKeys(inp2);

		Thread.sleep(1000);

		Base.driver.findElement(By.xpath("//*[@id='ch_" + der + "']/div/div/div[3]/div/div/div/button[1]")).click();

		Thread.sleep(1000);

		Elements.click(pageObjects.adminmerchantapprovalpopupokbutton);

		Thread.sleep(1000);

		Elements.click(pageObjects.LogoutImage);

		Thread.sleep(1000);

		Elements.click(pageObjects.signout);

		Thread.sleep(1000);

		Elements.click(pageObjects.signoutsurepopup);

		Thread.sleep(1000);
	}

	@Then("Click the Support Menu in admin user")
	public void Clickthesupportmenu_in_admin_user() throws InterruptedException {

		// Elements.selectBysen(pageObjects.AdminrecentTickets);
		Elements.click(pageObjects.MerchantTickets);
		Thread.sleep(3000);
		Elements.click(pageObjects.MenuMerchant);
		Thread.sleep(3000);

	}

}
