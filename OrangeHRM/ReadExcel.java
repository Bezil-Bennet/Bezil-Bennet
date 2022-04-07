package OrangeHRM;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
public static String[][] readData(String filename) throws IOException{
	XSSFWorkbook wb = new XSSFWorkbook("./data/"+filename+".xlsx");
	XSSFSheet sheet = wb.getSheet("Sheet1");
	int rCount = sheet.getPhysicalNumberOfRows();
	int cCount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(rCount+","+cCount);
	String[][] data = new String[rCount][cCount];
	for (int i = 1; i < rCount ; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < cCount; j++) {
			String value =row.getCell(j).getStringCellValue();
			data[i][j]=value;
		}
	}
	wb.close();
    return data;
	
}
}
