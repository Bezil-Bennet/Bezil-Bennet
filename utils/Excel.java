package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excel {
	@DataProvider
public static String[][] takeData(String fname) throws IOException {
	
	XSSFWorkbook wb = new XSSFWorkbook("./excel/"+fname+".xlsx");
	XSSFSheet ws = wb.getSheet("Sheet1");
	int rowNum = ws.getLastRowNum();
	short cellNum = ws.getRow(0).getLastCellNum();
	System.out.println(rowNum+","+cellNum);
	String [][] data = new String [rowNum][cellNum];
	for (int i = 1; i <=rowNum; i++) {
		for (int j = 0; j < cellNum; j++) {
			String value = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
			data[i-1][j]=value;
		}
	}
	
	return data;
	
	
	
	
}
}
