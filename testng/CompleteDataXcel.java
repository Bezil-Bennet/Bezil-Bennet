package testng;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompleteDataXcel {
public static void main(String[] args) throws IOException {
	XSSFWorkbook wbook = new XSSFWorkbook("./ReferenceData/CreateLead.xlsx");
	XSSFSheet sheet = wbook.getSheet("Sheet1");
	int lastRowNum = sheet.getLastRowNum();//3(index)
	short lastCellNum = sheet.getRow(1).getLastCellNum();//4(physicalno)
	
	String[][] data = new String [lastRowNum][lastCellNum];
	for (int i = 1; i <=lastRowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j <lastCellNum; j++) {
			String val = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(val);
			data [i-1] [j]= val;
			}
	}

}
}
