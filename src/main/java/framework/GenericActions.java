package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import org.codehaus.plexus.util.FileUtils;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import baseinit.Base;
import config.PropertyFileReader;
import util.Xls_Reader;

public class GenericActions {
	
	public static byte[] filesToByte(String filepath) throws IOException
	{
		File file = new File(filepath);
		//init array with file length
		byte[] bytesArray = new byte[(int) file.length()];

		FileInputStream fis = new FileInputStream(file);
		fis.read(bytesArray); //read file into bytes[]
		fis.close();

		return bytesArray;
	}
	
	public static void hitoryReports() throws IOException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss a");
		File f = new File(System.getProperty("user.dir")+"/test-output/Spark/Firefly.html");
		
		String foldername = sdf.format(f.lastModified());
		
		File theDir = new File(System.getProperty("user.dir")+"/"+"ReportsArchive/"+foldername);
		if(!theDir.exists())
		{
			theDir.mkdir();
		}
		File src = new File(System.getProperty("user.dir")+"/test-output");
		FileUtils.copyDirectoryStructure(src, theDir);
	}
	
	public static void issueUpdate(String path) throws IOException
	{
		String JSONString = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
    	 JSONString = JSONString.substring(4);
    	 JSONString = JSONString.substring(0, JSONString.length() - 1) + "";
    	JSONObject json = new JSONObject(JSONString);
        JSONArray arr = json.getJSONArray("elements");
        
     for(int j=0;j<arr.length();j++)   
     {
    	 String scenarioname = arr.getJSONObject(j).getString("name");
    	 //System.out.println(scenarioname);
    	 for(int h=0;h<=Base.rowcount;h++)
    	 {
    	 String[] EM = null;
         String stepName = null;
    		 String test = Base.suiteXLS.getCellData("TestSuite", "TestCaseDescription", h);
    	if(test.equalsIgnoreCase(scenarioname))
    	{		
    	 JSONArray d= arr.getJSONObject(j).getJSONArray("steps");
    	 for(int i = 0; i < d.length(); i++){
        	try{
        		JSONObject position = d.getJSONObject(i).getJSONObject("result");
        		String errorMessage =   position.getString("error_message");
        		EM = errorMessage.split(":",2)[1].split("}",2);
        		stepName = d.getJSONObject(i).getString("name");
               // System.out.println(EM[0]+"}");
               }catch(Exception e)
               {
            	   
               }
            
           // System.out.println(stepName);  
        } 
    	 if(EM !=null)
    	 {
    		 String msg =EM[0].replace("\r\n", "").replace("\r", "").replace("\n", "");
    		 msg = msg.replace(",", "");
    	 Base.suiteXLS.setCellData("TestSuite", "Investigations", h, "FailedStep: "+stepName.replace(",", "")+"--->ErrorDescription: " + msg +"}" );
    	 }
    	} 
    }
    }

	}
	
	public static void deleteFiles(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	                f.delete();
	        }
	    }
	}
	
	public static void deleteFolders(File folder) throws IOException {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	                FileUtils.deleteDirectory(f);
	        }
	    }
	}
	
	public static void filesDeletion() throws IOException
    {
		if(PropertyFileReader.properties.getProperty("HistoryReports").toLowerCase().equalsIgnoreCase("No"))
		{
			deleteFolders(new File(System.getProperty("user.dir")+"/"+"ReportsArchive"));
		}
		deleteFiles(new File(System.getProperty("user.dir")+"/"+"DownloadedFiles"));
    	deleteFiles(new File(System.getProperty("user.dir")+"/"+"test-output"));
    	deleteFiles(new File(System.getProperty("user.dir")+"/"+"Uploadfiles/FilesToInput"));
    	deleteFiles(new File(System.getProperty("user.dir")+"/"+"Uploadfiles/FilesToArchive"));
    }
	
	public static void date(Xls_Reader suite,String testCasedate,int rownum)
	{
		Date dNow = new Date();
    	//SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa"); 
    	
    	SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
    	String ExeTime = ft.format(dNow);
    	
    	suite.setCellData("TestSuite", testCasedate, rownum, ExeTime);
    	//suite.setCellDataasDate("TestSuite", testCasedate, rownum, ExeTime);
    	//suite.setCellData("RoughSheet", testCasedate, 2, ExeTime1);
	}
	
	public static String datecal()
	{
		Date dNow = new Date();
    	//SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa"); 
    	
    	SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
    	String ExeTime = ft.format(dNow);
    	return ExeTime;
	}
	
		public static void datediff(String testcasestart,String testcaseend,Xls_Reader suite,int rownum) throws ParseException
		{
			DateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
	    	Date startdate=ft.parse(testcasestart);
	    	Date enddate=ft.parse(testcaseend);
			long diff = enddate.getTime() - startdate.getTime();
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000);
			
			String diffdate = String.format("%02d:%02d:%02d", diffHours, diffMinutes, diffSeconds);
			
			//String diffdate =diffHours+":"+diffMinutes+":"+diffSeconds;
			suite.setCellData("TestSuite", "Timetakentofinish", rownum, diffdate);
		}

		public static void CopyContentOneWorkbookToOther(String inputSheet,String archiveSheet) throws IOException, ParseException 
		{
					  Xls_Reader insuite = new Xls_Reader(inputSheet);
					  
	                  Xls_Reader outsuite = new Xls_Reader(archiveSheet);
	                  
	                  //Xls_Reader archivedatesuite = new Xls_Reader(archiveDateSheet);
	                  
	                  XSSFSheet inputSheetName=insuite.getSheet("TestSuite");
	                  
	                  XSSFSheet outputSheet=outsuite.getSheet("TestSuite");
	                  
	                Date dNow = new Date();
	              	
	                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa"); 
	              	
	              	String ExeTime = ft.format(dNow);
	              	
	              	Date ExecutionDate = ft.parse(ExeTime);
	              	
	              	String date =insuite.getCellData("RoughSheet", "StartDateofArchireFile", 2);
	              	
	              	//To set the initial date for comparision
	              	if(date.isEmpty()||date.equalsIgnoreCase(null))
	              	{
	              		insuite.setCellData("RoughSheet", "StartDateofArchireFile", 2, ExeTime);
	              		
	              		date =insuite.getCellData("RoughSheet", "StartDateofArchireFile", 2);
	              		
	              	}
	              
	              	Date ExcelSheetDate=ft.parse(date);
	              	
	              	long diff = ExecutionDate.getTime() - ExcelSheetDate.getTime();
	              	
	              	int diffdates = (int) diff/(1000*60*60*24);
	              	
	              	//long diffdates = diff / (60 * 1000) % 60;
	                                  
	                 copySheet(inputSheetName,outputSheet,insuite,outsuite,diffdates,ExeTime,archiveSheet); 
	                 util.FileConversionXLSXToCSV.conversionStart(archiveSheet,System.getProperty("user.dir")+"/Uploadfiles/FilesToInput/"+"Selenium_"+PropertyFileReader.properties.getProperty("Product")+"_"+PropertyFileReader.properties.getProperty("Environment")+".csv");
	          }

		
		   public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet,Xls_Reader insuite,Xls_Reader outsuite,int diffdates,String ExeTime,String archiveSheet) throws ParseException, IOException 
           { 
        	   
              int inputSheetrowCount=inputSheet.getLastRowNum();
              
              int outputSheetrowCount=outputSheet.getLastRowNum();
              
              int inputSheetcoulmnCount=inputSheet.getRow(0).getLastCellNum();
              
              String outputSheetName = outputSheet.getSheetName();
              
              String inputSheetName = inputSheet.getSheetName();
                    
                if(inputSheetrowCount>0)
                {
                	if(outputSheetrowCount==0)
                	{
                		for(int i=1;i<=inputSheetrowCount;i++)
                		{
                			for(int celliteration =0;celliteration<=inputSheetcoulmnCount-1;celliteration++)
                			{
                				String colname =insuite.getCellData(inputSheetName, celliteration , 1);
                				
                				String data = insuite.getCellData(inputSheetName, celliteration , i+1);
                				
                				outsuite.setCellData(outputSheetName, colname, i+1, data);
                			}
                		}
                	}else if(diffdates>=7)
                	{
                		insuite.setCellData("RoughSheet", "StartDateofArchireFile", 2, ExeTime);
                	
                	List<String> list = new ArrayList<String>();
                	
                	 LocalDateTime dNow =  LocalDateTime.now();
                   	
                     LocalDateTime dthen = dNow.minusDays(6);
                     
                     DateTimeFormatter ft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                   	
                   	String SevendaysBackDate = ft.format(dthen);
                   //	list.add(SevendaysBackDate);
                	
                	for(int j=2;j<=outputSheetrowCount;j++)
                	{
                		String data = outsuite.getCellData("TestSuite", "TestStartedTime", j);
                		
                		SimpleDateFormat ftd = new SimpleDateFormat("yyyy-MM-dd"); 
                		Date ExecutionStartDate = ftd.parse(data);
                		
                		String excelDate = ftd.format(ExecutionStartDate);
                		
                		if(!SevendaysBackDate.equalsIgnoreCase(excelDate))
                		{
                			list.add(data);
                		}else
                		{
                			break;
                		}
                		
                	}
                	
                    //specify the row index from where to delete
                    int rowIndex =1;
                	//deleting the rows
                    if (rowIndex >= 0 && rowIndex < list.size()) {
                    	
                    	outputSheet.shiftRows(rowIndex+list.size(), outputSheetrowCount, -list.size(), true,true);
                    }        
                    
                    FileOutputStream outFile = new FileOutputStream(new File(archiveSheet));
                    outsuite.workbook.write(outFile);
                    outFile.close();
                	
                    Xls_Reader changedoutsuite = new Xls_Reader(archiveSheet);
                    
                    int changedoutputSheetrowCount= changedoutsuite.getSheet("TestSuite").getLastRowNum();
                    
                    for(int k = 1;k<=changedoutputSheetrowCount;k++)
                    {
                    	String coln =insuite.getCellData(inputSheetName, 0 , 1);
            			
                    	changedoutsuite.setCellData(outputSheetName,coln , k+1, String.valueOf(k));
                    }
                    
                    int rowcount =2;
            		
            		for(int i=changedoutputSheetrowCount;i<=(changedoutputSheetrowCount+inputSheetrowCount)-1;i++)
            		{
            			String coln =insuite.getCellData(inputSheetName, 0 , 1);
            			
            			changedoutsuite.setCellData(outputSheetName,coln , i+2, String.valueOf(i+1));
            			
            			for(int celliteration =1;celliteration<=inputSheetcoulmnCount-1;celliteration++)
            			{
            				String colname =insuite.getCellData(inputSheetName, celliteration , 1);
            				
            				String data1 = insuite.getCellData(inputSheetName, celliteration , rowcount);
            				
            				changedoutsuite.setCellData(outputSheetName, colname, i+2, data1);
            			}
            			rowcount++;
            		}
                    
                	}else
                	{
                		int rowcount =2;
                		
                		for(int i=outputSheetrowCount;i<=(outputSheetrowCount+inputSheetrowCount)-1;i++)
                		{
                			String coln =insuite.getCellData(inputSheetName, 0 , 1);
                			
                			outsuite.setCellData(outputSheetName,coln , i+2, String.valueOf(i+1));
                			
                			for(int celliteration =1;celliteration<=inputSheetcoulmnCount-1;celliteration++)
                			{
                				String colname =insuite.getCellData(inputSheetName, celliteration , 1);
                				
                				String data = insuite.getCellData(inputSheetName, celliteration , rowcount);
                				
                				outsuite.setCellData(outputSheetName, colname, i+2, data);
                			}
                			rowcount++;
                		}
                		
                	}
                	
                }
	}

    
           public static void OneWorkbookToOtherArchive(String inputSheet,String archiveSheet) throws IOException, ParseException 
   		{
   					  Xls_Reader insuite = new Xls_Reader(inputSheet);
   					  
   	                  Xls_Reader outsuite = new Xls_Reader(archiveSheet);
   	                  
   	                  //Xls_Reader archivedatesuite = new Xls_Reader(archiveDateSheet);
   	                  
   	                  XSSFSheet inputSheetName=insuite.getSheet("TestSuite");
   	                  
   	                  XSSFSheet outputSheet=outsuite.getSheet("TestSuite");
   	                  
   	                Date dNow = new Date();
   	              	
   	                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa"); 
   	              	
   	              	String ExeTime = ft.format(dNow);
   	              	
   	              	Date ExecutionDate = ft.parse(ExeTime);
   	              	
   	              	String date =insuite.getCellData("RoughSheet", "StartDateofArchireFile", 2);
   	              	
   	              	//To set the initial date for comparision
   	              	if(date.isEmpty()||date.equalsIgnoreCase(null))
   	              	{
   	              	insuite.setCellData("RoughSheet", "StartDateofArchireFile", 2, ExeTime);
   	              		
   	              		date =insuite.getCellData("RoughSheet", "StartDateofArchireFile", 2);
   	              		
   	              	}
   	              	
   	              	
   	              	Date ExcelSheetDate=ft.parse(date);
   	              	
   	              	long diff = ExecutionDate.getTime() - ExcelSheetDate.getTime();
   	              	
   	              	//int diffdates = (int) diff/(1000*60*60*24);
   	              	
   	              	int diffdates = (int) (diff / (60 * 1000) % 60);
   	                                  
   	             copySheetArchive(inputSheetName,outputSheet,insuite,outsuite,diffdates,ExeTime,archiveSheet);
   	             util.FileConversionXLSXToCSV.conversionStart(archiveSheet,System.getProperty("user.dir")+"/Uploadfiles/FilesToArchive/"+"Selenium_"+PropertyFileReader.properties.getProperty("Product")+"_"+PropertyFileReader.properties.getProperty("Environment")+"_Archive"+".csv");
   	          }

   	           public static void copySheetArchive(XSSFSheet inputSheet,XSSFSheet outputSheet,Xls_Reader insuite,Xls_Reader outsuite,long diffdates,String ExeTime,String archiveSheet) throws ParseException, IOException 
   	           { 
   	        	   
   	              int inputSheetrowCount=inputSheet.getLastRowNum();
   	              
   	              int outputSheetrowCount=outputSheet.getLastRowNum();
   	              
   	              int inputSheetcoulmnCount=inputSheet.getRow(0).getLastCellNum();
   	              
   	              String outputSheetName = outputSheet.getSheetName();
   	              
   	              String inputSheetName = inputSheet.getSheetName();
   	                    
   	                if(inputSheetrowCount>0)
   	                {
   	                	if(outputSheetrowCount==0)
   	                	{
   	                		for(int i=1;i<=inputSheetrowCount;i++)
   	                		{
   	                			for(int celliteration =0;celliteration<=inputSheetcoulmnCount-1;celliteration++)
   	                			{
   	                				String colname =insuite.getCellData(inputSheetName, celliteration , 1);
   	                				
   	                				String data = insuite.getCellData(inputSheetName, celliteration , i+1);
   	                				
   	                				outsuite.setCellData(outputSheetName, colname, i+1, data);
   	                			}
   	                		}
   	                	}else
   	                	{
   	                		int rowcount =2;
   	                		
   	                		for(int i=outputSheetrowCount;i<=(outputSheetrowCount+inputSheetrowCount)-1;i++)
   	                		{
   	                			String coln =insuite.getCellData(inputSheetName, 0 , 1);
   	                			
   	                			outsuite.setCellData(outputSheetName,coln , i+2, String.valueOf(i+1));
   	                			
   	                			for(int celliteration =1;celliteration<=inputSheetcoulmnCount-1;celliteration++)
   	                			{
   	                				String colname =insuite.getCellData(inputSheetName, celliteration , 1);
   	                				
   	                				String data = insuite.getCellData(inputSheetName, celliteration , rowcount);
   	                				
   	                				outsuite.setCellData(outputSheetName, colname, i+2, data);
   	                			}
   	                			rowcount++;
   	                		}
   	                		
   	                	}
   	                	
   	                }
   		}   	     

}
