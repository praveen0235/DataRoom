package util;


import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import config.PropertyFileReader;
import driverScript.DriverScript;


public class EmailUtil
{
	/*public static void SendEmail(Xls_Reader suiteFile) throws IOException 
	{     
	  try 
      {
		  
		  ArrayList<String> status = DriverScript.summary(suiteFile);
		  String exeDate = getExecutionDate();
		 // String dashBoardImg = getDashboardScreenshot();
		  //String localHostLink = getIpAddress();
		  Properties prop = new Properties();
          FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\PropertiesFile\\config.properties");
          prop.load(fs);
		  String to = CONFIG.getProperty("EmailIdsToBeSent");
          String from = CONFIG.getProperty("FromEmailId");
          Properties properties = System.getProperties();
          properties.setProperty("mail.smtp.host", "10.110.220.82");
          Session session = Session.getDefaultInstance(properties);
          MimeMessage message = new MimeMessage(session);
          message.setFrom(new InternetAddress(from));
          String[] receipt = to.split(";");
          for(String toReceipt:receipt)
          {
        	  message.addRecipient(Message.RecipientType.TO,new InternetAddress(toReceipt));
          }
          MimeMultipart multipart = new MimeMultipart("related");
          message.setSubject("Lynx Automation Test Report for - " + CONFIG.getProperty("ProjectName") + "_" + exeDate);
          BodyPart messageBodyPart1 = new MimeBodyPart();
          String htmlText = "Hi Team,<br><br><br> Please find below the <b>Automation Test Result for " +CONFIG.getProperty("ProjectName") + "</b> Summary Details and Screen shot. "
          		+ "<br><br>"+status.get(0)+ "<br> "
          		+ "<br>"+status.get(1)+ "<br> "
          		+ "<br>"+status.get(2)+ "<br> "
          		+ "<br>"+status.get(3)+ "<br> ";
          		//+ "<br><img src=\"cid:image\"><br><br><br><a href= "+localHostLink+">Please use this URL to check the Test Report</a><br>";
          String htmlText = "Hi Team,<br><br><a href= "+localHostLink+">Please use this URL to check Beats Automation Test Result</a><br><br>";
          messageBodyPart1.setContent(htmlText, "text/html");
          multipart.addBodyPart(messageBodyPart1);
          
          //paste dashboard screeshot
          messageBodyPart1 = new MimeBodyPart(); 
          DataSource fds = new FileDataSource(dashBoardImg);
          messageBodyPart1.setDataHandler(new DataHandler(fds));
          messageBodyPart1.setHeader("Content-ID", "<image>");
          
          //attach report file
          MimeBodyPart attachReportFile = new MimeBodyPart();
          String reportFilename = getfileName();  
          DataSource source = new FileDataSource(System.getProperty("user.dir")+"\\Reports\\" + reportFilename);  
          attachReportFile.setDataHandler(new DataHandler(source));  
          attachReportFile.setFileName(reportFilename);

          multipart.addBodyPart(messageBodyPart1);
          //multipart.addBodyPart(attachReportFile);
          message.setContent(multipart);
          Transport.send(message);
          System.out.println("Sent message successfully....");
          
      } catch (MessagingException mex) 
	  {
         mex.printStackTrace();
      }
   }
	
*/	public static String getIpAddress() throws UnknownHostException
	{
		String appendedLocalHost = "";
		String fileName = getfileName();
		try
		{
			/*InetAddress ipAddr = InetAddress.getLocalHost();
			String ipAddress = ipAddr.getHostAddress();
			appendedLocalHost = "\\\\" + ipAddress + "\\Reports\\"+fileName;*/
			appendedLocalHost = System.getProperty("user.dir")+"\\Result\\HTMLOutput\\"+fileName;
		}
		/*catch(UnknownHostException e)
		{
			System.out.println("Unknown Host");
		}*/
		catch(Exception e)
		{
			
		}
		return appendedLocalHost;
	}
	
	private static String getfileName() 
	{
		File dir = new File(System.getProperty("user.dir")+"\\Result\\HTMLOutput");
	    File[] files = dir.listFiles();
	    String fileName = null;
	    
	    if (files == null || files.length == 0) 
	    {
	        return null;
	    }

	    File lastModifiedFile = files[0];
	    for (int i = 0; i <files.length; i++) 
	    {
	    	if (lastModifiedFile.lastModified() <= files[i].lastModified()) 
	    	{
	           lastModifiedFile = files[i];
	           fileName = lastModifiedFile.getName();
	           
	    	}
	    }
	    return fileName.toString();
	}
	
