package testng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleDataXcel {
public static void main(String[] args) throws IOException {
	XSSFWorkbook wbook = new XSSFWorkbook("./ReferenceData/CreateLead.xlsx");
	XSSFSheet sheet = wbook.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(0);
	String value = cell.getStringCellValue();
	System.out.println(value);
	
	
	
	
	
}



}
