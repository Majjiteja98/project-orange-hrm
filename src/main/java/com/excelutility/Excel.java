package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public  String excel_username(int a) throws IOException 
	{
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT65\\.eclipse\\Orange\\data\\xldata.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("valid1");
			  String un=sheet.getRow(a).getCell(0).getStringCellValue();
			  
            
		return un;
}
	public  String excel_password(int b) throws IOException 
	{
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT65\\.eclipse\\Orange\\data\\xldata.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("valid1");
		  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		  
return pwd;
}
}
