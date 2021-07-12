package baseinit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.ParseException;

import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import config.ConfigurationReader;
import config.PropertyFileReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import framework.Browser;
import framework.GenericActions;
import framework.Waits;
import stepDefinitions.Steps;
import util.PathHelper;
import util.Xls_Reader;
import util.FileConversionXLSXToCSV2;


public class Base {
	
	public static Logger log=Logger.getLogger(Base.class);
	public static String mainWindowHandle;
	public static WebDriver driver;
	public static ConfigurationReader reader;
	public static Boolean firstIterationRun;
	public static Xls_Reader suiteXLS = new Xls_Reader(PathHelper.getBasePath()+"/test-output/ExcelReport/ExcelReport.xlsx");
	public static int rowcount = suiteXLS.getRowCount("TestSuite");
	//static int i=2;
	String date;
	
	@Before
	public void BrowsersetUp(Scenario browser){
		log.info("Scenario Started: "+browser.getName());
		Browser.startBrowser();
		Browser.maximize();
		mainWindowHandle=driver.getWindowHandle();
		
		date=GenericActions.datecal();
				
				//GenericActions.date(suiteXLS, "TestStartedTime", i);
				
	}
	
	
	
	@After
	
	public void closeBrowser(Scenario scenario) throws ParseException, IOException{
		
		if(scenario.isFailed()){
			
			scenario.embed(Browser.takeScreenshot(scenario), "image/png");
			/*for(int i=1;i<=rowcount;i++)
			{
				if(suiteXLS.getCellData("TestSuite", "TestCaseDescription", i).equalsIgnoreCase(scenario.getName()))
				{
					suiteXLS.setCellData("TestSuite", "Investigations", i, "Unable to locate the element");
					break;
				}
			}*/
			//Browser.takeScreenshot(scenario);
		}
		for(int i=2;i<=rowcount;i++)
		{
			
			if((suiteXLS.getCellData("TestSuite", "TestCaseDescription", i).trim().equalsIgnoreCase(scenario.getName().trim()))||(suiteXLS.getCellData("TestSuite", "URL", i).trim()).contains(Steps.scenarioName.trim()))
			{
				suiteXLS.setCellData("TestSuite", "TestStartedTime", i, date);
				suiteXLS.setCellData("TestSuite", "Investigations", i, "");
				suiteXLS.setCellData("TestSuite", "Product", i, PropertyFileReader.properties.getProperty("Product"));
				suiteXLS.setCellData("TestSuite", "Browser", i, PropertyFileReader.properties.getProperty("browser"));
		
				suiteXLS.setCellData("TestSuite", "Environment", i, PropertyFileReader.properties.getProperty("Environment"));
				suiteXLS.setCellData("TestSuite", "Result", i, String.valueOf(scenario.getStatus()));
				GenericActions.date(suiteXLS, "TestEndedTime", i);
				String startdate= suiteXLS.getCellData("TestSuite", "TestStartedTime", i);
				String Enddate= suiteXLS.getCellData("TestSuite", "TestEndedTime", i);
				GenericActions.datediff(startdate, Enddate, suiteXLS, i);
				break;
			}
		}
		
		
		log.info("Scenario Completed: "+scenario.getName());
		log.info("Scenario Status is: "+scenario.getStatus());
		//Base.driver.quit();
		try
		 {
			 if (SystemUtils.IS_OS_WINDOWS)
			    { 
				 	Runtime.getRuntime().exec("taskkill /F /PID "+Browser.chromeDriverProcessID);
				 	Runtime.getRuntime().exec("taskkill /F /PID "+Browser.chromeProcessID);
				 	driver.quit();
				 	
			    }else if(SystemUtils.IS_OS_LINUX)
			    {
			    	Runtime.getRuntime().exec("sudo kill "+Browser.chromeDriverProcessID);
			    	Runtime.getRuntime().exec("sudo kill "+Browser.chromeProcessID);
			    }
		 }catch(Exception e)
		 {
			 
		 }
		//scenario.write("Lanched URL");
		String inputfilename = "Selenium_"+PropertyFileReader.properties.getProperty("Product")+"_"+PropertyFileReader.properties.getProperty("Environment")+".csv";
		
		String outfilename = "Selenium_"+PropertyFileReader.properties.getProperty("Product")+"_"+PropertyFileReader.properties.getProperty("Environment")+"_Archive"+".csv";
		
		util.FileConversionXLSXToCSV2.conversionStart(PathHelper.getBasePath()+"/test-output/ExcelReport/ExcelReport.xlsx",System.getProperty("user.dir")+"/Uploadfiles/FilesToArchive/"+"Selenium_"+PropertyFileReader.properties.getProperty("Product")+"_"+PropertyFileReader.properties.getProperty("Environment")+"_Archive"+".csv");
		 
		 util.FileConversionXLSXToCSV2.conversionStart(PathHelper.getBasePath()+"/test-output/ExcelReport/ExcelReport.xlsx",System.getProperty("user.dir")+"/Uploadfiles/FilesToInput/"+"Selenium_"+PropertyFileReader.properties.getProperty("Product")+"_"+PropertyFileReader.properties.getProperty("Environment")+".csv");
		 
		FileUtils.copyFile(new File(System.getProperty("user.dir")+"/Uploadfiles/FilesToInput/"+inputfilename), Paths.get(PropertyFileReader.properties.getProperty("InputFilePathToR14")+inputfilename).toFile());
		 
		 FileUtils.copyFile(new File(System.getProperty("user.dir")+"/Uploadfiles/FilesToArchive/"+outfilename), Paths.get(PropertyFileReader.properties.getProperty("OutPutFilePathToR14")+outfilename).toFile());
		 
		// i++;
		}
	
	
	
	 
	}


