package stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestUtil {
	static XSSFCell d;
	public static void main(String[] args) throws IOException {
		getDataFromSheet();
	}
	public static void getDataFromSheet() throws IOException {
	    XSSFWorkbook xssfworkbook=new XSSFWorkbook("C:/Users/malla/eclipse-workspace/CucumberJunit/excel/ExcelReader.xlsx");
		XSSFSheet xssfsheet=xssfworkbook.getSheet("ExcelData1");
	    int TotalrowCount = xssfsheet.getPhysicalNumberOfRows();
	   
	    System.out.println(TotalrowCount);
	    
	   for(int row=0;row<TotalrowCount;row++) {
		   
		   for(int col=0;col<xssfsheet.getRow(row).getLastCellNum();col++) {
			   try {
				d = xssfsheet.getRow(row).getCell(col);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			   String d1 = xssfsheet.getRow(row).getCell(col).toString();
			  System.out.println(d1);
			   System.out.println();
			   if(d1=="FirstName") {
				   XSSFCell d = xssfsheet.getRow(row).getCell(col);
			   }
			  
		   }
		   
		 
	   }
	    
	    
	    
	    
	    }
	}
	


