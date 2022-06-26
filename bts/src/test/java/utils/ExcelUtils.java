package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static XSSFWorkbook wb;
	
	public ExcelUtils() throws Throwable {
		File file=new File("src/test/resources/testDatas/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
	}
	
	public String readData(String sheetName, int rowNo, int cellNo ) throws Throwable {
		String value=wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		return value;
	}

}
