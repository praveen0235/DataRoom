package framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import baseinit.Base;

public class Elements {

	public Logger log = Logger.getLogger(Elements.class);

	public static void TypeText(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}

	public static void TypeTextIfElementPresent(WebElement element, String data) {
		if (element.isDisplayed()) {
			element.sendKeys(data);
		}
	}

	public static boolean TypeTextIfElementPresentornot(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println("Welcome");
			return true;
			// element.sendKeys(data);
		} else {
			return false;
		}

	}

	public static void clearTxtBox(WebElement element) {
		element.clear();
	}

	public static void typeRandomNumber(WebElement element, int data) {
		Random random = new Random();
		int rn = random.nextInt(100);
		String randomNumber = Integer.toString(rn);
		element.sendKeys(randomNumber);
	}

	public static String getTextBoxValue(WebElement element) {
		return element.getAttribute("value");
	}

	public static void clickcheckbox(List<WebElement> ele, String inp5) {

		for (int vb = 0; vb < ele.size(); vb++) {

			/*
			 * String s33=s10.get(vb).findElement(By.name("opt")).getAttribute("value");
			 * System.out.println(s33); s10.get(vb).findElement(By.name("opt")).click();
			 * String s19=s10.get(vb).getAttribute("id"); System.out.println(s19);
			 */
			String s12 = ele.get(vb).getText();
			System.out.println(s12);
			s12 = s12.trim();
			// s10.get(vb).click();
			if (s12.equalsIgnoreCase(inp5)) {
				// s10.get(vb).click();
				ele.get(vb).findElement(By.name("opt")).click();
				break;
			}

		}

	}

	public static String getText(WebElement element) {
		String hj = element.getText();
		System.out.println(hj);
		// return element.getText();
		return hj;
	}

	public static String getpropert(WebElement element) {
		String hj = element.getAttribute("value");
		System.out.println(hj);
		// return element.getText();
		return hj;
	}

	public static boolean VerifyTextEquals(WebElement element, String expected) {
		boolean flag = false;
		if (element.getText().equals(expected))
			return flag = true;
		return flag;
	}

	public static String getTitle() {
		return Base.driver.getTitle();
	}

	public static String getbackgroundcolor(String captcha1) {

		String getprovalue1 = Base.driver.findElement(By.xpath(captcha1)).getCssValue("border-bottom-color");
		System.out.println(getprovalue1);

		String colorname = Color.fromString(getprovalue1).asHex();
		System.out.println(colorname);
		return colorname;
	}

	public String getCurrentUrl() {
		return Base.driver.getCurrentUrl();
	}

	public boolean isSelected(WebElement element) {
		if (element.isSelected())
			return true;
		return false;
	}

	public void selectCheckBox(WebElement element) {
		if (!isSelected(element))
			element.click();
	}

	public void deSelectCheckbox(WebElement element) {
		if (isSelected(element))
			element.click();
	}

	public void selectRadioButton(WebElement element) {
		if (!isSelected(element))
			element.click();
	}

	public void deSelectRadioButton(WebElement element) {
		if (isSelected(element))
			element.click();
	}

	public boolean isEnabled(WebElement element) {
		if (element.isEnabled())
			return true;
		return false;
	}

	public static boolean isDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		}else {
			
			return false;
		}
					
	}

	public static void selectByText(WebElement element, String text) {
		// element.click();
		// List<WebElemets> sen=element.findElements(by.xp)
		Select select = new Select(element);
		select.selectByVisibleText(text);
		System.out.println("Welcome1");
	}

	/*
	 * public static void selectByTextSen(List<WebElement> element,String text){
	 * List <WebElements> optionsInnerText=
	 * driver.findElements(By.tagName("option")); for(WebElement text:
	 * optionsInnerText){ String textContent = text.getAttribute("textContent");
	 * if(textContent.toLowerCase.contains(expectedText.toLowerCase))
	 * select.selectByPartOfVisibleText(expectedText); } } }
	 */

	public static void selectByTextSen(List<WebElement> sel1, String selv) {

		for (int i = 0; i < sel1.size(); i++) {

			List<WebElement> sen = sel1.get(i).findElements(By.tagName("option"));
			int a = sen.size();
			System.out.println(a);
			int ii = 0;

			for (WebElement text : sen) {

				String textContent = text.getAttribute("textContent");
				System.out.println(textContent);
				if (textContent.contains(selv)) {
					// Select select = new Select(text);
					Select select = new Select(sel1.get(i));
					// select.selectByVisibleText(selv);
					select.selectByIndex(ii);
					break;
				}
				ii = ii + 1;
			}

		}

	}

	public static String selectBysenmerchent(List<WebElement> sel1, String imh) throws InterruptedException {

		String df = "", htn = "",htn1="";
		String df1="";
		int gh=0;

		for (int i = 0; i < sel1.size(); i++) {

			// List<WebElement> sen = sel1.get(i).findElements(By.tagName("option"));
			df = sel1.get(i).getAttribute("id");

			if(i==0) {
				
				gh=i+2;
				
			}
			
			if (gh <= sel1.size()) {

				df1 = sel1.get(i + 2).getAttribute("id");
				gh=gh+1;

			}

			System.out.println("//a[contains(@id,'" + df + "')]/span[1]");
			/*
			 * Waits.tryJavascript("arguments[0].scrollIntoView()",
			 * "//a[contains(@id,'"+df+"')]/span[1]"); //Thread.sleep(1000);
			 * Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])",
			 * Base.driver.findElement(By.xpath("//a[contains(@id,'"+df+"')]/span[1]")).
			 * getLocation().x,
			 * Base.driver.findElement(By.xpath("//a[contains(@id,'"+df+"')]/span[1]")).
			 * getLocation().y);
			 */

			htn = Base.driver.findElement(By.xpath("//a[contains(@id,'" + df + "')]/span[1]")).getText();
			htn1 = Base.driver.findElement(By.xpath("//a[contains(@id,'" + df1 + "')]/span[1]")).getText();
			System.out.println(htn);
			System.out.println(htn1);

			//if (htn == "" || htn == " " || htn.equalsIgnoreCase("") || htn.equalsIgnoreCase(" ")) {
			if (htn1 == "" || htn1 == " " || htn1.equalsIgnoreCase("") || htn1.equalsIgnoreCase(" ")) {

				// Waits.tryJavascript("arguments[0].scrollIntoView()",
				// "//a[contains(@id,'"+df+"')]/span[1]");
				System.out.println("Hai");

				// WebElement element = driver.findElement(By.id("id_of_element"));
				/*
				 * ((JavascriptExecutor)
				 * Base.driver).executeScript("arguments[0].scrollIntoView(true);",
				 * "//a[contains(@id,'"+df+"')]/span[1]"); Thread.sleep(500);
				 */
				
				/*WebElement element = Base.driver.findElement(By.xpath("//a[contains(@id,'" + df + "')]/span[1]"));
				((JavascriptExecutor) Base.driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(500);*/

				Thread.sleep(1000);
				Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])",
						Base.driver.findElement(By.xpath("//a[contains(@id,'" + df1 + "')]/span[1]")).getLocation().x,
						Base.driver.findElement(By.xpath("//a[contains(@id,'" + df1 + "')]/span[1]")).getLocation().y);
				Thread.sleep(1000);
				htn = Base.driver.findElement(By.xpath("//a[contains(@id,'" + df1 + "')]/span[1]")).getText();
				System.out.println(htn);

			}

			if (imh.equalsIgnoreCase(htn)) {
				WebElement element = Base.driver.findElement(By.xpath("//a[contains(@id,'" + df + "')]/span[1]"));
				((JavascriptExecutor) Base.driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(500);
				break;
			}

			/*
			 * List<WebElement>
			 * sf=sel1.get(i).findElements(By.xpath("//a[contains(@id,'"+df+
			 * "')]/span[1]/text()"));
			 * 
			 * for(WebElement der:sf) {
			 * 
			 * String hy=der.getText(); System.out.println(hy);
			 * 
			 * }
			 * 
			 * String drt=Base.driver.findElement(By.xpath("//a[contains(@id,'"+df+
			 * "')]/span[1]/text()")).getText();
			 */
			// System.out.println(drt);
			String hj = sel1.get(i).getText();
			System.out.println(hj);
			// int a = sen.size();
			System.out.println(df);
			int ii = 0;
			// break;

		}

		return df1+":"+df;

	}

	public static String selectBysen(List<WebElement> sel1, String imh) {

		String df = "";

		for (int i = 0; i < sel1.size(); i++) {

			// List<WebElement> sen = sel1.get(i).findElements(By.tagName("option"));
			df = sel1.get(i).getAttribute("id");
			System.out.println("//a[contains(@id,'" + df + "')]/span[1]");
			String htn = Base.driver.findElement(By.xpath("//a[@id='" + df + "']/span[1]")).getText();
			System.out.println(htn);
			if (htn.equalsIgnoreCase(imh)) {
				break;
			}

			/*
			 * List<WebElement>
			 * sf=sel1.get(i).findElements(By.xpath("//a[contains(@id,'"+df+
			 * "')]/span[1]/text()"));
			 * 
			 * for(WebElement der:sf) {
			 * 
			 * String hy=der.getText(); System.out.println(hy);
			 * 
			 * }
			 * 
			 * String drt=Base.driver.findElement(By.xpath("//a[contains(@id,'"+df+
			 * "')]/span[1]/text()")).getText();
			 */
			// System.out.println(drt);
			String hj = sel1.get(i).getText();
			System.out.println(hj);
			// int a = sen.size();
			System.out.println(df);
			int ii = 0;
			// break;

		}

		return df;

	}

	public static void selectByTextSenall(List<WebElement> sel1) {

		for (int i = 0; i < sel1.size(); i++) {

			List<WebElement> sen = sel1.get(i).findElements(By.tagName("option"));
			int a = sen.size();
			System.out.println(a);
			int ii = 0;

			for (WebElement text : sen) {

				String textContent = text.getAttribute("textContent");
				System.out.println(textContent);
				// if (textContent.contains(selv)) {
				// Select select = new Select(text);
				Select select = new Select(sel1.get(i));
				// select.selectByVisibleText(selv);
				select.selectByIndex(ii);
				String dropdo = sel1.get(i).getText();
				System.out.println(dropdo);
				WebElement option = select.getFirstSelectedOption();
				String visibletex = option.getText();
				System.out.println(visibletex);
				// break;
				// }
				// ii = ii + 1;
			}

		}

	}

	public static int getdatafromDB(String Currentexactfieldname, String Currentexactfieldname1) {

		String SQL;
		int finalcount = 0;

		for (int h = 0; h <= 1; h++) {

			String Servername = "10.20.38.154:62420", DatabaseName = "GenericPayment_new", UserID = "generic",
					Password = "Generic1", FieldDefDescription1 = "";
			int RecordChecking;

			// RecordChecking=0;
			String connectionUrl = "jdbc:jtds:sqlserver://" + Servername + "/" + DatabaseName;
			System.out.println(connectionUrl);

			// Declare the JDBC objects.
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;

			try {
				// Establish the connection.
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(connectionUrl, UserID, Password);

				// Create and execute an SQL statement that returns some data.
				if (h == 0) {
					SQL = "select count(TransactionId) from GenericPayment_new.." + Currentexactfieldname;
					System.out.println(SQL);
				} else {
					SQL = "select count(TransactionId) from GenericPayment_new.." + Currentexactfieldname1;
					System.out.println(SQL);
				}

				stmt = con.createStatement();
				rs = stmt.executeQuery(SQL);
				ResultSetMetaData metaData = rs.getMetaData();

				int rowCount = metaData.getColumnCount();
				System.out.println(rowCount);

				FieldDefDescription1 = "";

				while (rs.next()) {

					FieldDefDescription1 = rs.getString(1);
					System.out.println(FieldDefDescription1);
					RecordChecking = 1;
				}
			}

			// Handle any errors that may have occurred.
			catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (Exception e) {
					}
				if (stmt != null)
					try {
						stmt.close();
					} catch (Exception e) {
					}
				if (con != null)
					try {
						con.close();
					} catch (Exception e) {
					}
			}

			System.out.println(FieldDefDescription1);

			if (h == 0) {
				finalcount = Integer.parseInt(FieldDefDescription1);
			} else {
				finalcount = finalcount + Integer.parseInt(FieldDefDescription1);
			}

		}

		return finalcount;
	}

	public static int getdatafromsingletableDB(String Currentexactfieldname) {

		String SQL;
		int finalcount = 0;

		String Servername = "10.20.38.154:62420", DatabaseName = "GenericPayment_new", UserID = "generic",
				Password = "Generic1", FieldDefDescription1 = "";
		int RecordChecking;

		// RecordChecking=0;
		String connectionUrl = "jdbc:jtds:sqlserver://" + Servername + "/" + DatabaseName;
		System.out.println(connectionUrl);

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl, UserID, Password);

			// Create and execute an SQL statement that returns some data.
			SQL = "select count(EFTUserId) from GenericPayment_new.." + Currentexactfieldname;
			System.out.println(SQL);

			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			ResultSetMetaData metaData = rs.getMetaData();

			int rowCount = metaData.getColumnCount();
			System.out.println(rowCount);

			FieldDefDescription1 = "";

			while (rs.next()) {

				FieldDefDescription1 = rs.getString(1);
				System.out.println(FieldDefDescription1);
				RecordChecking = 1;
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}

		System.out.println(FieldDefDescription1);

		finalcount = Integer.parseInt(FieldDefDescription1);

		return finalcount;
	}

	public static int getdatafromsingletableDB1(String Currentexactfieldname) {

		String SQL;
		int finalcount = 0;

		String Servername = "10.20.38.154:62420", DatabaseName = "GenericPayment_new", UserID = "generic",
				Password = "Generic1", FieldDefDescription1 = "";
		int RecordChecking;

		// RecordChecking=0;
		String connectionUrl = "jdbc:jtds:sqlserver://" + Servername + "/" + DatabaseName;
		System.out.println(connectionUrl);

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl, UserID, Password);

			// Create and execute an SQL statement that returns some data.
			SQL = "select count(PaymentTypeId) from GenericPayment_new.." + Currentexactfieldname;
			System.out.println(SQL);

			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			ResultSetMetaData metaData = rs.getMetaData();

			int rowCount = metaData.getColumnCount();
			System.out.println(rowCount);

			FieldDefDescription1 = "";

			while (rs.next()) {

				FieldDefDescription1 = rs.getString(1);
				System.out.println(FieldDefDescription1);
				RecordChecking = 1;
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}

		System.out.println(FieldDefDescription1);

		finalcount = Integer.parseInt(FieldDefDescription1);

		return finalcount;
	}
	
	public static void selectByTextequalignorecase(List<WebElement> sel1, String selv) {

		for (int i = 0; i < sel1.size(); i++) {

			List<WebElement> sen = sel1.get(i).findElements(By.tagName("option"));
			int a = sen.size();
			System.out.println(a);
			int ii = 0;

			for (WebElement text : sen) {

				String textContent = text.getAttribute("textContent");
				System.out.println(textContent);
				if (textContent.equalsIgnoreCase(selv)) {
					// Select select = new Select(text);
					Select select = new Select(sel1.get(i));
					// select.selectByVisibleText(selv);
					select.selectByIndex(ii);
					break;
				}
				ii = ii + 1;
			}

		}

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public String getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	public static List<WebElement> getAllOptions(WebElement element) {
		Select select = new Select(element);
		return select.getOptions();
		// List<WebElement> se=select.getOptions();

		// System.out.println(se.size());
	}

	public void deSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public static void click(final WebElement element) {
		// Waits.waitUntil(() ->isDisplayed(element));
		element.click();
	}

	public static void Mouseclick(final WebElement element) {
		// Waits.waitUntil(() ->isDisplayed(element));login
		Actions action = new Actions(Base.driver);
		action.moveToElement(element).click().build().perform();
	}

	public static void mouseDoubleclick(final WebElement element) {
		// Waits.waitUntil(() ->isDisplayed(element));
		Actions action = new Actions(Base.driver);
		action.moveToElement(element).doubleClick().build().perform();
	}

	public void clickOnlyIfElementPresent(WebElement element) {
		if (isDisplayed(element))
			element.click();
	}

	public Alert getAlert() {
		return Base.driver.switchTo().alert();
	}

	public void AcceptAlert() {
		getAlert().accept();
	}

	public void DismissAlert() {
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
		return text;
	}

	public boolean isAlertPresent() {
		try {
			Base.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
	}

	public void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
	}

	public void AcceptPrompt(String text) {

		if (!isAlertPresent())
			return;

		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
	}

	public void scrollToElemet(WebElement element) {
		Waits.tryJavascript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x,
				element.getLocation().y);
	}

	public void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();
	}

	public static void scrollIntoView(WebElement element) {
		Waits.tryJavascript("arguments[0].scrollIntoView()", element);
	}

	public static void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
	}

	public void scrollDownVertically() {
		Waits.tryJavascript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollUpVertically() {
		Waits.tryJavascript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public void scrollDownByPixel() {
		Waits.tryJavascript("window.scrollBy(0,1500)");
	}

	public void scrollUpByPixel() {
		Waits.tryJavascript("window.scrollBy(0,-1500)");
	}

	public void ZoomInBypercentage() {
		Waits.tryJavascript("document.body.style.zoom='40%'");
	}

	public void ZoomBy100percentage() {
		Waits.tryJavascript("document.body.style.zoom='100%'");
	}

	public static void Dateselect(String inp3) {

		List<WebElement> date = Base.driver.findElements(By.tagName("tr"));

		for (int row = 0; row < date.size(); row++) {

			// System.out.println(date.get(row).getText());
			List<WebElement> columns = date.get(row).findElements(By.tagName("td"));

			for (int column1 = 0; column1 < columns.size(); column1++) {

				String s9 = columns.get(column1).getText();
				System.out.println(s9);

				if (s9.equalsIgnoreCase(inp3) || s9.equals(Integer.parseInt(inp3))) {

					columns.get(column1).click();
					break;

				}
			}

		}
	}

	public static void switchToParentWindow() {
		Set<String> window = Base.driver.getWindowHandles();
		// System.out.println(window.size());
		if (window.size() > 0) {
			Iterator<String> iterator = window.iterator();
			while (iterator.hasNext()) {
				String popupHandle = iterator.next().toString();
				if (!popupHandle.contains(Base.mainWindowHandle)) {
					Base.driver.close();
				}

			}
			Base.driver.switchTo().window(Base.mainWindowHandle);
		}
	}

	
	
	
	
	
	public static void switchToChild() throws InterruptedException {
		Thread.sleep(5000);
		Set<String> window = Base.driver.getWindowHandles();
		// System.out.println(window.size());
		if (window.size() > 0) {
			Iterator<String> iterator = window.iterator();
			while (iterator.hasNext()) {
				String popupHandle = iterator.next().toString();
				if (!popupHandle.contains(Base.mainWindowHandle)) {
					Base.driver.switchTo().window(popupHandle);
					Base.driver.manage().window().maximize();
				}

			}
		}
	}

}