	/*private static String getDashboardScreenshot() 
	{
		String image="";
		try
		{
			String host = getIpAddress();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\Chromedriver\\chromedriver\\chromedriver.exe");
			GenericActions.driver = new ChromeDriver();
			GenericActions.driver.get(host);
			GenericActions.driver.get(host);
			GenericActions.driver.manage().window().maximize();
			Thread.sleep(1500);
			WebDriverWait wait = new WebDriverWait(GenericActions.driver, 240);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dashboard-view']")));
			GenericActions.driver.findElement(By.xpath("//a[@class='dashboard-view']")).click();
			File scrFile = ((TakesScreenshot)GenericActions.driver).getScreenshotAs(OutputType.FILE);
			image = scrFile.toString();
			Thread.sleep(5000);
			GenericActions.driver.close();
		}
		catch(Exception e)
		{
			System.out.println("Unable to get Report DashBoard Screen Shot");
		}
		
		return image;
	}*/
	
	public static String getExecutionDate()
	{
		Date dNow = new Date();
    	SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yyyy"); 
    	String strTimeOfExecution = ft.format(dNow);
		return strTimeOfExecution;
	}
	
	public static void sendEmailAfterLogs() throws IOException 
	{     
	  try 
      {
		  
		  String exeDate = getExecutionDate();
		  String to = PropertyFileReader.properties.getProperty("EmailIdsToBeSent");
          String from = PropertyFileReader.properties.getProperty("FromEmailId");
          Properties properties = System.getProperties();
          properties.setProperty("mail.smtp.host", "10.110.220.82");
          Session session = Session.getDefaultInstance(properties);
          MimeMessage message = new MimeMessage(session);
          message.setFrom(new InternetAddress(from));
          String[] receipt = to.split(";");
          for(String toReceipt:receipt)
          {
        	  message.addRecipient(Message.RecipientType.TO,new InternetAddress(toReceipt));
          }
          MimeMultipart multipart = new MimeMultipart("related");
          message.setSubject("Firefly Automation Test Report for - " +  PropertyFileReader.properties.getProperty("ProjectName") + "_" + exeDate);
          BodyPart messageBodyPart1 = new MimeBodyPart();
          String htmlText = "Hi Team,<br><br><br> Please find below the <b>Automation Test Result for " +PropertyFileReader.properties.getProperty("ProjectName") + "</b> Summary Details and Screen shot. ";
          messageBodyPart1.setContent(htmlText, "text/html");
          DataSource src = new FileDataSource(System.getProperty("user.dir")+"\\test-output\\Spark\\Firefly.html");
          messageBodyPart1.setDataHandler(new DataHandler(src));
          messageBodyPart1.setFileName(System.getProperty("user.dir")+"\\test-output\\Spark\\Firefly.html");
          multipart.addBodyPart(messageBodyPart1);
          message.setContent(multipart);
          Transport.send(message);
          System.out.println("Sent message successfully....");
          
      } catch (MessagingException mex) 
	  {
         mex.printStackTrace();
      }
   }
	
	/*public static void sendEmailAfterRecovery(Xls_Reader suiteFile, String execution) throws IOException 
	{     
	  try 
      {
		  
		  ArrayList<String> status = DriverScript.summary(suiteFile);
		  String exeDate = getExecutionDate();
		  String to = CONFIG.getProperty("EmailIdsToBeSent");
          String from = CONFIG.getProperty("FromEmailId");
          Properties properties = System.getProperties();
          properties.setProperty("mail.smtp.host", "10.110.220.82");
          Session session = Session.getDefaultInstance(properties);
          MimeMessage message = new MimeMessage(session);
          message.setFrom(new InternetAddress(from));
          String[] receipt = to.split(";");
          for(String toReceipt:receipt)
          {
        	  message.addRecipient(Message.RecipientType.TO,new InternetAddress(toReceipt));
          }
          MimeMultipart multipart = new MimeMultipart("related");
          message.setSubject("Lynx Automation Test Report for - " + CONFIG.getProperty("ProjectName") + "_" + exeDate + " - " + execution);
          BodyPart messageBodyPart1 = new MimeBodyPart();
          String htmlText = "Hi Team,<br><br><br> Please find below the <b>Automation Test Result for " +CONFIG.getProperty("ProjectName") + "</b> Summary Details and Screen shot. "
          		+ "<br><br>"+status.get(0)+ "<br> "
          		+ "<br>"+"Failed Scenarios Executed : " + DriverScript.failedScenarios.size()+ "<br> "
          		+ "<br>"+status.get(2)+ "<br> "
          		+ "<br>"+status.get(3)+ "<br> ";
          messageBodyPart1.setContent(htmlText, "text/html");
          multipart.addBodyPart(messageBodyPart1);
          multipart.addBodyPart(messageBodyPart1);
          message.setContent(multipart);
          Transport.send(message);
          System.out.println("Sent message successfully....");
          
      } catch (MessagingException mex) 
	  {
         mex.printStackTrace();
      }
   }
*/	
}

