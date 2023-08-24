package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcelfile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		int count = workbook.getSheet("sheet1").getLastRowNum();
		for(int i=0;i<=count;i++)
		{
			String s = workbook.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
			System.out.println(s);
		}
		
}}
