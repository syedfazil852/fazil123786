package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/demo.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String getExcelData(String sheetname,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("Sheet2").getRow(0).getCell(3).getStringCellValue();
		return data;
	}
}
