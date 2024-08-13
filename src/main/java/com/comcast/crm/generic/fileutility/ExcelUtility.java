package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readdatafromexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException
	{
		String data="";
		FileInputStream fi =new FileInputStream("./testdata/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		try
		{
			data=wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			wb.close();
			
		}
		return data;
	}
		public int getLastrow(String sheetname) throws EncryptedDocumentException, IOException
		{
			FileInputStream fi =new FileInputStream("./testdata/Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fi);
			int data=wb.getSheet(sheetname).getLastRowNum();
			wb.close();
			return data;
		}
		
		public void setdatafromexcel(String sheetname,int rowno,int cellno,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fi =new FileInputStream("./testdata/Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fi);
			wb.createSheet(sheetname).createRow(rowno).createCell(cellno).setCellValue(data);
			
			FileOutputStream f =new FileOutputStream("./testdata/Book1.xlsx");
			wb.write(f);
			wb.close();
			
		}
		
		
		
		
	
}
