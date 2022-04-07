package lenTNg;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
//xlsx
//if xls-->HSSF
//workbook>sheet>row>cell
public class ReadExcel {
public static String[][] readData(String filename) throws IOException {
	//step 1:locate workbook
	XSSFWorkbook wb = new XSSFWorkbook ("./data/"+filename+".xlsx");
	//step2. get into worksheet
	XSSFSheet ws= wb.getSheet("Sheet1");
	int rowCount = ws.getLastRowNum();
	//System.out.println("RowCount" +rowCount);
	//System.out.println("correct row count:" +ws.getPhysicalNumberOfRows());
	short cellCount = ws.getRow(0).getLastCellNum();//--->same as physicalcount
	//System.out.println("CellCount:" +cellCount);
	//System.out.println("crt cell count" +ws.getRow(0).getPhysicalNumberOfCells());
	//step3. get into row
	//step4. get into cell
	//step5. read data
	//step6. close
		//wb.close(); 
	//integrate with dataprovider
	String data[][] = new String [rowCount][cellCount];
	for (int i = 1; i <= rowCount; i++) {
		XSSFRow row = ws.getRow(i);
		for (int j = 0; j < cellCount; j++) {
			String value =row.getCell(j).getStringCellValue();
            System.out.println(value);
            data [i-1][j]=value;
		 }
	}
	return data;
	
}
}    