/*import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import com.sendgrid.Attachments;
import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Personalization;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

import config.PropertyFileReader;

public class EmailUtil {
	
	private static String getfileName() 
	{
		File dir = new File(System.getProperty("user.dir")+"/test-output/Spark");
	    File[] files = dir.listFiles();
	    String fileName = null;
	    
	    if (files == null || files.length == 0) 
	    {
	        return null;
	    }

	    File lastModifiedFile = files[0];
	    for (int i = 0; i <files.length; i++) 
	    {
	    	if (lastModifiedFile.lastModified() <= files[i].lastModified()) 
	    	{
	           lastModifiedFile = files[i];
	           fileName = lastModifiedFile.getName();
	           
	    	}
	    }
	    return fileName.toString();
	}
	
	public static String getExecutionDate()
	{
		Date dNow = new Date();
    	SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yyyy"); 
    	String strTimeOfExecution = ft.format(dNow);
		return strTimeOfExecution;
	}
	
	public static void sendEmailAfterLogs() throws IOException 
	{     
	  try 
      {
		  
		 // ArrayList<String> status = DriverScript.summary(suiteFile);
		  String exeDate = getExecutionDate();
          Email from = new Email(PropertyFileReader.properties.getProperty("FromEmailId"));
          String toEmailList = PropertyFileReader.properties.getProperty("EmailIdsToBeSent");
          String subject = "Automation Test Report for - " + PropertyFileReader.properties.getProperty("Product") + "_" + exeDate + " - " + "Initial Execution";
          Email to = new Email("senthilvelan.venugopal@exelaonline.com");
          String htmlText = "Hi Team,<br><br><br> Please find the <b>Automation Test Result for " +PropertyFileReader.properties.getProperty("Product") + "</b> Summary Details and Screen shot. ";
  	    
  	    Personalization personalization = new Personalization();
  	    personalization.addTo(new Email("senthilvelan.venugopal@exelaonline.com"));
  	    Content content = new Content("text/html", htmlText);
  	    Mail mail = new Mail(from, subject, to, content);
  	    String[] receipt = toEmailList.split(";");
          for(int toemail =0;toemail <= receipt.length-1;toemail++)
          {
        	  mail.personalization.get(toemail).addTo(new Email(receipt[toemail]));
          }
          
          if(PropertyFileReader.properties.getProperty("HtmlReportAttachment").toLowerCase().equalsIgnoreCase("yes"))
          {
          String reportFilename = getfileName(); 
          Path file = Paths.get(System.getProperty("user.dir")+"/test-output/Spark" + reportFilename);
          Attachments attachments = new Attachments();
          attachments.setFilename(file.getFileName().toString());
          attachments.setType("application/html");
          attachments.setDisposition("attachment");

          byte[] attachmentContentBytes = Files.readAllBytes(file);
          String attachmentContent = Base64.getEncoder().encodeToString(attachmentContentBytes);
          attachments.setContent(attachmentContent);
          mail.addAttachments(attachments);
          }
  	    SendGrid sg = new SendGrid(System.getenv(PropertyFileReader.properties.getProperty("APIKey")));
  	    Request request = new Request();
  	    try {
  	      request.setMethod(Method.POST);
  	      request.setEndpoint("mail/send");
  	      request.setBody(mail.build());
  	      Response response = sg.api(request);
  	      System.out.println("Email Sent message successfully....");
  	    }catch (IOException ex) {
  	    
  	    	System.out.println("Problem in sending the Email....");
  	     // throw ex;
  	    }
          
      } catch (IOException mex) 
	  {
    	  System.out.println("SMTP email has not connected....");
      }
   }



}
*/