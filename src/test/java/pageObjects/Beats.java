package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Beats {

	public  WebDriver driver1;
	public Beats(WebDriver driver2){
		
		driver1=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//*[@id='loginpop']")
	public static WebElement login;
	
	@FindBy(xpath="//*[@id='login_loginCtrl_UserName']")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id='login_loginCtrl_Password']")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id='login_loginCtrl_btnLogin']")
	public static WebElement Login1;
	
	public void callurl(String url) throws InterruptedException{
		
		Thread.sleep(15000);
	}
	
	public void loginpress(){
	
		login.click();
	}
	
	
	public void usernameinput(String username1){
		
		username.clear();
		username.sendKeys(username1);
		
	}
	
	public void pwd(String pwd1){
	
		password.clear();
		password.sendKeys(pwd1);
		
	}
	
	
	public void loginpress1(){
		Login1.click();
	}
	
}
