package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FirstAndLastRowLimitation {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int firstrowindex = sheet.getFirstRowNum();
		System.out.println(firstrowindex);
		int lastrowindex = sheet.getLastRowNum();
		System.out.println(lastrowindex);
		workbook.close();
	}
}
