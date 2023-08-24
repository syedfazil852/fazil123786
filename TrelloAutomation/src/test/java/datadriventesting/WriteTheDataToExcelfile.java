package datadriventesting;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataToExcelfile {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("fazil");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.xlsx");
		workbook.write(fos);
	}

}
