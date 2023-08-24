package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable{
		//create the fileinputstream Obj of java with the absolute path of the address
		FileInputStream fis = new FileInputStream("./src/test/resources/faziltest.xlsx");
		//call the create () from workbookfactory class of poi library
		Workbook workbook = WorkbookFactory.create(fis);
		//call the get sheet() by specifying the sheet name
		Sheet sheet = workbook.getSheet("Sheet1");
		//call the get row() by specifying the row index value
		Row row = sheet.getRow(1);
		//call the get cell() by specifying the cell index
		Cell cell = row.getCell(1);
		//based on the type of the data call appropriate method
		//string value
		  String stringvalue = cell.getStringCellValue();
		System.out.println(stringvalue);
		workbook.close();
	}

}
