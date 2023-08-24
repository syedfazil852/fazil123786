package datadriventesting;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLastCellLimitationinRow {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row dayrow = sheet.getRow(0);
		short firstdaycell = dayrow.getFirstCellNum();
		System.out.println(firstdaycell);
		short lastdaycell = dayrow.getLastCellNum();
		System.out.println(lastdaycell);
		workbook.close();
		
	}
}
